package ir.ac.ut;

public class A {
    static int I = 1;

    public int public_i;
    int i;
    protected int protected_i;
    private int private_i;

    public void public_f() {}
    void f() {}
    protected void protected_f() {}
    private void private_f() {}

    public void g() {
        System.out.println("A#g() was called.");
    }
}
