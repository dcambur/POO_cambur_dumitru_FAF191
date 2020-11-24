package oop.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(100);
        Parallelepiped parallelepiped = new Parallelepiped(10, 5, 6);
        Sphere sphere = new Sphere(4);

        ArrayList<GeometricBody> geometricBodyArrayList = new ArrayList<>();
        geometricBodyArrayList.add(cube);
        geometricBodyArrayList.add(parallelepiped);
        geometricBodyArrayList.add(sphere);

        GeometricBodyController geometricBodyController = new GeometricBodyController();
        geometricBodyController.getList(geometricBodyArrayList);
        System.out.println("Now will be printed best Surface " + geometricBodyController.getBestSurface());
        System.out.println("Now will be printed best Volume " + geometricBodyController.getBestVolume());


    }
}
