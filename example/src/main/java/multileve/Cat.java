package multileve;

public class Cat extends Dog{
	public void sing() {
		System.out.println("singing");
	}

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.sing();
		obj.bark();
		obj.eat();
		// TODO Auto-generated method stub

	}

}
