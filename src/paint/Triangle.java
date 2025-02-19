package paint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Triangle extends Shape {

	public Triangle(int x, int y, Color color) {
		super(x, y, color);
		setSize(30);

	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		double[] xPoints = {5, 0, 20};  // X-coordinates
		double[] yPoints = {0, 20, 20};    // Y-coordinates
		int nPoints = 3;  // Number of points
		
		gc.setFill(getColor());
		gc.fillPolygon(xPoints, yPoints, nPoints);
		System.err.println("TRIANGLE NOT DONE");

	}
	
	@Override
	public Shape createInstance(int x, int y, Color color) {

		return new Triangle(x,y, color);
	}

}
