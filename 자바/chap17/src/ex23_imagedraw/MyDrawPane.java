package ex23_imagedraw;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyDrawPane extends Canvas{
	// 붓/도화지
	GraphicsContext gc = getGraphicsContext2D();
	public MyDrawPane(double x,double y) {
		this.setWidth(x);
		this.setHeight(y);
		
//		gc.setFill(Color.ORANGE);
//		gc.fillRect(0, 0, 380, 380);
//		gc.setStroke(Color.BLACK);
//		// 바둑판 그리는 부분 
//		for (int i = 10; i <= 370; i += 20) {
//			gc.strokeLine(i, 10, i, 370);
//			gc.strokeLine(10, i, 370, i);
//		}
		
		gc.strokeLine(10, 10, 370, 370);
		
		
		
	}
}
