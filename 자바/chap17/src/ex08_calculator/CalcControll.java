package ex08_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcControll {

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private Button btnplus;

    @FXML
    private Button btndivide;

    @FXML
    private Button btnmultiply;

    @FXML
    private Button btnminus;

    @FXML
    private TextField txtResult;

    @FXML
    void divide(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtA.getText());
    	double res = a/b;
    	txtResult.setText(res+"");
    }

    @FXML
    void minus(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtA.getText());
    	double res = a-b;
    	txtResult.setText(res+"");
    }

    @FXML
    void multiply(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtA.getText());
    	double res = a*b;
    	txtResult.setText(res+"");
    }

    @FXML
    void plus(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtA.getText());
    	double res = a+b;
    	txtResult.setText(res+"");
    }

}
