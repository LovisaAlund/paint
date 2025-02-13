package ritProgram;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Circle extends Shape{
	

	public Circle(int x, int y, Color color) {
		super(x, y, color);
		setSize(30);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
		gc.setFill(getColor());
		gc.fillOval(this.getX(), this.getY(), getSize(), getSize());
		System.out.println(getX() + getY());

		
		
	}



	
	
	

}
