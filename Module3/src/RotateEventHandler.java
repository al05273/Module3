import javafx.event.EventHandler;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class RotateEventHandler implements EventHandler<MouseEvent> {
	private Text txt;

	@Override
	public void handle(MouseEvent event) {
		if(event.getSource() instanceof ImageView) {
			ImageView iv = (ImageView) event.getSource();
			iv.setRotate((iv.getRotate()+90)%360);
			txt.setText("Angle is now " +iv.getRotate());
		}
		
	}
	public void setText(Text txt) {
		this.txt = txt;
	}
}
