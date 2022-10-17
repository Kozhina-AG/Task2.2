package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {

    double length;

    public String toString(){
        return "Длина линии: "+ Perimetr() + " Цвет линии: "+shapecolor;
    }

    public void DrawShape(GraphicsContext gc){
        gc.setFill(shapecolor);
        gc.fillRect(0, 0, length, 3);
        gc.setStroke(strokecolor);
        gc.strokeRect(0, 0, length, 6);
    }

    //public double Area(){return length;}
    public double Perimetr(){
        return length;
    }

    public Line(Color color, double length) {
        super(color);
        this.length = length;
    }
}
