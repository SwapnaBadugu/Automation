package Cucumber.Automation;

class emp {
	String empN;
	String empD;
	static String empCEO;

	public void show() {

		System.out.println(empN + ":" + empD + ":" + empCEO);

	}
}

public class StaticDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emp e1 = new emp();

		e1.empN = "Naresh";
		e1.empD = "TechArch";
		emp.empCEO = "Kumar";

		emp e2 = new emp();
		e2.empN = "srikanth";
		e2.empD = "Manager";
		emp.empCEO = "kumar";

		emp.empCEO = "Nikita";

		e1.show();
		e2.show();

	}

}
