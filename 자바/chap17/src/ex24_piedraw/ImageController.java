package ex24_piedraw;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

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
    private Button btnPieChart;
    
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
    
    @FXML
    void pieChart(ActionEvent event) {
    	clear(new ActionEvent());
    	String[] tokens = txtData.getText().split(",");
    	
    	String[] names = new String[tokens.length/2];
    	int[] scores = new int[tokens.length/2];
    	// 아이디어 포함
    	int total = 0;
    	for(int i=0,j=0;i<tokens.length;i+=2,j++) {
    		names[j] = tokens[i];
    		scores[j]= Integer.parseInt(tokens[i+1]);
    		total += scores[j];
    	 }
    	 GraphicsContext gc = canvas.getGraphicsContext2D();	// RGB 변수 사용위한것
    	 int[] shares = new int[scores.length];
    	 for(int i=0;i<shares.length;i++) {
    		 shares[i] = (int)(Math.round(scores[i]/(double)total*360));	// 반올림
    	 }
    	 double start = 0.0;
    	 for(int i=0;i<names.length;i++) {
    		 float r=(float)(Math.random());	// rgb값으로 색상 블렌딩
    		 float g=(float)(Math.random());
    		 float b=(float)(Math.random());
    		 gc.setFill(new Color(r,g,b,1));	// 1은 투명도를 나타냄. 0일수록 불투명
    		 gc.fillArc(150, 30, 300, 300, start, shares[i], ArcType.ROUND);
    		 start += shares[i];
    		 gc.fillText(names[i], 200+(i*50), 20);
    	 }
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 텍스트필드 초기값 부여하기 - 개발도중 
		txtData.setText("강호동,78,유관순,89,정창손,90,박주흘,90,민영환,47");
	}

}
