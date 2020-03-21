import java.awt.Graphics;
import java.awt.Point;
/**
 * 
 * @author Rohith Varma Gaddam
 * @since 02-16-2020
 *
 */
public class StoreClickPoints {
	private static int numPoints = 0;
	private static Point point1;
	private static Point point2;
	private static DrawShape shape1;
	private static DrawShape shape2;
	private static int index1;
	private static int index2;

	public StoreClickPoints(int x, int y, DrawShape shape, int index) {
		if (numPoints == 0) {
			shape1 = shape;
			index1 = index;
			numPoints += 1;
			point1 = new Point(x, y);
			Point relative = new Point(x - shape.positionX, y - shape.positionY);
			Point[] shapePoints = { point1, relative };
			shape.connections.add(shapePoints);
		} else if(!shape.equals(shape1)) {
			shape2=shape;
			index2 = index;
			point2 = new Point(x, y);
			Point[] points = { point1, point2 };
			Point relative = new Point(x - shape.positionX, y - shape.positionY);
			Point[] shapePoints = { point2, relative };
			shape.connections.add(shapePoints);
			shape.canvas.lineArray.add(points);
			shape.canvas.repaint();
			numPoints = 0;
			
		}
	}
	
	public void updateshape1()
	{
		if(index1/2==0)
		{
			if(index1%2==0)
			{
				shape1.input[0].add(shape2);
				shape1.input[0].add(index2);
			}
			
			if(index1%2==1)
			{
				shape1.input[1].add(shape2);
				shape1.input[1].add(index2);
			}
		}
		
		else if(index1/2==1)
		{
			if(index1%2==0)
			{
				shape1.output[0].add(shape2);
				shape1.output[0].add(index2);
			}
			
			if(index1%2==1)
			{
				shape1.output[1].add(shape2);
				shape1.output[1].add(index2);
			}
		}
	}
	
	

}