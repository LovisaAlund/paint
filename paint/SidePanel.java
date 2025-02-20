package paint;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
/**
 * Class for defining the color and shape menu. 
 * Add new colors and shapes here
 * 
 */
public class SidePanel extends VBox {

	public SidePanel(int padding) {
		super(padding);
		// Color buttons
		ColorButton darkGreenButton = new ColorButton(Color.FORESTGREEN);
		ColorButton pinkButton = new ColorButton(Color.PINK);
		ColorButton yellowButton = new ColorButton(Color.YELLOW);
		ColorButton redButton = new ColorButton(Color.CRIMSON);
		ColorButton blueButton = new ColorButton(Color.BLUE);
		ColorButton blackButton = new ColorButton(Color.BLACK);

		// Shapes
		Circle circle = new Circle(5, 5, Color.BLACK);
		Rectangle rect = new Rectangle(5, 5, Color.BLACK);
		Triangle tria = new Triangle(5, 5, Color.BLACK);

		// Shape buttons
		ShapeButton circleButton = new ShapeButton(circle);
		ShapeButton rectButton = new ShapeButton(rect);
		ShapeButton triaButton = new ShapeButton(tria);

		setAlignment(Pos.CENTER);
		
		Model.setActiveColorButton(blueButton);
		Model.setActiveShapeButton(circleButton);
		//Adds all buttons to the vbox
		getChildren().addAll(redButton, blueButton, blackButton, yellowButton, pinkButton, darkGreenButton, circleButton, rectButton, triaButton);

	}
}
