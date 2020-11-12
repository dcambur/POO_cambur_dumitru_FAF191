package oop.lab7;


import java.util.ArrayList;

class Circle extends Figure{
    private double radius;

    Circle(){}

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    float getArea() {
        return (float) (Math.PI*radius);
    }

    @Override
    float getPerimeter() {
        return (float) (2*Math.PI*radius);
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(7);
        Rectangle rectangle = new Rectangle(5,4);
        Triangle triangle = new Triangle(2,2,4);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);

        FigureController figureController = new FigureController();
        figureController.Analyse(figures);

        System.out.println(figureController.getBestArea());
        System.out.println(figureController.getBestPerimeter());
        System.out.println("-------------------------------------");

        //Now, we start for 10
        Circle circle = new Circle(6);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        figures.add(circle);
        figureController.Analyse(figures);
        System.out.println(figureController.getBestArea());
        System.out.println(figureController.getBestPerimeter());
    }
}
