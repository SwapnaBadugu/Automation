package Cucumber.Automation;

public class MODemo {

	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MODemo md = new MODemo();
		md.add(6, 7);
		md.add(7, 8, 9);

	}

}
