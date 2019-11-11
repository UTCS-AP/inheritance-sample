package ir.ac.ut;

import ir.ac.ut.c.C;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.public_i = 0;
        a.protected_i = 0;
        a.i = 0;
        a.public_f();
        a.protected_f();
        a.f();

        f(new A());

        f(new B());

        f(new C());

        System.out.println("---------------");

        A bAsA = new B();

        f(a);

        f(bAsA);

        System.out.println("---------------");

        A a0 = new A();
        A a1 = new B();
        A a2 = new C();

        a0.g();
        a1.g();
        a2.g();

        a = bAsA;

        B aAsB = (B) bAsA;

        C c = new C();

        System.out.println(C.I);

    }

    static void f(A a) {
        System.out.println("f(A) was called.");
    }

    static void f(B b) {
        System.out.println("f(B) was called.");
    }
}
