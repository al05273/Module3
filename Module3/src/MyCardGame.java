import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class MyCardGame extends Application{
	private ImageView[] iv = new ImageView[4];
	private int i = 0;
	private HBox hb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//Button btnTest = new  Button("Click Me!");
		//btnTest.setOnAction(new ClickButtonEventHandler());
		//Text txtBox = new Text("Write here");
		Image kos = new Image("https://images.fineartamerica.com/images/artworkimages/mediumlarge/1/king-of-spades-in-gold-on-black-serge-averbukh.jpg");
		Image kod = new Image("http://fc09.deviantart.net/fs46/f/2009/226/7/3/King_of_Diamonds_by_Lightang3l.jpg");
		Image koh = new Image("https://images.fineartamerica.com/images/artworkimages/mediumlarge/1/king-of-hearts-in-gold-on-black-serge-averbukh.jpg");
		Image koc = new Image("https://s-media-cache-ak0.pinimg.com/originals/a3/40/88/a340887c649d6ca7ba852027914d0d5a.jpg");
	
		iv[0] = new ImageView(kos);
		iv[1] = new ImageView(kod);
		iv[2] = new ImageView(koh);
		iv[3] = new ImageView(koc);
		Button next = new Button("Next");
		Button back = new Button ("Back");
		Button exit = new Button("Exit");
		
		VBox buttons = new VBox(20);
		hb = new HBox(10);
		buttons.getChildren().addAll(next,exit,back);
		hb.getChildren().addAll(buttons,iv[i]);
		
		next.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				hb.getChildren().remove(iv[i]);
				i++;
				if (i > 4) {
					i = 0;
				}
				hb.getChildren().add(iv[i]);
				
			}
		});
		exit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		next.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				hb.getChildren().remove(iv[i]);
				i--;
				if (i < 0) {
					i = 4;
				}
				hb.getChildren().add(iv[i]);
			}
		});
		
		
		
		//ClickNextEventHandler ch =new ClickNextEventHandler();	
		//ch.setImageView(iv[]);

		
		
	
		
		Scene s = new Scene(hb);
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
