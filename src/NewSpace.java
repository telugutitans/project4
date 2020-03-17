import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
/**
 * 
 * @author Tarun snehith kishore reddy Karna
 * @since  02-21-2020
 *
 */
public class NewSpace implements ActionListener {
	private String fileName;
	private DrawingCanvas canvas;

	public NewSpace(DrawingCanvas c) {
		canvas = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void addActionListener(NewSpace newspace) {
		// TODO Auto-generated method stub
		
	}
}