package hierarchical;

public class Dog extends Animal{
	public void sing() {
		System.out.println("singing");
	}

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.sing();
		// TODO Auto-generated method stub

	}

}
