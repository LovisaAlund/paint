package ritProgram;

import java.awt.Color;
import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SidePanel extends VBox {
	private ArrayList<ColorButton> cButtons;
	private ArrayList<ShapeButton> sButtons;

	public SidePanel() {
		cButtons = new ArrayList<ColorButton>();
		sButtons = new ArrayList<ShapeButton>();
		//getChildren().add(new Label("Color Menu"));

		for (ColorButton colorB : cButtons) {
			getChildren().add(colorB);
		}

		for (ShapeButton shapeB : sButtons) {
			getChildren().add(shapeB);
		}
	}
	
	public void addColorButton(ColorButton colorB) {
		cButtons.add(colorB);
	}
	
	public void addShapeButton(ShapeButton shapeB) {
		sButtons.add(shapeB);
	}
}
