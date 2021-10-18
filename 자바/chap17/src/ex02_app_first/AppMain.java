package ex02_app_first;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{

	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// 컨테이너 먼저 만들기 (VBox => 세로로 박스 하나씩 넣어주는 것)
		VBox root = new VBox();
		root.setPrefWidth(350);	// 세로 박스의 가로 길이
		root.setPrefHeight(150);	// 세로 박스의 세로 길이
		root.setAlignment(Pos.CENTER);	// 세로 박스의 가운데 정렬
		root.setSpacing(20);	// 세로 박스의 간격 띄우기
		// 컨테이너에 들어갈 내용물
		Label label = new Label();	// 라벨 객체 생성
		label.setText("Hello~! JavaFX~!\n안녕하세요~! 자바 공부를 해봅시다~!");	// 라벨 객체 안에 글자 넣기
		label.setFont(new Font("Vivaldi Italic",50));	// 라벨 객체 안의 글자 크기
		
		Button button = new Button();	// 버튼 생성
		button.setText("확인");	// 버튼 안에 글자 넣기
		button.setOnAction(e->Platform.exit());	// 버튼 누르면 창이 닫힘
		
		// root 안에 자료 넣기
		root.getChildren().addAll(label,button);
		
		// root 세팅시키기 (Scene을 먼저 만들어서 거기에 넣어줘야함)
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("나의 첫 FX");
		
		// 세팅 시킨 장면 무대에 보이기
		primaryStage.show();

	}
}
