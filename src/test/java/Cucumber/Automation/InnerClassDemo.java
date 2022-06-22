package Cucumber.Automation;

class Outer {

	int i;

	public static void show() {
		System.out.println("in Outer");
	}

	static class Inner {

		public static void display() {
			System.out.println("in Inner");

		}
	}

}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();

	}

}
