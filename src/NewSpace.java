import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JTabbedPane;
/**
 * 
 * @author Tarun snehith kishore reddy Karna
 * @since  02-21-2020
 *
 */
public class NewSpace implements ActionListener {
	private JTabbedPane tabbedPane;
	
	
	public NewSpace(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int count = tabbedPane.getTabCount();
		count = count+1;
		tabbedPane.add("Tab"+count,new DrawingCanvas());
	}

	public static void addActionListener(NewSpace newspace) {
		// TODO Auto-generated method stub
	}
}