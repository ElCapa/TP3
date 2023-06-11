package com.example.sinup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
/** Controller relacionado a ficheiro fxml Home.fxml para qunado usuario fazer login
 *
 */
public class HomeController implements Initializable{
    @FXML
    private ListView<String> groupListView;
    @FXML
    private Label nomeDeLogin;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> groupData = FXCollections.observableArrayList(
                "Grupo 1",
                "Grupo 2",
                "Grupo 3",
                "Evento 1",
                "Evento 2",
                "Evento 3"
        );
        groupListView.setItems(groupData);
        nomeDeLogin.setText(LoginController.loggedInUserName);
    }



}
