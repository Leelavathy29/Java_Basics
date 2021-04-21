package BasicPrograms;

import java.util.Scanner;

public class ReverseAStringUsingRecursion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String ");
		String inputStr = scan.nextLine();

		System.out.println("Entered String : " + inputStr);

		ReverseAStringUsingRecursion recursion = new ReverseAStringUsingRecursion();
		recursion.reverse(inputStr);

	}

	public void reverse(String inputStr) {

		if (inputStr != null) {
			if (inputStr.length() <= 1) {
				System.out.println(inputStr);
			} else {
				System.out.print(inputStr.charAt(inputStr.length() - 1));
				reverse(inputStr.substring(0, inputStr.length() - 1));
			}
		}

	}
}
