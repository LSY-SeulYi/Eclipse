package ex01_app_start;

import javafx.application.Application;
import javafx.stage.Stage;

// Application 상속을 받아야 함
public abstract class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch();
		
	}

}
