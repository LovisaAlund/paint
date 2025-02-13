package ritProgram;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SidePanel extends VBox {
	private ArrayList<ColorButton> cButtons;
	private ArrayList<ShapeButton> sButtons;
	
	public SidePanel() {
		cButtons = new ArrayList<ColorButton>();
		sButtons = new ArrayList<ShapeButton>();
		getChildren().add(new Label("Color Menu"));
	}
}
