import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyRide extends Application{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}
	public void start (Stage primaryStage) throws Exception{
		Circle c1 = new Circle(20);
		Circle c2 = new Circle(20);
		c1.setCenterX(80);
		c1.setCenterY(100);
		c2.setCenterX(180);
		c2.setCenterY(100);
		Rectangle r1 = new Rectangle(200, 40);
		r1.setX(30);
		r1.setY(60);
		Rectangle r2 = new Rectangle(100,40);
		r2.setX(80);
		r2.setY(20);
		//add elements to layout manager or container
		Pane pane = new Pane();
		pane.getChildren().addAll(c1,r1,c2, r2);
		//add layout to the scene 
		Scene s = new Scene(pane, 600,600);
		//add scene to stage
		primaryStage.setScene(s);
		//show
		primaryStage.show();
	}
}
