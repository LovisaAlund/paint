package paint;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

	public Triangle(int x, int y, Color color) {
		super(x, y, color);
		setSize(30);

	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		double[] xPoints = { 15 + getX(), 0 + getX(), 30 + getX() };
		double[] yPoints = { 0 + getY(), 30 + getY(), 30 + getY() };
		int nPoints = 3;

		gc.setFill(getColor());
		gc.fillPolygon(xPoints, yPoints, nPoints);
		System.err.println("TRIANGLE NOT DONE");

	}

	@Override
	public Shape createInstance(int x, int y, Color color) {

		return new Triangle(x, y, color);
	}

}
