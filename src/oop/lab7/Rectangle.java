package oop.lab7;

public class Rectangle extends Figure {
    private float a;
    private float b;

    public Rectangle() {}

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    @Override
    float getArea() { return this.a*this.b;}

    @Override
    float getPerimeter() { return 2*(this.a+this.b);}

    public float getA() {
        return this.a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return this.b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
