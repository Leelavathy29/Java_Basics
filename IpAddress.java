package IpAddressValid;

import java.util.Scanner;

public class IpAddress {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input");
		String ipAddress = scan.nextLine();
		if (ipAddress == "" || ipAddress == " ") {//equals
			System.out.println("You Have Entered Empty IP Address");
		} else {
			IpAddressValidation validation = new IpAddressValidation();
			String validIpAddress = validation.checkValiditiyOfIpAddress(ipAddress);
			System.out.println("Given IP is " + validIpAddress);
		}
	}
}
