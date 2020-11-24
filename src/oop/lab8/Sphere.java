package oop.lab8;

public class Sphere implements GeometricBody{
    private int radius;

    public Sphere(){}

    public Sphere(int radius){
        this.radius=radius;
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }
}
