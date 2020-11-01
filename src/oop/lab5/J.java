package oop.lab5;

public class J extends I {
    protected String j = "j";

    public J () {}
    public J (String state) {this.j = state;}

    @Override
    protected void printState() {
        System.out.println(j);
    }
}
