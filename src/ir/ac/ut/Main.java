package ir.ac.ut;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.public_i = 0;
        a.protected_i = 0;
        a.i = 0;
        a.public_f();
        a.protected_f();
        a.f();


        A bAsA = new B();

        a = bAsA;

        B aAsB = (B) bAsA;
    }
}
