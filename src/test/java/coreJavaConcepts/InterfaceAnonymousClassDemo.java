package coreJavaConcepts;

interface S {
	void show();
}

public class InterfaceAnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S obj = new S() {
			public void show() {
				System.out.println("in anonymous class");
			}
		};
		obj.show();
	}

}
