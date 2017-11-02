import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ClickNextEventHandler implements EventHandler<ActionEvent>{
	private ImageView iv = new ImageView();
	private int i = 0;
	public ClickNextEventHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(ActionEvent event) {
		Button b = (Button) event.getSource();
		while(!b.getText().equals("Exit")) {
		if (b.getText().equals("Next")) {
			this.setImageView(iv, ++i);
		}
		if (b.getText().equals("back")){
			this.setImageView(iv, ++i);
		}
		}
		// TODO Auto-generated method stub
		
	}
	public void setImageView(ImageView[] iv, int i){
		this.iv = iv[i];
	}
}
