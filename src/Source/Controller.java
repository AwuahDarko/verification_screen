package Source;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private PieChart chart;
    @FXML
            private ListView<String> studentInfo;

    ObservableList<Data> list = FXCollections.observableArrayList(
            new Data("Present", 90),
            new Data("Absent", 900)
//            new Data("Ja", 9),
//            new Data("Javar", 190),
//            new Data("Javak", 590)
    );

    ObservableList<String> info = FXCollections.observableArrayList(

            "",
            "Name:  Fredrick Nii Armah",
            "",
            "Class:  3 V. Arts",
            "",
            "Arrear:  GHC 10000.00",
            "",
            "Last Payment:  2nd August, 2019",
            "",
            "Status:  Active"
    );

    public void closeWindow(ActionEvent event){
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chart.setLabelsVisible(false);
        chart.setStartAngle(30.0);
        chart.setData(list);
        studentInfo.setItems(info);
    }
}
