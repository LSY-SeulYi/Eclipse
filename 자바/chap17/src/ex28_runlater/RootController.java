package ex28_runlater;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable{

    @FXML
    private Label lblTime;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnStop;

    boolean isStop;
    
    @FXML
    void start(ActionEvent event) {
    	isStop = false;	// isStop이 false여야 돌아가기 때문에 미리 false로 지정을 해 놔야 멈췄다가 다시 실행해도 움직이게 할수 있음
    	Thread clock = new Thread() {
    		public void run() {
    			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    			while(!isStop) {
    				String strTime = sdf.format(new Date());
    				
    				Platform.runLater(()->{
    					// fx가 쓰레드 되는 부분임.
        				lblTime.setText(strTime);
        				// 특별한 공식으로 감싸줘야 함.
    				});
    				try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    		}
    	};
    	clock.setDaemon(true);	// 시계 우측 상단 종료버튼 눌르면 쓰레드도 종료되게 하는것.(메인쓰레드와 생명주기를 맞춘다)
    	clock.start();
    }

    @FXML
    void stop(ActionEvent event) {
    	isStop = true;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 디자인시 이벤트 처리 명기 않고 컨트롤러에서 처리하는 방법
		btnStart.setOnAction(event->start(event));
		btnStop.setOnAction(event->stop(event));
		
	}

}
