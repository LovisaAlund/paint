package paint;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public abstract class Shape {
	private int y;
	private int x;
	private int size;
	private Color myColor;
	
	public Shape(int x, int y, Color color) {
		this.setY(y);
		this.setX(x);
		this.myColor = color;
	}
	
	public abstract void drawYourself(GraphicsContext gc);
	public abstract Shape createInstance(int x, int y, Color color);
	public Color getColor() {
		// TODO Auto-generated method stub
		return myColor;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setCoordinates(double x, double y) {
		setX((int) Math.round(x));
		setY((int) Math.round(y));
		
	}

	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	

	



}
