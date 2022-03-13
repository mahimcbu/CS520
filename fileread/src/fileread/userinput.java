package fileread;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a value: ");
		int value = sc.nextInt();
		sc.nextLine();
		System.out.println("Please input a sentence: ");
		String text = sc.nextLine();
		System.out.println("Please input a double value: ");
		double points1 = sc.nextDouble();
		
		System.out.println("You entered: "+ value);
		System.out.println("You entered: "+ text);
		System.out.println("You entered: "+ points1);
	}

}
