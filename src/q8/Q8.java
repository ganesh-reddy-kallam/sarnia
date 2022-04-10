/*
 Naveen Reddy
 C0838989
 Question-8
 2022-01-05
 */
package q8;

public class Q8 {

	public static void main(String[] args) {
		// loops to check till 9
		for (int T = 0; T <= 9; T++) {
			for (int O = 0; O <= 9; O++) {
				for (int G = 0; G <= 9; G++) {
					for (int D = 0; D <= 9; D++) {
						if (T != O && T != D && T != G && G != O && G != D && D != O) {
							int too = (100 * T) + (10 * O) + O;
							int good = (1000 * G) + (100 * O) + (10 * O) + D;
							// checking the condition
							if (4 * too == good) {
								System.out.println("The possible number of solutions is : ");
								System.out.println("The value of T : " + T);
								System.out.println("The value of O : " + O);
								System.out.println("The value of D : " + D);
								System.out.println("The value of G : " + G);

								System.out.println("The values of [TOO + TOO + TOO + TOO ] is  : " + 4 * too
										+ " and value of [GOOD] is = " + good
										+ " both are equal and condition satisfied.");
								System.out.println(
										"------------------------------------------------------------------------------------------------------------------------------------");

								break;
							}

						}
					}
				}
			}
		}
	}
}
