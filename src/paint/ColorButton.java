package paint;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorButton extends MyButton{
	private Color myColor;
	
	public ColorButton(Color color) {
		myColor = color;
		drawColorRect(myColor);
	}
	
    private void drawColorRect(Color color) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0, 0, getWidth(), getHeight());
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        double[] xPoints = { getWidth() / 2, getWidth(), 0 };
        double[] yPoints = { 0, getHeight(), getHeight() };

    }

	@Override
	void mouseEvent() {
		Model.setColor(myColor);
		System.out.println("Changed color");
		
	}
}
