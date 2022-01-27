package demo1;

public class SwapWith {

	public static void main(String[] args) {
		int a = 10;
		int b = 5, temp;
		System.out.println("Before Swapping : a = " + a + ", b = " + b);
		temp = b;
		b = a;
		a = temp;
		System.out.println("After Swapping : a = " + a + ", b = " + b);

	}

}
