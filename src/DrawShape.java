import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JLabel;

/**
 * This class implements the drawing of shapes drag and drop within canvas.
 * 
 * @author Ashwath Reddy Koppala
 * @created on 1-29-2020
 * @version 1.0
 *
 */
public class DrawShape extends JLabel {
	int positionX;
	int positionY;
	DrawingCanvas canvas;
	int shapeNo;
	int inputSize;
	int outputSize;
	ArrayList<Point[]> connections = new ArrayList<Point[]>();
	ArrayList<Object>[] input = new ArrayList[2];
	ArrayList<Object>[] output = new ArrayList[2];

	public DrawShape(DrawingCanvas c, int no, int posX, int posY) {
		positionX = posX;
		positionY = posY;
		shapeNo = no;
		canvas = c;
		/*switch(no){
		case 1:
			inputSize=0;
			outputSize=1;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			System.out.print(outputSize);
			break;
		case 2:
			inputSize=1;
			outputSize=0;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			break;
		case 3:
			inputSize=1;
			outputSize=2;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			break;
		case 4:
			inputSize=2;
			outputSize=1;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			break;
		case 5:
			inputSize=2;
			outputSize=2;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			break;
		case 6:
			inputSize=1;
			outputSize=1;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			break;
		case 7:
			inputSize=1;
			outputSize=1;
			input = new ArrayList[inputSize];
			output = new ArrayList[outputSize];
			break;
		}*/
	}
}