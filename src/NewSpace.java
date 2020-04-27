import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JTabbedPane;
/**
 * 
 * @author Rohith Varma Gaddam
 * @since  03-14-2020
 *
 */
public class NewSpace implements ActionListener {
	private Frame frame;
	static private int newCount = 0;
	public NewSpace(Frame frame) {
		this.frame = frame;
	}

	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(newCount == 0) {
			Container content = frame.getContentPane();
			content.add(new OptionsPanel());
			JTabbedPane pane = new JTabbedPane();
			frame.setTabbedPane(pane);
			content.add(pane);
			pane.add(new DrawingCanvas());
			newCount++;
		}
		frame.setTabbedPane(new JTabbedPane());
		
	}

	public static void addActionListener(NewSpace newspace) {
		// TODO Auto-generated method stub
	}
}