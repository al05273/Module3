import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ClickButtonEventHandler implements EventHandler<ActionEvent> {

	public ClickButtonEventHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(ActionEvent event) {
		Button b =(Button) event.getSource();
		if(b.getText().equals("Clicked")) b.setText("Click Me");
		else b.setText("Clicked");
		
	}

}
