//Encapsulation --> Binding data with methods
package coreJavaConcepts;

class Student {
	private int Srollno;
	private String Sname;

	// Getters and Setters
	public int getSrollno() {
		return Srollno;
	}

	public void setSrollno(int srollno) {
		Srollno = srollno;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student S1 = new Student();
		S1.setSrollno(2);
		S1.setSname("Ramesh");
		System.out.println(S1.getSrollno());
		System.out.println(S1.getSname());
	}

}
