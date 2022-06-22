package coreJavaConcepts;

public class SwitchTernaryOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 9;
		int j = 10;

		i = i > j ? 1 : 2;
		System.out.println(i);

		int k = 2;
		switch (k) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
		case 4:
			System.out.println("Four");
		case 5:
			System.out.println("Five");
		default:
			System.out.println("Nothing");

		}
	}

}
