package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapes {
    protected Color shapecolor, strokecolor;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc);
    public abstract double Perimetr();

    public Shapes(Color color) {
        this.shapecolor = color;
    }

    public void setShapecolor(Color shapecolor) {
        this.shapecolor = shapecolor;
    }

    public void setStrokecolor(Color strokecolor) {
        this.strokecolor = strokecolor;
    }
}
