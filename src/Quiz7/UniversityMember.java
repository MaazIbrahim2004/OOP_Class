package Quiz7;

public class UniversityMember {
    String name;

    public String toString() {
        return "A University Member";
    }
}

class Student extends UniversityMember {

}

class Staff extends UniversityMember {
    public String toString() {
        return "A Staff";
    }
}

class Undergraduate extends Student {
    public String toString() {
        return "An Undergrad Student";
    }
}

class Graduate extends Student {
}

class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        UniversityMember me = new UniversityMember();
        Student she = new Student();
        Staff he = new Staff();
        Undergraduate you = new Undergraduate();
        Graduate they = new Graduate();

        Undergraduate john = new Undergraduate();
        Student jane = new Undergraduate();
        UniversityMember jack = new Undergraduate();
        Object jade = new Undergraduate();

        Graduate rose = new Graduate();
        Student rory = new Graduate();
        UniversityMember roy = new Graduate();
        Object richard = new Graduate();

        System.out.println(obj);
        System.out.println(john);
        System.out.println(me);
        System.out.println(roy);// prints undergrad student because university member is the parent class of undergrad student, so it will print the child class
        System.out.println(rory);
        System.out.println(john);
        System.out.println(she);
        System.out.println(jack);
        System.out.println(he);
        System.out.println(rose);
        System.out.println(you);
        System.out.println(jane);
        System.out.println(they);
        System.out.println(richard);
        System.out.println(jade);

    }
}

