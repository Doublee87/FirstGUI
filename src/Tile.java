import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Tile extends JComponent {
	
	public void paintComponent(Graphics g){
		//when g is not set to a color we use the foreground color this component was set to
		g.fillOval(0, 0, this.getWidth(), this.getHeight());
	}
}
