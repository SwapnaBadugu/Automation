package coreJavaConcepts;

interface N {
	void show();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		N obj = () -> System.out.println("in interface");

		obj.show();
	}

}
