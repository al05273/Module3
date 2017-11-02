import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FirstFX extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch();
			
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// add elements that user will see
		Button btn = new Button("Click");
		Image gus = new Image("https://pbs.twimg.com/profile_images/1867737423/Gus_chillin_400x400.jpg");
		ImageView iv = new ImageView(gus);
		ImageView iv2 = new ImageView(gus);
		iv2.setRotate(90);
		Circle c = new Circle(50);
		c.setFill(Color.BLANCHEDALMOND);
		c.setStroke(Color.GAINSBORO);
		//create container or pane to hold displayed elements.
		VBox vb = new VBox(10);
		vb.getChildren().addAll(iv,btn, c, iv2);
		//add pane to scene 
		Scene s = new Scene (vb);
		//add scene to stage
		primaryStage.setScene(s);
		//show
		primaryStage.show();
		
	}

}
