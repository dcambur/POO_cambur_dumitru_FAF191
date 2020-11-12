package oop.lab7;

import java.util.ArrayList;

public class FigureController {
    private final ArrayList<Figure> temp = new ArrayList<>();

    public void Analyse(ArrayList<Figure> list){
        temp.addAll(list);
    }

    public float getBestArea(){
        float value=0;
        for (Figure figure : temp) {
            if (figure.getArea() > value) {
                value = figure.getArea();
            }
        }
        return value;
    }

    public double getBestPerimeter(){
        float value=0;
        for (Figure figure : temp) {
            if (figure.getPerimeter() > value) {
                value = figure.getPerimeter();
            }
        }
        return value;
    }
}
