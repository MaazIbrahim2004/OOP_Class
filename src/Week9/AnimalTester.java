import java.util.*;

public class AnimalTester {
	public static void main(String[] args) {
		
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		//Animal animal = new Animal();		
		Animal herOwl = new Owl();
		Dog myPet = new Dog();
		Cat hisCat = new Cat();
		
		//myPet.eat();
		zoo.add(herOwl);
		zoo.add(myPet);
		zoo.add(hisCat);
		
		
		for (Animal a:zoo)
			a.eat();
		
		
	}

}
