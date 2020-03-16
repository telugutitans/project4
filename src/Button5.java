import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 * 
 * @author Sree Pradeep Kumar Relangi
 * @since 01-15-2021
 * @version 1.0
 *
 */
public class Button5 extends JButton {
	private SelectionEvent event;
	private static Icon label;

	public Button5() {
		super("@");
		Dimension size = getPreferredSize();
		setPreferredSize(size);
		setContentAreaFilled(false);
		event = new SelectionEvent(this, 5);
	}

	protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
			g.setColor(Color.lightGray);
		} else {
			g.setColor(getBackground());
		}
		g.fillRect(20, 10, getWidth()-40, getHeight()-25);
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		g.drawRect(20, 10, getWidth()-40, getHeight()-25);
		g.drawRect(40, 35, 10, 10);
		g.drawRect(250, 25, 10, 10);
		g.drawRect(250, 45, 10, 10);
	}
}