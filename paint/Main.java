package paint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage mainStage) throws Exception {

		MyCanvas drawingFrame = new MyCanvas();

		BottomPanel bottomPanel = new BottomPanel(drawingFrame);
		SidePanel colorMenu = new SidePanel(10);
		bottomPanel.setStyle(
				"-fx-background-color: #FFFFFF; -fx-padding: 15px; -fx-border-color: black; -fx-border-width: 2px;");
		colorMenu.setStyle(
				"-fx-background-color: #FFFFFF; -fx-padding: 15px; -fx-border-color: black; -fx-border-width: 2px;");
		HBox mainContent = new HBox(drawingFrame, colorMenu);
		VBox totalLayout = new VBox(mainContent, bottomPanel);

		VBox container = new VBox();
		Label one = new Label();
		container.getChildren().add(one);

		Scene mainScene = new Scene(totalLayout);
		mainStage.setTitle("Welcome to PaintFX");
		mainStage.setHeight(850);
		mainStage.setWidth(1185);
		mainStage.setScene(mainScene);
		mainStage.show();

	}

}