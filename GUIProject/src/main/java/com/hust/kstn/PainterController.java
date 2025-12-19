package com.hust.kstn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton penRadioButton; 
    @FXML
    private RadioButton eraserRadioButton; 
    @FXML
    private ToggleGroup toolsGroup; 
    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Color inkColor = null;
        if (penRadioButton.isSelected()) {
            inkColor = Color.BLACK; 
        } else if (eraserRadioButton.isSelected()) {
            inkColor = Color.WHITE; 
        }
        if (inkColor != null) {
            Circle circle = new Circle(event.getX(), event.getY(), 4, inkColor);
            drawingAreaPane.getChildren().add(circle);
        }
    }
}