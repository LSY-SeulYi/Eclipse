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

public class CustomerController implements Initializable{

    @FXML
    private BorderPane Customer;

    @FXML
    private TextField txtCustid;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtPhone;

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

    private TableView table;
    
    private CustomerDAO dao = new CustomerDAO();
    
    @FXML
    void delete(ActionEvent event) {
    	 Map<String,String> map = (Map<String,String>) table.getSelectionModel().getSelectedItem();
		 int custid = Integer.parseInt(map.get("CUSTID"));
    	try {
			dao.delete(custid);
			table.getItems().remove(map);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void insert(ActionEvent event) {
    	try {
			dao.insert(getVo());
			table.getItems().add(getMap());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private Customer getVo() {
    	Customer vo = new Customer();
    	vo.setCustid(Integer.parseInt(txtCustid.getText()));
    	vo.setName(txtName.getText());
    	vo.setAddress(txtAddress.getText());
    	vo.setPhone(txtPhone.getText());
    	return vo;
    }
    
    private Map<String,String> getMap() {
    	Map<String,String> map = new HashMap<>();
    	map.put("CUSTID", txtCustid.getText());
    	map.put("NAME", txtName.getText());
    	map.put("ADDRESS", txtAddress.getText());
    	map.put("PHONE", txtPhone.getText());
    	return map;
    }

    @FXML
    void selectAll(ActionEvent event) {
    	try {
    		List<Customer> data = dao.selectAll();
			List<Map> data2 = new ArrayList<>();
			for(Customer x:data) {
				Map<String,String> row = new HashMap<>();
				row.put("CUSTID", x.getCustid()+"");
				row.put("NAME", x.getName()+"");
				row.put("ADDRESS", x.getAddress()+"");
				row.put("PHONE", x.getPhone()+"");
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
			List<Customer> data = dao.selectByConditions(condition);
			List<Map> data2 = new ArrayList<>();
			for(Customer x:data) {
				Map<String,String> row = new HashMap<>();
				row.put("CUSTID", x.getCustid()+"");
				row.put("NAME", x.getName()+"");
				row.put("ADDRESS", x.getAddress()+"");
				row.put("PHONE", x.getPhone()+"");
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
			dao.update(getVo());
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
			table = TableViewFactory.getTable("SELECT * FROM CUSTOMER", ConnectionFactory.create());
			table.setOnMouseReleased(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					Map<String,String> selected = 
							(Map<String,String>) table.getSelectionModel().getSelectedItem();
					txtCustid.setText(selected.get("CUSTID"));
					txtName.setText(selected.get("NAME"));
					txtAddress.setText(selected.get("ADDRESS"));
					txtPhone.setText(selected.get("PHONE"));
				}});
			Customer.setCenter(table);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}		
	}
}