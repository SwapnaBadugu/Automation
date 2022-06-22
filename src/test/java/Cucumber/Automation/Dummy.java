package Cucumber.Automation;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;

		if (n == 0) {
			System.out.println("nothing");
		} else if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		{

			int i = 9;
			int j = 5;

			j = i > 6 ? 1 : 2;
			System.out.println(j);

		}
		{
			int k = 3;

			switch (k) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
			case 5:
				System.out.println("five");
			default:
				System.out.println("six");
			}
		}
		{
			String abc = "Kavya";
			switch (abc) {
			case "Kavya": {
				System.out.println("High");
				break;
			}
			case "Swapna": {

				System.out.println("Stylist");
			}
			}
		}
		
		
		
		{
			int k=1;
			while(k>=9) {
				
				System.out.println("true");
				k++;
			}
		}
	}
}

