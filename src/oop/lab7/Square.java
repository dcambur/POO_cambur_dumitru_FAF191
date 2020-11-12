package oop.lab7;

public class Square extends Figure {
    private float a;
    private float b;

    public Square() {}

    public Square(float a) {
        this.a = a;
    }
    @Override
    float getArea() { return this.a*this.a;}

    @Override
    float getPerimeter() { return 4*this.a;}

    public float getA() {
        return this.a;
    }

    public void setA(float a) {
        this.a = a;
    }
}
