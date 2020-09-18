package oop.pack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class University implements IUniversity {
    public String Name;
    public int FoundationAge;
    public List<Student> Students = new ArrayList<Student>();

    public University(String name, int foundation_age, Student student) {
        this.Name = name;
        this.FoundationAge = foundation_age;
        this.Students.add(student);
    }
    @Override
    public void PrintInfo() {
        System.out.println("This is " + Name + ".\nIt's foundation age is " + FoundationAge + ".\nNowadays it has " +
                Students.size() + " Students.\n" + "Average mark for all students is " + Average() + "\n");
    }
    @Override
    public float Average() {
        float sum = 0;
        int count = 0;
        for (Student student : Students) {
            sum += student.Mark;
            count++;
        }
        return sum/count;
    }
}
