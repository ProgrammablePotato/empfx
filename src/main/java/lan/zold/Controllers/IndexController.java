package lan.zold.Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lan.zold.App;
import lan.zold.Employee;

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
    void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>(null))
    }

}
