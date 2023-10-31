package Quiz6;

class D {
    protected int a1;

    public D() {
        a1 = 0;
        System.out.println("D's Default Constructor.");
    }

    public D(int a1) {
        this.a1 = a1;
        System.out.println("D's Overloaded Constructor.");
    }
}

class E extends D {
    protected char b1;

    public E() {
        b1 = ' ';
        System.out.println("E's Default Constructor.");
    }

    public E(int a1, char b1) {
        super(a1);
        this.b1 = b1;
        System.out.println("E's Overloaded Constructor.");
    }
}

class F extends E {
    protected String c1;

    public F() {
        super();
        c1 = "";
        System.out.println("F's Default Constructor.");
    }

    public F(String c1) {
        this.c1 = c1; // this.c1 refers to the instance variable c1 of class F
        System.out.println("F's First Overloaded Constructor.");
    }

    public F(int a1, char b1, String c1) {
        this(c1);
        this.a1 = a1;
        this.b1 = b1;
        System.out.println("F's Second Overloaded Constructor.");
    }
}

public class Mai {
    public static void main(String[] args) {
        F obj1 = new F("true");
        F obj2 = new F(1, 't', "True");
    }
}
