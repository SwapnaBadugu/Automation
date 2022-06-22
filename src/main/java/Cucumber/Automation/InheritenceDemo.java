package Cucumber.Automation;

class Calcu { // Super/parent

	public int add(int i, int j) {
		return i + j;
	}
}

class AdvCalcu extends Calcu { // Sub/child
	public int sub(int i, int j) {
		return i - j;
	}

}

class veryAdvCalcu extends AdvCalcu { // Sub/child
	public int mul(int i, int j) {
		return i * j;
	}

}

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		veryAdvCalcu c = new veryAdvCalcu();

		int result = c.add(6, 4);
		int result1 = c.sub(10, 4);
		int result2 = c.mul(4, 4);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);


	}

}
