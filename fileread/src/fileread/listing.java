package fileread;

import java.util.Scanner;

public class listing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mylist = {2,5,3,9,0,4}; //array
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		//
		for(int n:mylist) {
			System.out.println(n + " index: \""+ count+ "\"");
			//n++;
			count++;
		}
		//
		System.out.println("\n"); //This basically prints out the index
		for(int i=0; i< mylist.length; i++) {
			System.out.println(i);
		}
		//
		System.out.println("\n"); //prints out the elements in the list
		for(int n:mylist) {
			System.out.println(n);			
			if (n == mylist[3]) {
				break;
			}
			n++;
		}
		//
		System.out.println("\n");
		for(int j = 0; j<names.length;j++) {
			System.out.println("Please enter the name " + j +":");
			String inputs = sc.nextLine();
			names[j] = inputs;
		}
		//
		System.out.println("\n");
		for(String m:names) {
			System.out.println(m);
			
		}

	}

}
