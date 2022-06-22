package coreJavaConcepts;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= new int[5];
			a[4]=7;
			int i = 6;
			int j = 2;
			int k = i / j;
			System.out.println(k);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound");
		} catch (Exception e) {
			System.out.println("error");

		} finally {
			System.out.println("bye");
		}

	}
}
