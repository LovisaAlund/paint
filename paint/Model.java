package paint;

import java.util.ArrayList;
import java.util.Stack;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * Class for handling the drawing logic
 * Starts with selecting a blue circle as default
 *
 */
public class Model {
	private Stack<Shape> contents;
	private static Shape currentShape;
	private static Color currentColor;
	private ArrayList<Shape> shapeList;
	private static ShapeButton activeShapeButton;
	private static ColorButton activeColorButton;

	public Model() {
		shapeList = new ArrayList<Shape>();
		contents = new Stack<Shape>();
		Color blue = Color.BLUE;
		Circle circle = new Circle(300, 300, blue);
		currentShape = circle;
		currentColor = blue;

	}

	public static Shape getShape() {
		return currentShape;
	}

	public static void setShape(Shape shape) {
		currentShape = shape;
	}

	public static Color getColor() {
		return currentColor;
	}

	public static void setColor(Color color) {
		currentColor = color;
	}

	public Stack<Shape> getContents() {
		return contents;
	}

	public void undo() {
		if (!getContents().empty()) {
			contents.pop();
		} else {
			System.out.println("Nothing to remove");
		}
	}

	public void clear() {
		contents.empty();
	}

	/**
	 * On mouse click the coordinates are corrected according to the shape size.
	 * Coordinates are sent to the Shape class which creates an object which is saved in the stack
	 * @param event
	 * @param gc
	 */
	public void mouseClicked(MouseEvent event, GraphicsContext gc) {
		int correctedX = (int) Math.round(event.getX() - currentShape.getSize() / 2);
		int correctedY = (int) Math.round(event.getY() - currentShape.getSize() / 2);

		Shape newShape = currentShape.createInstance(correctedX, correctedY, currentColor);
		newShape.drawYourself(gc);
		contents.add(newShape);


	}

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void addShape(Shape shape) {
		shapeList.add(shape);
	}

	public static void setActiveShapeButton(ShapeButton updatedShapeButton) {
		if (activeShapeButton != null) {
			activeShapeButton.removeOutline();
		}
		activeShapeButton = updatedShapeButton;
		activeShapeButton.drawOutline();
	}

	public static void setActiveColorButton(ColorButton updatedColorButton) {
		if (activeColorButton != null) {
			activeColorButton.removeOutline();
		}
		activeColorButton = updatedColorButton;
		activeColorButton.drawOutline();
	}

}
