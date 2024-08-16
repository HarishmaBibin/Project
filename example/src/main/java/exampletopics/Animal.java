package exampletopics;

public class Animal extends Single{
	public void bark() {
		System.out.println("barking");
	}
	public static void main(String[] args) {
		Animal an = new Animal();
		an.eat();
		an.bark();

	}

}
