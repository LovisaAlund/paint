package paint;

import java.util.ArrayList;
import java.util.Stack;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Model {
	private Stack<Shape> contents;
	private static Shape currentShape;
	private static Color currentColor;
	private ArrayList<Shape> shapeList;

	public Model() {
		shapeList = new ArrayList<Shape>();
		contents = new Stack<Shape>();
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

	public void keyPressed(KeyEvent event) {

		// TODO Auto-generated method stub
	}

	public void mouseClicked(MouseEvent event, GraphicsContext gc) {
		int correctedX = (int) Math.round(event.getX() - currentShape.getSize() / 2);
		int correctedY = (int) Math.round(event.getY() - currentShape.getSize() / 2);
		
		Shape newShape = currentShape.createInstance(correctedX, correctedY, currentColor);
		newShape.drawYourself(gc);
		contents.add(newShape);
//		
//		Circle drawnCircle = new Circle(correctedX, correctedY, getColor());
//		drawnCircle.drawYourself(gc);
//		contents.add(drawnCircle);

		// TODO Auto-generated method stub

	}

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void addShape(Shape shape) {
		shapeList.add(shape);
	}

}
