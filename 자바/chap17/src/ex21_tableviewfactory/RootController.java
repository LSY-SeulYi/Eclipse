package ex21_tableviewfactory;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class RootController implements Initializable{

    @FXML
    private BorderPane root;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtKor;

    @FXML
    private TextField txtEng;

    @FXML
    private TextField txtMath;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnSort;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnIndex;

    @FXML
    private Button btnSample;

    @FXML
    void handleBtnAdd(ActionEvent event) {
    	// 자료 입력 작업
    	Score vo = new Score(
    			txtName.getText(),
    			Integer.parseInt(txtKor.getText()),
    			Integer.parseInt(txtEng.getText()),
    			Integer.parseInt(txtMath.getText())
    			);
    	table.getItems().add(vo);	// 등수는 아직 없음.
    	ranked();	// 등수 메길수 있음.
    }
    
    // 입력, 삭제, 수정시에 루틴으로 호출되어야 할 부분
    public void ranked() {
    	ObservableList<Score> data = table.getItems();
    	for(int i=0;i<data.size();i++) {
    		Score dto = data.get(i);
    		dto.setRank(getRank(dto.getTotal()));	// 등수 메기기 중요 1단계(등수 메김)
    		data.set(i, dto);	// 등수 메기기 중요 2단계(옵저버블리스트 반영)
    	}
    	table.setItems(data);	// 등수 메기기 중요 3단계(연동된 아이템 읽은거 세팅)
    }
    
    // 등수를 계산해 내는 메소드
    public int getRank(int total) {
    	int rank = 1;
    	for(Score x:table.getItems()) {
    		if(x.getTotal()>total) {
    			rank++;
    		}
    	}
    	return rank;
    }

    @FXML
    void handleBtnDelete(ActionEvent event) {
    	int index = table.getSelectionModel().getSelectedIndex();
    	if(index==-1) {	// 선택된 것이 없다면
    		JOptionPane.showMessageDialog(null, "선택된 행이 없어 지울 수 없습니다!");
    		return;	// 메소드의 종료
    	}else {
    		int x = JOptionPane.showConfirmDialog(null, index+"번 자료를 삭제합니다.");
    		System.out.println(x);
    		if(x==0) table.getItems().remove(index);
    		else return;
    		ranked();
    	}
    }

    @FXML
    void handleBtnIndex(ActionEvent event) {
    	String name = JOptionPane.showInputDialog("찾을 사람 이름을 입력하세요!");
    	ObservableList<Score> data = table.getItems();
    	int row = -1;
    	for(int i=0;i<data.size();i++) {
    		if(data.get(i).getName().equals(name)) {
    			row = i;
    			break;	// 찾았으므로 for문 종료
    		}
    	}
    	table.scrollTo(row);
    	table.getSelectionModel().select(row);
    }

    @FXML
    void handleBtnSample(ActionEvent event) {
    	// 샘플데이터 넣기 = 개발도상
    	table.getItems().clear();
    	table.getItems().add(new Score("나상첨",34,45,67));
    	table.getItems().add(new Score("구상화",56,45,95));
    	table.getItems().add(new Score("윤경필",32,45,67));
    	table.getItems().add(new Score("첨밀밀",34,77,88));
    	table.getItems().add(new Score("기파랑",32,80,67));
    	handleBtnSort(new ActionEvent());	// 마치 솔트버튼 누른것과 같음
    }

    @FXML
    void handleBtnSort(ActionEvent event) {
    	// 정렬작업 - 옵저버블 리스트만 정렬하면 유아이에 자동 반영됨.
    	ObservableList<Score> data = table.getItems();
    	Collections.sort(data,(s1,s2)->s2.getTotal()-s1.getTotal());	// 람다식 Comparator
    	ranked();
    }

    @FXML
    void handleBtnUpdate(ActionEvent event) {
    	// 테이블뷰에서 선택된 위치 인덱스 값 얻기
    	int index = table.getSelectionModel().getSelectedIndex();
    	// 입력 필드 값으로 vo 객체 만드는 서브루틴 호출
    	Score vo = makeVo();
    	// 수정된 vo객체를 옵저버블리스트에 세팅하여 ui에 반영
    	table.getItems().set(index, vo);
    	// 수정후 등수 다시 메김
    	ranked();
    }
    public Score makeVo() {
    	Score vo = new Score(
    			txtName.getText(),
    			Integer.parseInt(txtKor.getText()),
    			Integer.parseInt(txtEng.getText()),
    			Integer.parseInt(txtMath.getText())
    			);
    	return vo;
    }

    // root.fxml에 존재하지 않는 컨트롤임.(직접 전역변수로 만들어 쓰기 위한 것)
    private TableView<Score> table;
	
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// 컨트롤(컴포넌트Component)들의 초기화 작업
    	table = TableViewFactory.getTable(Score.class);
		root.setCenter(table);	// 보드페인 중앙에 테이블뷰를 붙임
		table.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// 테이블의 아이템을 선택했을 때 작업해야 할 내용
				Score selected = table.getSelectionModel().getSelectedItem();
				txtName.setText(selected.getName());
				txtKor.setText(selected.getKor()+"");
				txtEng.setText(selected.getEng()+"");
				txtMath.setText(selected.getMath()+"");
			}});
	}
}
