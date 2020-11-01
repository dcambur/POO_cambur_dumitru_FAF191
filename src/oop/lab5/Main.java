package oop.lab5;

import java.lang.reflect.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        X x = new X("xxx1");
        A a = new A("aaa", x);
        B b = new B("bbb");
        C c = new C("ccc");
        D d = new D("ddd");
        E e = new E("eee");
        F f = new F("fff");
        G g = new G("ggg");
        H h = new H("hhh");
        I i = new I("iii");
        J j = new J("jjj");

        A[] objArray = {a, b, c, d, e, f, g, h, i, j};
        for (A value : objArray) {
            value.printState();
        }

        // we can see x from a
        a.x.printState();
        // Because of H private property x,
        // we cant directly print state of x, we have to create getter
        j.getAX().printState();
        // Now we can easy print x states
        h.getHX().printState();
    }
}
