import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventsDemo extends Application {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btnTest = new  Button("Click Me!");
		btnTest.setOnAction(new ClickButtonEventHandler());
		Text txtBox = new Text("Write here");
		Image img = new Image("https://s3-us-west-1.amazonaws.com/powr/defaults/image-slider2.jpg");
		ImageView iv = new ImageView(img);
		RotateEventHandler rh =new RotateEventHandler();
		rh.setText(txtBox);
		iv.setOnMouseClicked(rh);
		
		
		HBox hb = new HBox(10);
		hb.getChildren().addAll(iv,btnTest,txtBox);
		
		Scene s = new Scene(hb);
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
