package begin;

public class Triangle extends Shape implements Perimeterable, Squarable {

    Triangle triangle = new Triangle(int a, int b, int c );
    public double countPerimeter() {
        return a + b + c;
    }
}
