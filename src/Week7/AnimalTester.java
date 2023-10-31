


public class AnimalTester {
	public static void main(String[] args) {

		Animal anAnimal = new Animal();
		Dog myDog = new Dog();
		Cat herCat = new Cat();
		Owl hisOwl = new Owl();
		
		Vet john = new Vet("John");
		
		john.giveShot(anAnimal);
		john.giveShot(myDog);
		john.giveShot(herCat);
		john.giveShot(hisOwl);
		System.out.println("___________________________");
		
		Animal theDog = new Dog();
		Vet theVet = new Vet("Jane");
		theVet.giveShot(theDog);
		System.out.println("___________________________");
		
		
		// giveBirth returns an animal
		Animal puppy1 = theVet.giveBirth(theDog);
		Dog puppy2 = (Dog) theVet.giveBirth(theDog);
		System.out.println("___________________________");
		
		//Dynamic Dispatch
		// you need to think in which class the method is invoked (hint: Declared type :) )
		// also you need to find to which class the execution is dispatched 
		Object obj1 = new Dog();
		System.out.println(obj1.toString());
		Animal obj2 = new Dog();
		System.out.println(obj2.toString());
		Dog obj3 = new Dog();
		System.out.println(obj3.toString());
		Object obj4 = new Cat();
		System.out.println(obj4.toString());
		Animal obj5 = new Cat();
		System.out.println(obj5.toString());
		Cat obj6 = new Cat();
		System.out.println(obj6.toString());

	

	}

}


