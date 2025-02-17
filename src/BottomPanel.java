package ritProgram;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BottomPanel extends HBox {
	private Button undoButton;
	private Button clearButton;
	private MyCanvas drawingFrame;
	
	public BottomPanel(MyCanvas frame) {
		drawingFrame = frame;
		clearButton = new Button("Erase");
		undoButton = new Button("Reverse");
		undoButton.setOnAction(event -> drawingFrame.undo());
		clearButton.setOnAction(event -> drawingFrame.clear());
		
		setStyle("-fx-background-color: #ff5733;");

		getChildren().add(undoButton);
		getChildren().add(clearButton);
	}	


}
