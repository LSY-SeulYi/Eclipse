package ex19_view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TableController implements Initializable {

	@FXML
	private TextField txtName;

	@FXML
	private TextField txtKor;

	@FXML
	private TextField txtEng;

	@FXML
	private TextField txtMath;

	@FXML
	private Button btnInput;

	@FXML
	private TableView<Score> tableView;

	@FXML
	private TableColumn<?, ?> tcName;

	@FXML
	private TableColumn<?, ?> tcKor;

	@FXML
	private TableColumn<?, ?> tcEng;

	@FXML
	private TableColumn<?, ?> tcMath;

	@FXML
	private TableColumn<?, ?> tcTotal;

	@FXML
	private TableColumn<?, ?> tcAvg;

	@FXML
	private TableColumn<?, ?> tcRank;

	@FXML
	private Button btnRank;

	@FXML
    void handleBtnInput(ActionEvent event) {
    	// TODO 입력필드의 정보로 Score객체를 만들어 tableView에 반영 
    	String name = txtName.getText();
    	int kor = Integer.parseInt(txtKor.getText());
    	int eng = Integer.parseInt(txtEng.getText());
    	int math = Integer.parseInt(txtMath.getText());
    	Score vo = new Score(name,kor,eng,math);
    	tableView.getItems().add(vo);
     }

	public int getRank(int total) {
		int rank = 1;
		for (Score x : tableView.getItems()) {
			if (x.getTotal() > total) {
				rank++;
			}
		}
		return rank;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tcName.setCellValueFactory(new PropertyValueFactory("name"));
		tcKor.setCellValueFactory(new PropertyValueFactory("kor"));
		tcEng.setCellValueFactory(new PropertyValueFactory("eng"));
		tcMath.setCellValueFactory(new PropertyValueFactory("math"));
		tcTotal.setCellValueFactory(new PropertyValueFactory("total"));
		tcAvg.setCellValueFactory(new PropertyValueFactory("avg"));
		tcRank.setCellValueFactory(new PropertyValueFactory("rank"));

//		ObservableList sample = FXCollections.observableArrayList(
//			new Score("이준석",67,78,99)	
//		);
//		tableView.setItems(sample);
		// ---------------- 테이블뷰에서 한 자료를 선택했을 때
//		tableView.setOnMouseReleased(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				Score selected = tableView.getSelectionModel().getSelectedItem();
//				txtName.setText(selected.getName());
//				txtKor.setText(selected.getKor()+"");//int 타입을 문자열로 바꿔줘야함 
//				txtEng.setText(selected.getEng()+"");
//				txtMath.setText(selected.getMath()+"");
//				
//			}
//		});

	}

	@FXML
	void handleSelect(MouseEvent event) {
		// TODO 선택된 VO정보를 입력란에 표시하기
		Score selected = tableView.getSelectionModel().getSelectedItem();
		txtName.setText(selected.getName());
		txtKor.setText(selected.getKor() + "");// int 타입을 문자열로 바꿔줘야함
		txtEng.setText(selected.getEng() + "");
		txtMath.setText(selected.getMath() + "");

	}

	@FXML
	void handleBtnRank(ActionEvent event) {
		// 테이블뷰에 연동되어있는 데이타를 얻어옴 
		ObservableList<Score> data = tableView.getItems();
		// 그 데이타 한 개 한 개를 읽어와 등수를 메기고
		for(int i=0;i<data.size();i++) {
			Score vo = data.get(i);
			vo.setRank(getRank(vo.getTotal()));
			// 새로운 값으로 오버라이트
			data.set(i, vo);
		}
		tableView.setItems(data);// 테이블뷰에 새로운 데이타로 세팅시킴 
	}

}
