package ex18_input;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootControl implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboPublic.getItems().addAll("공개","비공개");
		
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
    	System.out.println("제목 : "+txtTitle.getText());
    	System.out.println("비밀번호 : "+txtPassword.getText());
    	System.out.println("PUBLIC : "+comboPublic.getValue());
    	System.out.println("게시일자 : "+dateExit.getValue());
    	System.out.println("내용 : "+txtContent.getText());
    }

    @FXML
    void handleCancel(ActionEvent event) {
    	Platform.exit();	// System.exit(0);
    }

    @FXML
    void handleReg(ActionEvent event) {
    	
    }

}
