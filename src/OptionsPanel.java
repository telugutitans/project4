import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * @author Nikitha
 * @Since 1-26-2020
 * @version 1.0
 */
public class OptionsPanel extends JPanel {
	public OptionsPanel() {
		Dimension size = new Dimension(-200, 600);
		setPreferredSize(size);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		setBorder(blackline);
		setLayout(new GridLayout(7, 1));
		Button6 b = new Button6();
		add(b);
		Button4 b1 = new Button4();
		add(b1);
		/*Triangle triangleButton = new Triangle();
		add(triangleButton);
		Square squareButton = new Square();
		add(squareButton);*/
	}
}
