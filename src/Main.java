package ritProgram;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Main extends Application {

	public void start(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage mainStage) throws Exception {

		MyCanvas drawingFrame = new MyCanvas();

		HBox totalLayout = new HBox(drawingFrame);
		VBox leftSide = new VBox();
		HBox bottomPanel = new BottomPanel(drawingFrame);
		VBox colorMenu = new SidePanel();

		leftSide.getChildren().add(drawingFrame);
		leftSide.getChildren().add(bottomPanel);

		totalLayout.getChildren().add(leftSide);
		totalLayout.getChildren().add(colorMenu);

		Scene mainScene = new Scene(totalLayout);
		mainStage.setTitle("Welcome to PaintFX");
		mainStage.setHeight(300);
		mainStage.setWidth(600);
		mainStage.setScene(mainScene);
		mainStage.show();

	}

}
