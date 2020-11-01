package oop.lab5;

public class D extends C {
    protected String d = "d";

    public D () {}
    public D (String state) {
        super();
        this.d = state;
    }

    @Override
    protected void printState() {
        System.out.println(d);
    }
}
