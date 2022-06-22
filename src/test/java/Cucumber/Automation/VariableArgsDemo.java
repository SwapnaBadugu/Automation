package Cucumber.Automation;

class cal {

	public int add(int... n) {// Variable Length Arguments
		int sum = 0;
		for (int k : n) {
			sum = sum + k;
		}
		return sum;

	}
}

public class VariableArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cal obj = new cal();
		System.out.println(obj.add(43, 65, 34, 3, 34, 5, 50));

	}

}
