package oop.lab8;

public class Cube implements GeometricBody{
    private double a;

    public Cube(){};

    public Cube(double a){
        this.a=a;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(a,3);
    }
}
