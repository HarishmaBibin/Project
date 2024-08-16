package abstraction;

public class InterfaceClass implements InterfaceExample,Example1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass ic=new InterfaceClass();
		ic.display();
		//interfacename in =new classname
		InterfaceExample ie= new InterfaceClass();
		ie.display();
		Example1 obj  = new InterfaceClass ();
		obj.sub();
	}

	public void display() {
		// TODO Auto-generated method stub
		int c =a+b;
		System.out.println (c);
	}

	public void sub() {
		// TODO Auto-generated method stub
	int f = d-e;
	System.out.println(f);
	}

}
