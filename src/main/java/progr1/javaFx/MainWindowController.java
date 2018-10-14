package progr1.javaFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainWindowController {
    @FXML
    private VBox vboxContainer;

    @FXML
    public void initialize() {
        Button b = new Button("bardzo ważny buton");
        b.setOnAction(s-> System.out.println("komunikat z ważnego butona b"));
        Button c = new Button("bardzo ważny buton");
        c.setOnAction(s-> System.out.println("komunikat z ważnego butona c"));
        Button d = new Button("bardzo ważny buton");
        d.setOnAction(s-> System.out.println("komunikat z ważnego butona d"));
        vboxContainer.getChildren().addAll(b,c,d);
    }

    public void printSomething(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Ważny komunikat");
        alert.setTitle("komunikat");
        alert.show();
    }
}
