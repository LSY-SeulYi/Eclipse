package ex_piechart;

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

public class PieChartController implements Initializable{

    @FXML
    private TextField txtData;

    @FXML
    private Button btnPieChart;

    @FXML
    private Button btnChartClear;

    @FXML
    private Button btnDataClear;

    @FXML
    private Canvas canvas;

    @FXML
    void chartClear(ActionEvent event) {
    	GraphicsContext g = canvas.getGraphicsContext2D();
    	g.clearRect(0, 0, 2000,2000);
    }

    @FXML
    void dataClear(ActionEvent event) {
    	txtData.setText(null);
    }

    @FXML
    void pieChart(ActionEvent event) {
    	chartClear(new ActionEvent());
    	String[] tokens = txtData.getText().split(",");
    	
    	String[] names = new String[tokens.length/2];
    	int[] scores = new int[tokens.length/2];
    	int total = 0;
    	for(int i=0,j=0;i<tokens.length;i+=2,j++) {
    		names[j] = tokens[i];
    		scores[j]= Integer.parseInt(tokens[i+1]);
    		total += scores[j];
    	 }
    	GraphicsContext gc = canvas.getGraphicsContext2D();
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
   		 gc.fillText(names[i], 50+(i*100), 10);
   	 }
   }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		txtData.setText("더불어민주당,67,열린민주당,3,정의당,4,국민의힘,2,없다,15,모르겠다,7");
		
	}

}
