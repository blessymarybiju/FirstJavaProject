package additionOf2Numbers;

import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {
		
		AddTwoNumbers an= new AddTwoNumbers();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1:");
		an.num1=sc.nextInt();
		System.out.println("Enter num2:");
		an.num2=sc.nextInt();
		an.addNum1And2();
		sc.close();

	}

}
