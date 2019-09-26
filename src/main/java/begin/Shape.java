package begin;
import java.awt.*;

public abstract class Shape {
    private Color c;
    //double r;
    public Shape(Color c) {
        this.c = c;
    }
   /* public String getColor() {
        return c;
    }

    public void setColor(String color) {
        this.color = color;
    } */

    public void draw()
    {
        System.out.println("Shape");
    }
}
