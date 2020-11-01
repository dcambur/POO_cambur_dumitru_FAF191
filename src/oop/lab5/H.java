package oop.lab5;

public class H extends G {
    protected String h = "h";
    private  X x = new X("xxx_h");

    public H () {}
    public H (String state) {this.h = state;}

    @Override
    protected void printState() {
        System.out.println(h);
    }

    public X getHX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }
}
