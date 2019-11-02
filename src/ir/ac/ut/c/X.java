package ir.ac.ut.c;

import ir.ac.ut.A;
import ir.ac.ut.B;

public class X {
    void g() {
        A a = new A();
        a.public_i = 0;
        a.public_f();

        B b = new B();
        b.public_i = 0;
        b.public_f();

        C c = new C();
        c.public_i = 0;
        c.public_f();
    }
}
