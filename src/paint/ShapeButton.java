package paint;

import javafx.scene.canvas.GraphicsContext;

public class ShapeButton extends MyButton {
	private Shape myShape;

	public ShapeButton(Shape shape) {
		myShape = shape;
		GraphicsContext gc = getGraphicsContext2D();
		shape.drawYourself(gc);
	}

	@Override
	void mouseEvent() {
		System.out.println("Shape pressed");
		Model.setShape(myShape);
		
	}
}
