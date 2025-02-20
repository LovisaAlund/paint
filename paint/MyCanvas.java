package paint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Class for the Canvas where the user is able to draw
 */

public class MyCanvas extends Canvas {
	private Model model;
	private GraphicsContext gc;

	public MyCanvas() {
		model = new Model();
		setWidth(1100);
		setHeight(740);
		gc = getGraphicsContext2D();
		setOnMouseClicked(event -> {
			System.out.println("Mouse Clicked");
			model.mouseClicked(event, gc);

		});
	}

	public void clear() {
		gc.clearRect(0, 0, 1100, 740);
		model.clear();

	}

	public void undo() {
		gc.clearRect(0, 0, 1100, 740);
		model.undo();
		for (Shape shape : model.getContents()) {
			shape.drawYourself(gc);
		}
		
		;
	}
}
