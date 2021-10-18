package ex09_scores;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ScoreControll extends Score{

	List<Score> list = new ArrayList<>();
	
    @FXML
    private TextField txtName;

    @FXML
    private TextField txtKor;

    @FXML
    private TextField txtEng;

    @FXML
    private TextField txtMath;

    @FXML
    private TextField txtNo;

    @FXML
    private Button btnInsurt;

    @FXML
    private TextArea txtRsultArea;

    @FXML
    void insert(ActionEvent event) {
    	
    	String no = txtNo.getText();
    	String name = txtName.getText();
    	int kor = Integer.parseInt(txtKor.getText());
    	int eng = Integer.parseInt(txtEng.getText());
    	int math = Integer.parseInt(txtMath.getText());

    	Score score = new Score(no,name,kor,eng,math);
    	list.add(score);
    	list.sort(new Score());
    	
    	StringBuffer buffer = new StringBuffer();
    	int rank = 0;
    	for(Score x:list) {
    		x.rank = ++rank;
    		buffer.append(x.toString()+"\n");
    	}
    	txtRsultArea.setText(buffer.toString());
    }

}
