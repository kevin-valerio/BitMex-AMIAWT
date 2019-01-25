package core;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
        System.out.println("x");
    }
}
