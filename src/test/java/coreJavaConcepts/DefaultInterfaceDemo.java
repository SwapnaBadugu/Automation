package coreJavaConcepts;

interface demo {
	void show();

	default void add() {
		System.out.println("in add");

	}
}

class demoimp implements demo {
	public void show() {
		System.out.println("in show");

	}
	public void add() {
		System.out.println("in show");
	}

}

public class DefaultInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo obj = new demoimp();
		obj.show();
		obj.add();
	}

}
