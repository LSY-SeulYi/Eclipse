package ex18_input;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootControl1 implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtPassword;

    @FXML
    private ComboBox<String> comboPublic;

    @FXML
    private DatePicker dateExit;

    @FXML
    private TextArea txtContent;

    @FXML
    private Button btnReg;

    @FXML
    private Button btnCancel;

    @FXML
    void comboPublic(ActionEvent event) {

    }

    @FXML
    void handleCancel(ActionEvent event) {

    }

    @FXML
    void handleReg(ActionEvent event) {

    }

}
