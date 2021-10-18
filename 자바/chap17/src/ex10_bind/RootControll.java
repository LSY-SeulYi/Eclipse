package ex10_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
// 컨트롤러에 초기값 부여할 때
public class RootControll implements Initializable{

	@FXML
	private AnchorPane root;
	
    @FXML
    private TextArea areaA;

    @FXML
    private TextArea areaB;

    @FXML
    private Circle circle;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 컨트롤러의 초기값 혹은 초기작업이 필요한 것을 코딩할 수 있다.
		Bindings.bindBidirectional(areaA.textProperty(), areaB.textProperty());
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
	
	}
}