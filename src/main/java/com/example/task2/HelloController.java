package com.example.task2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import model.Line;
import model.Rectangular;
import model.Shapes;
import model.Tring;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas my_canvas;
    private GraphicsContext gc;

    @FXML
    private TextField myText;

    @FXML
    private ColorPicker piker;

    @FXML
    private ColorPicker piker_stroke;

    public Shapes shp = new Rectangular(Color.PLUM, 300, 200);

    @FXML
    public Shapes getShape(int val) {
        if (val == 1) {
            return new Rectangular(Color.LIGHTCORAL, 150, 150);
        } else if (val == 2) {
            return new Line(Color.PLUM, 200.0);
        } else if (val == 3) {
            return new Tring(Color.VIOLET, 180, 100);
        }
        return new Rectangular(Color.MINTCREAM, 100, 50);
    }

    public void makeDrawing(KeyEvent keyEvent) {

        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight()); // очистка холста


        if(!myText.getText().equals("") ){
            shp = getShape(Integer.parseInt(myText.getText()));

            shp.setShapecolor(piker.getValue());
            shp.setStrokecolor(piker_stroke.getValue());

            shp.DrawShape(gc);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = my_canvas.getGraphicsContext2D();
    }
}