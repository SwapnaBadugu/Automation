package Cucumber.Automation;

public class ConstructorExample {
	int num1;
	int num2;
	int result;

	public ConstructorExample() {
		System.out.println("in Constructor");

		num1=6;
		num2=8;
		result= num1+num2;
	}
  public ConstructorExample(int num1,int num2) {
		System.out.println("in method overloading Constructor");

		this.num1=num1;
		this.num2=num2;
		result= num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorExample ce = new ConstructorExample(6,5);

		System.out.println(ce.result);
		System.out.println(ce.num1);
		System.out.println(ce.num2);


	}

}
