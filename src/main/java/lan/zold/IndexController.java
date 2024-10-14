package lan.zold;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class IndexController {

    @FXML
    private TableView<Employee> empTable;
    @FXML
    private TableColumn<Employee, Integer> idCol;
    @FXML
    private TableColumn<Employee, String> nameCol;
    @FXML
    private TableColumn<Employee, String> cityCol;
    @FXML
    private TableColumn<Employee, Double> salaryCol;

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }
    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        empTable.getItems().add(new Employee(1, "Ernő", "Szeged", 315.0));
    }

}
