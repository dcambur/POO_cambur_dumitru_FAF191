package oop.lab5;

public class X {
    private String x="x";

    public X () {}
    public X (String state) {this.x = state;}

    protected void printState() {
        System.out.println(x);
    }
}
