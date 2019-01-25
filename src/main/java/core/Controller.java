package core;

import io.swagger.client.ApiException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button test;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        test.setOnMouseClicked(event -> {
            testClicked();
        });
    }

    private void testClicked() {
        BitmexHistory history = new BitmexHistory();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        try {
            alert.setContentText(String.valueOf(history.getAccountHistory().get(0)));
        } catch (ApiException e) {
            e.printStackTrace();
        }

        alert.showAndWait();
    }
}
