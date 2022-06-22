package coreJavaConcepts;

class v {
	public void show() {
		System.out.println("in v");
	}

}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		v obj = new v() {
			public void show() {
				System.out.println("in u");
			}
		};
		obj.show();

	}
}
