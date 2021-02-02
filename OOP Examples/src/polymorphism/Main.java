package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myCat = new Cat();  // Create a Cat object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myCat.animalSound();
	}

}
