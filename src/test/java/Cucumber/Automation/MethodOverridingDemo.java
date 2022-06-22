package Cucumber.Automation;

class C {
	public void show() {
		System.out.println("in A");
	}

}

class D extends C {
	public void show() {
		super.show();
		System.out.println("in B");
	}
}

class E extends C {

	public void show() {
		System.out.println("in E");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj = new D(); // runTimePolymorphism
		obj.show();

		obj = new E(); // Dynamic Method Dispatch
		obj.show();
	}

}
