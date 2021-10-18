package fx_orders;

import java.net.URL;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class OrdersController implements Initializable{
	
	private BookDAO bookdao;
	private CustomerDAO customerdao;
	private OrdersDAO ordersdao;
	private TableView table;
	
	private int Customerid;
	private int Bookid;

    @FXML
    private TextField txtOrderid;

    @FXML
    private TextField txtSaleprice;

    @FXML
    private ComboBox<Customer> comboCustomer;

    @FXML
    private ComboBox<Book> comboBook;

    @FXML
    private DatePicker txtOrderdate;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSelectByCondition;

    @FXML
    private Button btnSelectAll;

    @FXML
    private Button btnClear;

    @FXML
    private TextArea txtMassage;

    @FXML
    private BorderPane rightPanel;

    @FXML
    void clear(ActionEvent event) {
    	txtOrderid.setText(null);
    	comboCustomer.getSelectionModel().clearSelection();
    	comboBook.getSelectionModel().clearSelection();
    	txtSaleprice.setText(null);
    	txtOrderdate.getEditor().setText(null);
    }

    @FXML
    void delete(ActionEvent event) {
    	try {
			// 전제사항 = 테이블뷰 테이블에서 하나가 선택되어 있어야 함
			Map<String,String> map = (Map<String,String>)table.getSelectionModel().getSelectedItem();
			int orderid = Integer.parseInt(map.get("ORDERID"));
			ordersdao.delete(orderid);	// 디비 반영
			int index = table.getSelectionModel().getSelectedIndex();
			table.getItems().remove(index);	// ui 반영
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void insert(ActionEvent event) {
    	try {
			ordersdao.insert(getVo());
			table.getItems().add(getMap());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private Orders getVo() {
    	Orders vo = new Orders();
    	vo.setOrderid(Integer.parseInt(txtOrderid.getText()));
    	vo.setCustid(Customerid);
    	vo.setBookid(Bookid);
    	vo.setSaleprice(Integer.parseInt(txtSaleprice.getText()));
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String d = sdf.format(new java.util.Date());
    	Timestamp ts = new Timestamp(0).valueOf(d);
    	vo.setOrderdate(ts);
    	return vo;
    }
 
    private Map<String,String> getMap() {
    	Orders vo = new Orders();
    	Map<String,String> map = new HashMap<>();
    	map.put("ORDERID", txtOrderid.getText());	// 맵의 키 부분은 디비컬럼과 일치해야 함
    	map.put("CUSTID", Customerid+"");
    	map.put("BOOKID", Bookid+"");
    	map.put("SALEPRICE", txtSaleprice.getText());
    	map.put("ORDERDATE", txtOrderdate.getEditor().getText());
    	return map;
    }
    
    @FXML
    void selectAll(ActionEvent event) {
    	try {
			table = TableViewFactory.getTable(" SLECET * FROM ORDERS ", ConnectionFactory.create());
			setTable();	// 새로만들어진 테이블뷰에 이벤트 핸들링 + ui에 보여줌
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void selectByCondition(ActionEvent event) {
    	try {
    		String conditions = JOptionPane.showInputDialog("WHERE 포함한 조건절");
			table = TableViewFactory.getTable(" SLECET * FROM ORDERS "+conditions, ConnectionFactory.create());
			setTable();	// 새로만들어진 테이블뷰에 이벤트 핸들링 + ui에 보여줌
			txtMassage.appendText(" SLECET * FROM ORDERS "+conditions+"질의 수행 \n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void update(ActionEvent event) {
    	try {
			ordersdao.update(getVo());
			int index = table.getSelectionModel().getSelectedIndex();
			table.getItems().set(index, getMap());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			bookdao = new BookDAO();
			customerdao = new CustomerDAO();
			ordersdao = new OrdersDAO();
			comboBook.getItems().addAll(bookdao.selectAll());
			comboCustomer.getItems().addAll(customerdao.selectAll());
			table = TableViewFactory.getTable(" SELECT * FROM ORDERS ", ConnectionFactory.create());
			setTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 콤보박스에서 선택된 객체의 정보중 저장할 정보 세팅 작업(bookid, custid)
		comboCustomer.valueProperty().addListener(new ChangeListener<Customer>(){

			@Override
			public void changed(ObservableValue<? extends Customer> observable, Customer oldValue, Customer newValue) {
				txtMassage.appendText(newValue.toString2()+"선택 \n");
				Customerid = newValue.getCustid();
			}
		});
		comboBook.valueProperty().addListener(new ChangeListener<Book>(){

			@Override
			public void changed(ObservableValue<? extends Book> observable, Book oldValue, Book newValue) {
				txtMassage.appendText(newValue.toString2()+"선택 \n");
				Bookid = newValue.getBookid();
			}
			});
	}
	// 새로운 테이블뷰가 만들어지면 처리할 내용
	public void setTable() throws SQLException{
		table.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// 테이블의 한 행을 선택했을 때 그 행의 정보를 읽어 입력 ui에 나타내기
				try {
					Map<String,String> selected = (Map<String,String>) table.getSelectionModel().getSelectedItem();
					txtOrderid.setText(selected.get("ORDERID"));
					Customer vo = customerdao.select(Integer.parseInt(selected.get("CUSTID")));
					comboCustomer.getSelectionModel().select(vo);
					Book book = bookdao.select(Integer.parseInt(selected.get("BOOKID")));
					comboBook.getSelectionModel().select(book);
					txtSaleprice.setText(selected.get("SALEPRICE"));
					txtOrderdate.getEditor().setText(selected.get("ORDERDATE"));
				
				} catch (NumberFormatException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
				
			}});
		rightPanel.setCenter(table);
	}
}
