package BasicPrograms;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Principal Amount ");
		double principalAmount = scan.nextInt();
		System.out.println("Enter Rate Of Interest ");
		double rateOfInterest = scan.nextInt();
		System.out.println("Enter Number Of Years ");
		int numberOfYears = scan.nextInt();

		System.out.println(principalAmount + " : " + rateOfInterest + " : " + numberOfYears);

		rateOfInterest = rateOfInterest / 100;
		double maturityAmount = calculateCompoundInterest(principalAmount, rateOfInterest, numberOfYears);
		System.out.println("Maturity Amount :: " + maturityAmount);
	}

	public static double calculateCompoundInterest(double principalAmount, double rateOfInterest, int numberOfYears) {
		if (numberOfYears > 0) {
			principalAmount += principalAmount * rateOfInterest ;
			System.out.println("principalAmount  " + principalAmount  + " by " + numberOfYears);
			return (calculateCompoundInterest(principalAmount, rateOfInterest, numberOfYears - 1));
		}
		return principalAmount;
		
		/*
		 * principalAmount += principalAmount * rateOfInterest ;
		 * return (calculateCompoundInterest(principalAmount,
		 * rateOfInterest, numberOfYears - 1));
		 */
	}
}





