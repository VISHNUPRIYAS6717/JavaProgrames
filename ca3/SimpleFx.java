import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Enter your name:");

        TextField textField = new TextField();

        Button button = new Button("Submit");

        Label result = new Label();

        button.setOnAction(e -> {
            String name = textField.getText();
            result.setText("Hello " + name);
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
                label,
                textField,
                button,
                result
        );

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Simple JavaFX Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}