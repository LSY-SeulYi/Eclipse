package fx_oracle;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class RootController implements Initializable{

    @FXML
    private BorderPane root;

    @FXML
    private TextArea txtSQL;

    @FXML
    private Button btnCue;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnCopy;

    private TableView table;	// fxml에서 만든것이 아님(@FXML 없음)
    
    @FXML
    private ComboBox<Integer> comboFontSize;

    @FXML
    void handleBtnClear(ActionEvent event) {
    	txtSQL.setText(null);
    	root.setCenter(null);
    }

    @FXML
    void handleBtnCopy(ActionEvent event) {

    }

    @FXML
    void handleBtnCue(ActionEvent event) throws SQLException{
    	root.setCenter(null); // 깨끗하게 지워줌
    	String sql = txtSQL.getText();
    	table = TableViewFactory.getTable(sql, ConnectionFactory.create());
    	root.setCenter(table);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboFontSize.getItems().addAll(10,12,14,16,18,20,22,24,26,28,30);
		// 콤보박스의 사이즈 선택이 변경될 때 처리해야 할 이벤트
		comboFontSize.valueProperty().addListener(
				new ChangeListener<Integer>() {
					@Override
					public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
						txtSQL.setFont(new Font(newValue));
					}
				}
		);
		txtSQL.setText("SELECT * FROM \r\n"
				+ "BOOK, CUSTOMER, ORDERS \r\n"
				+ "WHERE ORDERS.CUSTID = CUSTOMER.CUSTID \r\n"
				+ "AND ORDERS.BOOKID = BOOK.BOOKID \r\n"
				+ "ORDER BY ORDERS.CUSTID DESC \r\n");
	}

}
