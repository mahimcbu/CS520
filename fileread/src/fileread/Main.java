package fileread;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		Scanner file = null;
		try {
			file = new Scanner(new FileInputStream("/Users/mahimchoudhury/Hellothere.txt"));
			
		}catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
			System.exit(0);
		}
		int value;
		String name;
		String name2;
		System.out.println("More text to read?" + file.hasNextLine());
		name = file.next();
		value = file.nextInt(); //or make value a string and use next()
		file.nextLine(); //This deletes junk space \n after nextInt() line 
		name2 = file.nextLine();
		System.out.println("Name "+ name);	
		System.out.println("Value "+ value);
		System.out.println("Name2 "+ name2);
		System.out.println("More text to read?" + file.hasNextLine());
		file.close();
	}

}
