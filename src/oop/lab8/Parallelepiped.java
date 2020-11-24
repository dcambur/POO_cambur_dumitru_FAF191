package oop.lab8;

public class Parallelepiped implements GeometricBody{
    private double a,b,c;

    public Parallelepiped(){}

    public Parallelepiped(double a, double b, double c){
        this.a=a;
        this.b = b;
        this.c=c;
    }

    @Override
    public double getSurface() {
        return 2*(a*c+c*b+a*b);
    }

    @Override
    public double getVolume() {
        return a*b*c;
    }
}
