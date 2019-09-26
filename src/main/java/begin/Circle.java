package begin;
import java.lang.Math;

public abstract class Circle extends Shape implements Perimeterable, Squarable {
    public Circle (Color c) {

    }
    /*
    public double area(){
        return PI * r * r;
    } */

    public void draw() {
        System.out.println("Круг");
    }
    private double r;
    /* public Circle(double r) {


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    } */

}
