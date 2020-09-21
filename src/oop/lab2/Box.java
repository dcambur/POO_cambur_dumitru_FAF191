package oop.lab2;

public class Box {
    private double Length, Width, Height;
    private String Name;
    public Box(String name, double length, double width, double height) {
        this.Name = name;
        this.Length = length;
        this.Width = width;
        this.Height = height;
    }

    public void printArea() {
        System.out.println("Surface Area=" +
                (2*(this.Height*this.Length) +
                2*(this.Width*this.Height) +
                2*(this.Width*this.Length)));
    }

    public void printVolume() {
        System.out.println("Volume=" + this.Height*this.Width*this.Length);
    }


    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        this.Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        this.Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        this.Height = height;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
