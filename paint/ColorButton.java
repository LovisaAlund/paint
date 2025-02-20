package paint;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorButton extends MyButton {
	private Color myColor;
	private GraphicsContext gc;

	public ColorButton(Color color) {
		myColor = color;
		gc = getGraphicsContext2D();
		drawColorRect(myColor);
	}

	private void drawColorRect(Color color) {

		gc.setFill(color);
		gc.fillRect(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(2);

		double[] xPoints = { getWidth() / 2, getWidth(), 0 };
		double[] yPoints = { 0, getHeight(), getHeight() };

	}

	@Override
	public void drawOutline() {
		gc.setStroke(Color.LIGHTGREEN);
		gc.setLineWidth(5);
		gc.setLineDashes(2);
		gc.strokeRect(0, 0, 40, 40);
	}

	@Override
	public void mouseEvent() {
		Model.setColor(myColor);
		Model.setActiveColorButton(this);
		System.out.println("Changed color");

	}

	@Override
	public void removeOutline() {
		// TODO Auto-generated method stub
		gc.setStroke(Color.WHITE);
		gc.setLineWidth(5);
		gc.strokeRect(0, 0, 40, 40);

	}
}
