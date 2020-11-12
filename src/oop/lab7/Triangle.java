package oop.lab7;

public class Triangle extends Figure {
    private float a;
    private float b;
    private float c;

    Triangle(){}

    Triangle (float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    float getArea() {
        float p, s;
        p = (a+b+c)/2;
        s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    float getPerimeter() {
        return a+b+c;
    }

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

    public float getC() {
        return this.c;
    }

    public void setC(float c) {
        this.c = c;
    }
}
