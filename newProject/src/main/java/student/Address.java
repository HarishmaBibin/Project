package student;

public class Address {
	Student st;
	String address;
	public Address(Student st,String address) {
		this.st = st;
		this.address = address;
	}
	public void display() {
		System.out.println(st.name);
		System.out.println(st.rollNumber);
		System.out.println(address);
	}
	public static void main(String[] args) {
		Student stu = new Student("Harishma",30);
		Address  add = new Address(stu,"Chirathalakkal House");
		add.display();

	}

}
