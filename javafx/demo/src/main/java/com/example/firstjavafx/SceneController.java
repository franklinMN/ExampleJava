package com.example.firstjavafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    private Parent root;
    private Scene scene;
    private Stage stage;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));

        scene = new Scene(root);
        String cssfile1 = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(cssfile1);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));

        scene = new Scene(root);
        String cssfile1 = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(cssfile1);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

}
