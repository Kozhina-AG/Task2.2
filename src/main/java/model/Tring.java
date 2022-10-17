package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tring extends  Shapes{
    double length;
    double height;

    public String toString(){

        return "Периметр треугольника: "+ Perimetr() + " Цвет треугольника: "+shapecolor;
    }

    public void DrawShape(GraphicsContext gc){
        gc.setFill(shapecolor);
        gc.setStroke(strokecolor);

        gc.fillPolygon(new double[]{0, length/2, this.length}, new double[]{0, height, 0}, 3);
        gc.strokePolygon(new double[]{0, length/2, this.length}, new double[]{0, height, 0}, 3);
    }

    public double Perimetr(){
        return (length * height) * 2;
    }

    public Tring(Color color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
    }
}
