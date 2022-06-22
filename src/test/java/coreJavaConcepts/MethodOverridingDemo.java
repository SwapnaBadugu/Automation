package coreJavaConcepts;

class A {
	public void show() {
		System.out.println("in A");
	}
}

class B extends A {
	@Override

	public void show() {
		System.out.println("in B");
	}
}

class C extends A {
	@Override

	public void show() {
		System.out.println("in C");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new B();
		obj.show(); // RunTime Polymorphism

		obj = new C();
		obj.show(); // Dynamic Method Dispatch

	}

}
