package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangular extends Shapes{
    public int length;
    public int height;

    public String toString(){
        return "Периметр прямоугольника: "+ Perimetr() + " Цвет прямоугольника: "+shapecolor;
    }

    public void DrawShape(GraphicsContext gc){

        gc.setStroke(strokecolor);
        gc.setFill(shapecolor);

        gc.fillRect(10,10,this.height,this.length);
        gc.strokeRect(9,9,this.height,this.length);
    }
    //public double Area(){return length * height;}

    public double Perimetr(){
        return (length * height) * 2;
    }

    public Rectangular(Color color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }
}
