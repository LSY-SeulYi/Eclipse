package ex05_anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("앵커페인 연습");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);	// 무대 사이즈 변경 불가 (true면 사이즈 변경 가능)
	}

}
