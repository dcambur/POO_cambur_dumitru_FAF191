package oop.lab5;

public class G extends F {
    protected String g = "g";
    protected X x = new X("xxx_g");
    public G () {}
    public G (String state) {this.g = state;}

    @Override
    protected void printState() {
        System.out.println(g);
    }
}
