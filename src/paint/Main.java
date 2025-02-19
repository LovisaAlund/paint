package paint;

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
		
		BottomPanel bottomPanel = new BottomPanel(drawingFrame);
		 SidePanel colorMenu = new SidePanel(10);
		 
		 colorMenu.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 15px; -fx-border-color: black; -fx-border-width: 2px;");
		 
		 HBox mainContent = new HBox(drawingFrame, colorMenu);
		 VBox totalLayout = new VBox(mainContent, bottomPanel);
//		VBox colorMenu = new VBox();
//		MyButton testButton = new MyButton();
//		testButton.setStyle("-fx-border-color: black;");
//
//		colorMenu.getChildren().add(testButton);
//		HBox mainContent = new HBox(drawingFrame, colorMenu);
//		HBox bottomPanel = new BottomPanel(drawingFrame);
//		VBox totalLayout = new VBox(mainContent, bottomPanel);
//
//		Label colorMen = new Label();
//
//		colorMenu.getChildren().add(colorMen);
					
		VBox container = new VBox();
		Label one = new Label();
		container.getChildren().add(one);

		Scene mainScene = new Scene(totalLayout);
		mainStage.setTitle("Welcome to PaintFX");
		mainStage.setHeight(800);
		mainStage.setWidth(1200);
		mainStage.setScene(mainScene);
		mainStage.show();

	}

}
