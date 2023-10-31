package Quiz6;

class A {
    protected int a1;
    protected double a2;
    protected boolean a3;
    public A() {
        a1 = 0;
        a2 = 0;
        a3 = false;
        System.out.println("A's default constructor is invoked");
    }
    public A(int a1, double a2, boolean a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        System.out.println("A's overloaded constructor is invoked");
    }
}
class B extends A {
    protected char b1;
    public B() {
        b1 = ' ';
        System.out.println("B's default constructor is invoked");
    }
    public B(int a1, double a2, boolean a3, char b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.b1 = b1;
        System.out.println("B's overloaded constructor");
    }
}

class C extends B {
    protected String c1;
    public C() {
        super(); // super in this case
        c1 = " ";
        System.out.println("C's default constructor");
    }
    public C(int a1, double a2, boolean a3, char b1, String c1) {
        super(a1,a1,a3,b1);
        this.c1 = c1;
        System.out.println("C's overloaded constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        C obj1 = new C();
        // first, default constructor of superclass (A) is invoked
        // then, explicitly
        
        
        C obj2 = new C(1, 1.5,true, 't', "True");
    }
}
