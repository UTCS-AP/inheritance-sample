package ir.ac.ut.c;

import ir.ac.ut.A;

public class C extends A {
    public static int I = 0;

    public int public_i;

    public C() {
        this.public_i = 0;
        super.public_i = 1;
        this.protected_i = 0;
        this.public_f();
        this.protected_f();

        A a = new A();
        a.public_i = 0;
        a.public_f();
    }

    public void public_f() {}

    protected void protected_f() {}

    public void g() {
        System.out.println("C#g() was called.");
    }
}
