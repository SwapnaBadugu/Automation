package coreJavaConcepts;

interface Y {
	public abstract void show();
}

class X implements Y {
	public void show() {
		System.out.println("in Y");
	}
}

class W implements Y {
	public void show() {
		System.out.println("in W");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Y obj = new X();
		obj.show();
		Y obj1 = new W();
		obj1.show();
	}

}
