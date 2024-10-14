package lan.zold;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAddButton(ActionEvent event) {
        App.setRoot("createScene");
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickListButton(ActionEvent event) {

    }

}
