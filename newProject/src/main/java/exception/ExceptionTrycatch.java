package exception;

public class ExceptionTrycatch {
public void division() {
	try {
	int a=10/0;
	System.out.println(a);
	}
	catch(Exception e) {
		System.out.println( " Exception handled"+e);
	
	}
	finally {
		System.out.println("hello");
	}
	}

public static void main(String args[]) {
	ExceptionTrycatch ex=new ExceptionTrycatch();
	ex.division();
}
}
