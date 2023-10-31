package Quiz6;

class Animal {

    public Animal() {
        this.makeNoise();
    }

    private void makeNoise() {
        System.out.print("This animal ");
    }
}

class Cat extends Animal {
    int frequency;

    public Cat(int freq) {
        super();
        this.frequency = freq;
    }

    public void makeNoise() {
        System.out.println("meows " + frequency + " times");
    }
}

public class Test {
    public static void main(String[] args) {
        Cat myCat = new Cat(3);
        myCat.makeNoise();
    }
}
