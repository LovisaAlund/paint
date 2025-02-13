package ritProgram;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCanvas extends Canvas {
	private Model model;
	GraphicsContext gc;

	public MyCanvas() {
		model = new Model();
		Color blue = Color.BLUE;
		Circle circle = new Circle(300, 300, blue);
		model.addShape(circle);
		model.setShape(circle);
		model.setColor(blue);

		setWidth(400);
		setHeight(200);
		gc = getGraphicsContext2D();
		setOnMouseClicked(event -> {
			System.out.println("Mouse Clicked");
			model.mouseClicked(event, gc);

		});
	}

	public void clear() {
		gc.clearRect(0, 0, 400, 200);
		model.clear();

	}

	public void undo() {
		gc.clearRect(0, 0, 400, 200);
		model.undo();
		for (Shape shape : model.getContents()) {
			shape.drawYourself(gc);
		}
		
		;
	}
}
