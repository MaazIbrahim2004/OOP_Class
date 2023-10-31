package Quiz6;

class G {
    protected void method1() {
        System.out.println("G1");
    }
    protected void method2() {
        this.method1();
        System.out.println("G2");
    }
}

class H extends G {
    @Override
    protected void method1() {
        System.out.println("H1");
    }
}

public class I extends H {
    @Override
    protected void method2() {
        super.method2();
        super.method1(); // since method1 is overridden in H, this will call the method1 in H instead of G because
        // when you override a method, the method in the subclass takes precedence over the method in the superclass
        System.out.println("H2");
    }

    public static void main(String[] args) {
        I obj = new I();
        obj.method1();
        obj.method2();
    }
}

