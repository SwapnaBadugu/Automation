package Cucumber.Automation;

class Student {
	int sub1M;
	int sub2M;
	int result;

	public void perform() {
		result = sub1M + sub2M;

	}

}

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S = new Student();
		S.sub1M = 4;
		S.sub2M = 6;
		S.perform();
		System.out.println(S.result);

	}
}
