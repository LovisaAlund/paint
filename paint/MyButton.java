package paint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public abstract class MyButton extends Canvas {
	public MyButton() {
		super(40,40);
	
	    
		setOnMouseClicked(event -> {
			System.out.println("Mouse Clicked");
			mouseEvent();

		});
		
	}
	
	
	public abstract void mouseEvent();
	public abstract void drawOutline();
	public abstract void removeOutline();
	



	

}
