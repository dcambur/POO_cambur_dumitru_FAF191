package oop.lab1;



public class Student implements IStudent {
    public String Name;
    public int Age;
    public double Mark;

    public Student(String name, int age, double mark) {
        this.Name = name;
        this.Age = age;
        this.Mark = mark;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Student Name: " + Name);
        System.out.println("Student Age: " + Age);
        System.out.println("Student Final Mark: " + Mark);
    }
}
