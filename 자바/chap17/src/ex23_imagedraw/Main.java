package ex23_imagedraw;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) { // 무대 
		try {
			// 컨테이너 
			BorderPane root = new BorderPane();
			root.setCenter(new MyDrawPane(380,380));
			// 장면에 컨테이너root를 깔고, 400*400 크기로 만든다.
			Scene scene = new Scene(root,380,380);
			// 위에서 만든 장면을 무대에 세팅 
			primaryStage.setScene(scene);
			
			primaryStage.show();//
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
