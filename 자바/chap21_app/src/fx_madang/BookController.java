package fx_madang;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import fx_oracle.TableViewFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class BookController implements Initializable{

    @FXML
    private BorderPane book;

    @FXML
    private TextField txtBookId;

    @FXML
    private TextField txtBookName;

    @FXML
    private TextField txtPublisher;

    @FXML
    private TextField txtPrice;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSelectAll;

    @FXML
    private Button btnSelectByCondition;
    
    private TableView table;
    
    private BookDAO dao = new BookDAO();

    @FXML
    void delete(ActionEvent event) {
		 Map<String,String> map = (Map<String,String>) table.getSelectionModel().getSelectedItem();
		 int bookid = Integer.parseInt(map.get("BOOKID"));
    	try {
			dao.delete(bookid);	// 디비반영
			table.getItems().remove(map);	// ui반영
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void insert(ActionEvent event) {	
    	try {
			dao.insert(getVo());	// 디비작업
			table.getItems().add(getMap());	// ui작업
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private Book getVo() { 	// 자주 사용하니 따로 메소드를 만들어서 분리시켜서 활용
    	Book vo = new Book();
    	vo.setBookid(Integer.parseInt(txtBookId.getText()));
    	vo.setBookname(txtBookName.getText());
    	vo.setPublisher(txtPublisher.getText());
    	vo.setPrice(Integer.parseInt(txtPrice.getText()));
    	return vo;
    }
    
    private Map<String,String> getMap() {
    	Map<String,String> map = new HashMap<>();
    	map.put("BOOKID", txtBookId.getText());
    	map.put("BOOKNAME", txtBookName.getText());
    	map.put("PUBLISHER", txtPublisher.getText());
    	map.put("PRICE", txtPrice.getText());
    	return map;
    }

    @FXML
    void selectAll(ActionEvent event) {
    	try {
    		List<Book> data = dao.selectAll();
			List<Map> data2 = new ArrayList<>();
			for(Book x:data) {
				Map<String,String> row = new HashMap<>();
				row.put("BOOKID", x.getBookid()+"");
				row.put("BOOKNAME", x.getBookname()+"");
				row.put("PUBLISHER", x.getPublisher()+"");
				row.put("PRICE", x.getPrice()+"");
				data2.add(row);
			}
			table.getItems().clear();
			table.getItems().addAll(data2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void selectByCondition(ActionEvent event) {
    	try {
    		String condition = JOptionPane.showInputDialog("조건을 WHERE절 표기방식으로~");
			List<Book> data = dao.selectByConditions(condition);
			List<Map> data2 = new ArrayList<>();
			for(Book x:data) {
				Map<String,String> row = new HashMap<>();
				row.put("BOOKID", x.getBookid()+"");
				row.put("BOOKNAME", x.getBookname()+"");
				row.put("PUBLISHER", x.getPublisher()+"");
				row.put("PRICE", x.getPrice()+"");
				data2.add(row);
			}
			table.getItems().clear();
			table.getItems().addAll(data2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void update(ActionEvent event) {
    	try {
			dao.update(getVo());	// 디비작업
			int index = table.getSelectionModel().getSelectedIndex();
			table.getItems().set(index, getMap());	// ui작업
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			table = TableViewFactory.getTable("SELECT * FROM BOOK", ConnectionFactory.create());
			table.setOnMouseReleased(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					// 테이블의 아이템을 선택했을 때 작업해야 할 내용
					Map<String,String> selected = 
							(Map<String,String>) table.getSelectionModel().getSelectedItem();
					txtBookId.setText(selected.get("BOOKID"));
					txtBookName.setText(selected.get("BOOKNAME"));
					txtPublisher.setText(selected.get("PUBLISHER"));
					txtPrice.setText(selected.get("PRICE"));
				}});
			book.setCenter(table);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

}
