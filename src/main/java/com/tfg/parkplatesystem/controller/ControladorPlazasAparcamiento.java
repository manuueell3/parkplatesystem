package com.tfg.parkplatesystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import com.tfg.parkplatesystem.model.PlazaAparcamiento;

import java.util.Objects;

public class ControladorPlazasAparcamiento {

    @FXML
    private TableView<PlazaAparcamiento> plazasTable;

    @FXML
    private TableColumn<PlazaAparcamiento, Long> idColumn;

    @FXML
    private TableColumn<PlazaAparcamiento, String> ubicacionColumn;

    @FXML
    private TableColumn<PlazaAparcamiento, String> estadoColumn;

    @FXML
    private TextField ubicacionTextField;

    @FXML
    public void handleAddPlaza(ActionEvent event) {
        // Lógica para añadir una nueva plaza de aparcamiento
    }

    @FXML
    public void handleDeletePlaza(ActionEvent event) {
        // Lógica para eliminar una plaza de aparcamiento seleccionada
    }

    @FXML
    public void handleBackButton(ActionEvent event) {
        try {
            Stage stage = (Stage) plazasTable.getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/tfg/parkplatesystem/fxml/principal.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Park Plate System - Principal");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
