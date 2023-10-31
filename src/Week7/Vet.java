package Week7;
/**
 * This class defines a vet
 *
 */

public class Vet {
	protected String name;
	public Vet() {
		name = " ";
	}
	public Vet(String name) {
		this.name = name;
	}
	
	public void giveShot(Animal animal) {
		animal.makeNoise();
	}	
	
	public Animal giveBirth(Animal animal) {
		animal.makeNoise();
		Animal baby;
		if (animal instanceof Dog)
			baby = new Dog();
		else if (animal instanceof Cat)
			baby = new Cat();
		else baby = new Owl();
		return baby;
	}
}



