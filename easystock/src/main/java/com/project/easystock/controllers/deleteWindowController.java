package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class deleteWindowController {
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancelarAcao;

    @FXML
    private Button btnConfirmarAcao;

    @FXML
    private Text textErrorStatus;

    @FXML
    private TextField txtAreaID;

    @FXML
    void btnCancelarAcao(ActionEvent event) {

    }

    @FXML
    void btnConfirmarAcao(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCancelarAcao != null : "fx:id=\"btnCancelarAcao\" was not injected: check your FXML file 'deleteWindow.fxml'.";
        assert btnConfirmarAcao != null : "fx:id=\"btnConfirmarAcao\" was not injected: check your FXML file 'deleteWindow.fxml'.";
        assert textErrorStatus != null : "fx:id=\"textErrorStatus\" was not injected: check your FXML file 'deleteWindow.fxml'.";
        assert txtAreaID != null : "fx:id=\"txtAreaID\" was not injected: check your FXML file 'deleteWindow.fxml'.";

    }

}
