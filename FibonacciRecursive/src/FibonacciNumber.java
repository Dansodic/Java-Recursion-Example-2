import java.util.Scanner;

//Daniel Kenny
//21/09/2019
//An example of a recursive function  to find the Fibonacci number given an int input
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		
		System.out.println("Enter an int:");
		
		userInput = sc.nextInt();
		
		System.out.println("The Fibonacci number at position " + userInput + " is " + fib(userInput));

	}
	
	public static int fib(int n) {
		if(n >=3) {
			return fib(n -1) + fib(n - 2);
		}
		else {
			return 1;
		}
	}

}
