package ex07_gugudan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GugudanControll {

    @FXML
    private TextField txtDan;

    @FXML
    private Button btndisp;

    @FXML
    private Button btnclear;

    @FXML
    private TextArea textarea;

    @FXML
    void clear(ActionEvent event) {
    	textarea.setText(null);
    }

    @FXML	// 구구단 출력 버튼 (구구단을 textarea에 뿌린다)
//    void display(ActionEvent event) {
//    	int someDan = Integer.parseInt(txtDan.getText());
//    	StringBuffer buffer = new StringBuffer();
//    	for(int i=1;i<=9;i++) {
//    		buffer.append(someDan +"*"+i+"="+(someDan*i)+"\n");
//    	}
//    	textarea.setText(buffer.toString());
//    }
    void display(ActionEvent event) {
    	int someDan = Integer.parseInt(txtDan.getText());
    	StringBuilder builder = new StringBuilder();
    	for(int i=1;i<=9;i++) {
    		builder.append(someDan +"*"+i+"="+(someDan*i)+"\n");
    	}
    	textarea.setText(builder.toString());
    }
}