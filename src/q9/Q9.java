/*
 Naveen Reddy
 C0838989
 Question-9
 2022-01-05
 */
package q9;

import javax.swing.JOptionPane;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float percentage = 00.00f;
		int total_score = 0;
		float total__max_score = 0;
		// taking input from user how many exercises
		String input = JOptionPane.showInputDialog("How many exercises to input");
		int exercise = Integer.parseInt(input);
		for (int i = 1; i < exercise + 1; i++) {
			// input to take scores from user
			String input1 = JOptionPane.showInputDialog("Score recived for excercise " + i + " :");
			int scorei = Integer.parseInt(input1);
			int score1[] = new int[exercise + 1];
			score1[i] = scorei;
			// input to take possible scores from user
			String input2 = JOptionPane.showInputDialog("Total Points possible for Exercise " + i + " :");
			int scorej = Integer.parseInt(input2);
			int score2[] = new int[exercise + 1];
			score2[i] = scorej;
			// total score calculation
			total_score = total_score + score1[i];
			// total score possible
			total__max_score = total__max_score + score2[i];
			// total percentage
			percentage = ((total_score / total__max_score) * 100);

			System.out.println("the score of excersie " + i + " is : " + score1[i]
					+ " and Total Points possible for Exercise " + i + " is  " + score2[i]);
			System.out.println(
					"---------------------------------------------------------------------------------------------------------");
			if (i == score1.length - 1) {
				if (percentage < 99.99) {
					System.out.println("******************************************************************");
					System.out.println("The percentage you scored is : " + String.format("%.2f", percentage) + "%");

					System.out.println("******************************************************************");
					System.out.println("Your Total score is  : " + total_score);
					System.out.println("Out of possible score  : " + String.format("%.0f", total__max_score));
				} else {
					System.out.println("please enter correct scores");
				}
			}

		}
	}
}
