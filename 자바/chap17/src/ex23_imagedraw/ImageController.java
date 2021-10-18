package ex23_imagedraw;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ImageController implements Initializable{

    @FXML
    private Button btnBarChart;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDataClear;

    @FXML
    private Canvas canvas;
    
    @FXML
    private TextField txtData;
    

    @FXML
    void barchart(ActionEvent event) {
    	clear(new ActionEvent());
    	String[] tokens = txtData.getText().split(",");
    	
    	String[] names = new String[tokens.length/2];
    	int[] scores = new int[tokens.length/2];
    	for(int i=0,j=0;i<tokens.length;i+=2,j++) {
    		names[j] = tokens[i];
    		scores[j]= Integer.parseInt(tokens[i+1]);
    	 }
    	 GraphicsContext g = canvas.getGraphicsContext2D();
    	 for(int i=0;i<names.length;i++) {
    		 g.fillText(names[i],10+(i*50),20);//글자는 좌측하단점이 기준
    		 g.strokeRect(10+(i*50),30, 30,scores[i]*3);//좌측상단점이 기준
    	 }

    }

    @FXML
    void clear(ActionEvent event) {
    	GraphicsContext g = canvas.getGraphicsContext2D();
    	g.clearRect(0, 0, 2000,2000);
    }

    @FXML
    void dataClear(ActionEvent event) {
    	txtData.setText(null);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 텍스트필드 초기값 부여하기 - 개발도중 
		txtData.setText("강호동,78,유관순,89,정창손,90,박주흘,90,민영환,47");
	}

}
