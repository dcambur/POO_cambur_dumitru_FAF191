package oop.lab1;

public class Main {

    public static void main(String[] args) {
        Student Kolya = new Student("Kolya", 19, 8.3);
        Student Dima = new  Student("Dima", 19, 10.0);
        Student Jenya = new Student("Eugene", 13, 9.13);

        Student Arthur = new Student("Arthur", 17, 5.0);
        Student Ion = new Student("Ion", 13, 8.88);

        Student Duck = new Student("The Duck", 13, 8.88);


        University UTM = new University("UTM", 1920, Dima);
        University ASEM = new University("ASEM", 1966, Arthur);
        University USM = new University("USM", 2000, Duck);


        UTM.Students.add(Kolya);
        UTM.Students.add(Jenya);

        ASEM.Students.add(Ion);

        UTM.PrintInfo();
        System.out.println();

        ASEM.PrintInfo();
        System.out.println();

        USM.PrintInfo();
        System.out.println();


        System.out.println("Info about some of students");
        Arthur.PrintInfo();
        System.out.println();
        Dima.PrintInfo();


    }
}