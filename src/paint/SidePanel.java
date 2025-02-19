package paint;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SidePanel extends VBox {
	private int padding;
	public SidePanel(int padding) {
		super(padding);

		ColorButton redButton = new ColorButton(Color.CRIMSON);
		ColorButton blueButton = new ColorButton(Color.BLUE);
		ColorButton blackButton = new ColorButton(Color.BLACK);
		Circle circle = new Circle(5, 5, Color.BLACK);
		Rectangle rect = new Rectangle(5,5,Color.BLACK);
		Triangle tria = new Triangle(5,5,Color.BLACK);
		ShapeButton circleButton = new ShapeButton(circle);
		ShapeButton rectButton = new ShapeButton(rect);
		ShapeButton triaButton = new ShapeButton(tria);
		setAlignment(Pos.CENTER);
		getChildren().addAll(redButton, blueButton, blackButton, circleButton, rectButton, triaButton);
		
		


	}
}
	
