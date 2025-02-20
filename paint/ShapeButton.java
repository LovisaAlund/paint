package paint;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ShapeButton extends MyButton {
	private Shape myShape;
	GraphicsContext gc;

	public ShapeButton(Shape shape) {
		myShape = shape;
		gc = getGraphicsContext2D();
		shape.drawYourself(gc);
	}

	@Override
	public void mouseEvent() {
		System.out.println("Shape pressed");
		Model.setShape(myShape);
		Model.setActiveShapeButton(this);

	}

	@Override
	public void drawOutline() {
		gc.setStroke(Color.LIGHTGREEN);
		gc.setLineWidth(5);
		gc.strokeRect(0, 0, 40, 40);

	}
	@Override
	public void removeOutline() {
		gc.setStroke(Color.WHITE);
		gc.setLineWidth(5);
		gc.strokeRect(0, 0, 40, 40);

		
	}
}
