package paint;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {

	public Rectangle(int x, int y, Color color) {
		super(x, y, color);
		setSize(30);

	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getColor());
		gc.fillRect(this.getX(), this.getY(), getSize(), getSize());
		System.out.println(getX() + getY());

	}
	
	@Override
	public Shape createInstance(int x, int y, Color color) {

		return new Rectangle(x,y, color);
	}

}
