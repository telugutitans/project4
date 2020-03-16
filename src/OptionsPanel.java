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
		Button1 b = new Button1();
		add(b);
		Button3 b1 = new Button3();
		add(b1);
		Button5 b5 = new Button5();
		add(b5);
		
		
	}
}
