package ir.ac.ut;

public class B extends A {
    public B() {
        this.public_i = 0;
        this.protected_i = 0;
        this.i = 0;
        this.public_f();
        this.protected_f();
        this.public_f();

        A a = new A();
        a.public_i = 0;
        a.protected_i = 0;
        a.i = 0;
        a.public_f();
        a.protected_f();
        a.f();
    }

    public void public_f() {}

    protected void protected_f() {}

    void f() {}
}
