package fx_orders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OrderMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent orders = (Parent)FXMLLoader.load(getClass().getResource("orders.fxml"));
		
		Scene scene = new Scene(orders);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
