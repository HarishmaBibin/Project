package exception;

public class ExampleAge {
public void vote() {
	int age=16;
	if(age>=18) {
		System.out.println("eligible for voting");
			
	}
	else {
		//System.out.println("not eligible for voting");
		throw new ArithmeticException("not eligible");
	}
	}
	public static void main(String args[]){
		ExampleAge ea=new ExampleAge();
		ea.vote();
		
	
}
}
