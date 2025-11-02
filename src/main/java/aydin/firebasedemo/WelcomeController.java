package aydin.firebasedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class WelcomeController {

    @FXML
    void handleregister(ActionEvent event) throws IOException {
        DemoApp.setRoot("register");
    }

    @FXML
    void handlesignin(ActionEvent event) throws IOException {
        DemoApp.setRoot("login");
    }
}