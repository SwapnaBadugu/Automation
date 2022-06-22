package coreJavaConcepts;

abstract class Writer { // Abstract class
	public abstract void write(Number i);

}

class pen extends Writer { // Concrete Class
	public void write(Number i) {
		System.out.println(i);

	}
}

class pencil extends Writer {
	public void write(Number i) {
		System.out.println(i);

	}
}

public class AdstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Writer obj = new pen();
		obj.write(5);
		Writer obj1 = new pencil();
		obj.write(5.5);
	}

}
