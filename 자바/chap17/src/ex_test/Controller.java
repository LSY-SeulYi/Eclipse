package ex_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SubScene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller implements Initializable{

    @FXML
    private Canvas canvas;

    @FXML
    private SubScene subScene;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Hyperlink hyperLink;

    @FXML
    private Button btn;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    void btn(ActionEvent event) {

    }

    @FXML
    void canvas(MouseEvent event) {

    }

    @FXML
    void colorPicker(ActionEvent event) {
    	final ColorPicker colorPicker = new ColorPicker();
		colorPicker.setOnAction(new EventHandler() {
		     public void handle(Event t) {
		         Color c = colorPicker.getValue();
		         System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue());
		     }
		 });
    }

    @FXML
    void hyperLink(ActionEvent event) {
    	
    }

    @FXML
    void subScene(MouseEvent event) {

    }

    @FXML
    void tableView(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
