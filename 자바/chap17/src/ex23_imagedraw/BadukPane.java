package ex23_imagedraw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BadukPane extends Application {
	BadukStone[] stones = new BadukStone[400];
	public static int cnt = 0;
	// 초기화 블럭
	{
		for (int i = 0; i < 400; i++) {
			stones[i] = new BadukStone(i, (i % 2 == 0) ? Color.BLACK : Color.WHITE);

		}
	}

	class BadukStone extends Circle {
		int index;
		Color color;
		double x, y;

		public BadukStone(int index, Color color) {
			this.index = index;
			this.color = color;
			this.setFill(color);
			this.setRadius(10.0);
		}

		public void setX(double x) {
			this.setCenterX(x);
		}

		public void setY(double y) {
			this.setCenterY(y);
		}

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 배사보이
		BorderPane root = new BorderPane();
		Pane pane = new Pane();
		Canvas canvas = new Canvas(640, 480);
		// canvas.setOpacity(0.8);
		// pane.setOpacity(0.5);
		// 캔버스의 크기 정하는 것을 잊지 말자.
		// canvas.setWidth(1024);
		// canvas.setHeight(768);

		canvas.setLayoutX(0);
		canvas.setLayoutY(0);
		pane.getChildren().addAll(canvas);

		root.setCenter(pane);
		Scene scene = new Scene(root);

		primaryStage.setScene(scene);
		primaryStage.setTitle("바둑판");
		primaryStage.show();
		GraphicsContext gc = canvas.getGraphicsContext2D();
		drawShapes(gc);
		// -----------------------------------------
		pane.setOnMouseReleased(e -> {
			double x = e.getX();
			double y = e.getY();

			// 사사오입(반올림) - 정확하게 크로스
			x = (int) ((x - 10) / 20 + 0.5) * 20.0 + 10;
			y = (int) ((y - 10) / 20 + 0.5) * 20.0 + 10;
			if (x > 370 || y > 370)
				return;

			stones[cnt].setX(x);
			stones[cnt].setY(y);
			pane.getChildren().addAll(stones[cnt]);
			cnt++;
		});

	}

	public void drawShapes(GraphicsContext gc) {
		// 바둑판을 그리시요.
		// 시작 위치 10,10 에서
		// 한칸의 간격은 20 으로
		gc.setFill(Color.ORANGE);
		gc.fillRect(0, 0, 380, 380);
		gc.setStroke(Color.BLACK);
		for (int i = 10; i <= 370; i += 20) {
			gc.strokeLine(i, 10, i, 370);
			gc.strokeLine(10, i, 370, i);
		}
	}

	public static void main(String[] args) {
		launch();
	}
}