package polymorphism;

public class Child1 extends Parent{
	public void add() {
		int a=45;
		int b=78;
		System.out.println(a-b);
		super.add();
	}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.add();
		// TODO Auto-generated method stub

	}

}
