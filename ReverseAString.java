package BasicPrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String ");
		String inputStr = scan.nextLine();
		
		System.out.println("Entered String : " + inputStr);

		char[] eachLetter = inputStr.toCharArray();
		for(int i = eachLetter.length -1 ; i >= 0; i--) {
			System.out.print(eachLetter[i]);
		}
		
	}

}
