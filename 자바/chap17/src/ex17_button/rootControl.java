package ex17_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class rootControl implements Initializable{

	@FXML
	private CheckBox chk1;
	
	@FXML
	private CheckBox chk2;
	
	@FXML
	private ImageView checkImageView;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 컨트롤러에 초기값을 부여하거나 이벤트 처리 작업을 할수있게 함.
		}
	public void handleChkAction(ActionEvent event) {
		if(chk1.isSelected() && chk2.isSelected()) {
			// 안경도 쓰고 모자도 쓴 그림이 나오게 바꿔주는 작업
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		}else if(chk1.isSelected()){
			// 안경쓴 그림으로 바꿔줌
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		}else if(chk2.isSelected()){
			// 모자쓴 그림으로 바꿔줌
			checkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}else {
			// 모자도 안경도 쓰지 않은 그림
			checkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	} 
}
