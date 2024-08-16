package aggregation;

public class Aggregation2 {
	Aggregation1 agr;
	String name;
	public Aggregation2(Aggregation1 agr,String name) {
		
	this.agr=agr;
	this.name=name;
	}
	public void display() {
		System.out.println("value"+agr.a);
		System.out.println("Name is"+name);
	}

	public static void main(String[] args) {
		Aggregation1 ag1=new Aggregation1(10);
		Aggregation2 ag2=new Aggregation2(ag1,"harishma");
		ag2.display();
		// TODO Auto-generated method stub

	}

}
