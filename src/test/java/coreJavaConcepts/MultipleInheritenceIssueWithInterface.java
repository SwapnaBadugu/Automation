package coreJavaConcepts;

interface Demos {
	default void show() {
		System.out.println("in Demo show");
	}

}

interface ImpDemos {
	default void show() {
		System.out.println("in ImpDemos");

	}
}

class AdvDemo implements Demos, ImpDemos {

	public void add() {
		System.out.println("in AdvDemo");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		ImpDemos.super.show();
	}

}

public class MultipleInheritenceIssueWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvDemo obj = new AdvDemo();
		obj.show();
		obj.add();

	}

}
