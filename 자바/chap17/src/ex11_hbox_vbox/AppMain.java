package ex11_hbox_vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.*;

public class AppMain extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// 배사보이(배치 사이즈정하고 보이게하고 이벤트처리하는 것)
		
		VBox root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("VBOX & HBOX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
