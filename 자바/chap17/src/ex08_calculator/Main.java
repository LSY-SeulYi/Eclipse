package ex08_calculator;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {	// 무대 장식
	@Override
	public void start(Stage primaryStage) {
		try {
			// BorderPane => 컨테이너
			AnchorPane root = FXMLLoader.load(getClass().getResource("scores.fxml"));
			// Scene => 장면 (400,400 은 크기)
			Scene scene = new Scene(root);
			// 장면에 스타일 입히기.
			scene.getStylesheets()	// 장면에 스타일 적용시키기 위해 스타일 시트 얻어옴
				.add(	// 자료 구조 => 자료 추가
				getClass()	// 스타일 시트에 지금 클래스 추가
				.getResource("application.css")	// 지금 클래스 위치에서 application.css 자원을 갖고 온다
				.toExternalForm()
				);	// 외부 폼 형태로 적용시킴
			// 위에서 만든 장면을 무대에 세팅시킴
			primaryStage.setScene(scene);
			// 위에서 세팅 시킨 무대 장면을 보여줌
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
