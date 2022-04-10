/*
 Naveen Reddy
 C0838989
 Question-5
 2022-01-05
 */
package q5;

public class Q5 {

	public static void main(String[] args)

	{
		// the data for this variables is obtained from question
		final double COST_OF_THE_STEREO_SYSTEM = 1000.00d;
		final double INTEREST_RATE_PER_YEAR = 0.18d;
		final double MONTHLY_PAYMENT = 50.00d;

		int no_of_Months = 0;
		double interest = 0;
		double total__Interest = 0;
		double debt = COST_OF_THE_STEREO_SYSTEM;
		double interest_Rate_Per_Month = INTEREST_RATE_PER_YEAR / 12;
		double principal = 0;

		// checking debt is grater than 0
		while (debt > 0) {
			interest = debt * interest_Rate_Per_Month;
			// if debt is graterthan monthly pament it enter here
			if (debt >= MONTHLY_PAYMENT)
				principal = MONTHLY_PAYMENT - interest;

			else
				principal = debt;
			debt = debt - principal;
			no_of_Months++;
			total__Interest += interest;

		}
		// printing calculated output
		System.out.println("*****************************************************");
		System.out.printf("Amount of loan: $%.2f\n", COST_OF_THE_STEREO_SYSTEM);
		System.out.printf("Interest rate per year: %.2f%%\n", (INTEREST_RATE_PER_YEAR * 100));
		System.out.println("*****************************************************");
		System.out.printf("Monthly payment is : $%.2f\n", MONTHLY_PAYMENT);
		System.out.println("The Number of months needed to pay the loan is : " + no_of_Months);
		System.out.printf("Total amount of interest paid is : $%.2f\n", total__Interest);
	}
}
