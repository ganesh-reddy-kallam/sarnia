/*
 Naveen Reddy
 C0838989
 Question-3
 2022-01-05
 */
package q3;

import javax.swing.JOptionPane;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable for fathers height:
		int f_height;
		// variable for mothers height:
		int m_height;
		// variable for total calculated and expected height:
		int p_height;
		// string variable for Gender:
		String Gender;
		// string variable for taking choice
		String input;
		// variable to store choice
		int choice;
		// variable to store feet
		int feet;

		System.out.println("HELLO WELCOME TO HEIGHT PREDICTOR APP :");
		System.out.println("--------------------------------------------------------------------------------------");

		// taking input from user for choice
		input = JOptionPane.showInputDialog("Select Your choice \n 1.inches \n 2.feet: ");
		// converting it to input
		choice = Integer.parseInt(input);
		// taking input from user for gender
		Gender = JOptionPane.showInputDialog("PLESE ENTER YOUR GENDER : ").toUpperCase();
		System.out.println("Your gender is : " + Gender);

		// switch case statement for choice
		switch (choice) {
		// if user chooses (inches option) by clicking 1 it enters into case 1
		case 1:
			int fe_height = 0;
			// input from user for mothers height
			input = JOptionPane.showInputDialog("Enter your Mother's height in (inches): ");
			// converting into integer
			m_height = Integer.parseInt(input);
			// input from user for father height
			input = JOptionPane.showInputDialog("Enter your Fathers's height in (inches) : ");
			f_height = Integer.parseInt(input);
			// decision making statement if it is male it goes to if condition
			if (Gender.equals("MALE") || Gender.equals("M")) {
				p_height = ((m_height * 13 / 12) + f_height) / 2;
				fe_height = p_height % 12;
				feet = (p_height / 12);
				System.out.println("Your height is going to be around in " + p_height + " inches is : " + "and " + feet
						+ " feet, " + fe_height + " inches");

			}
			// if it is female it goes to this condition
			else if (Gender.equals("FEMALE") || Gender.equals("F")) {
				p_height = ((f_height * 12 / 13) + m_height) / 2;
				fe_height = p_height % 12;
				feet = (p_height / 12);
				System.out.println("Your height is going to be around in " + p_height + " inches is : " + "and " + feet
						+ " feet, " + fe_height + " inches");

			}
			// if entered choice is not in if or else if condition it enters into else
			// condition
			else {
				System.out.print("Please enter appropriate Gender to predict your height.");
			}

			break;
		// if user chooses (inches option) by clicking 1 it enters into case 2
		case 2:
			int inches_converted_m = 0;
			int inches_converted_f = 0;
			int feet2;
			int inches2;
			int inches_mother;
			int inches_father;
			String input_inches;

			// input from user for mothers height
			input = JOptionPane.showInputDialog("Enter your Mother's height in (feet): ");
			m_height = Integer.parseInt(input);
			input_inches = JOptionPane.showInputDialog("Enter your Mother's height " + m_height + " and inches ?");
			inches_mother = Integer.parseInt(input_inches);
			inches_converted_m = (m_height * 12) + inches_mother;

			// input from user for father height
			input = JOptionPane.showInputDialog("Enter your Fathers's height in (feet) : ");
			f_height = Integer.parseInt(input);
			input_inches = JOptionPane.showInputDialog("Enter your Father's height " + f_height + " feet and inches ?");
			inches_father = Integer.parseInt(input_inches);
			inches_converted_f = (f_height * 12) + inches_father;

			// decision making statement if it is male it goes to if condition
			if (Gender.equals("MALE") || Gender.equals("M")) {
				p_height = ((inches_converted_m * 13 / 12) + inches_converted_f) / 2;
				feet2 = (p_height / 12);
				inches2 = (p_height % 12);
				System.out.println("Your height is going to be around in : " + p_height + " inches and " + feet2
						+ " feet," + inches2 + " inches");
				JOptionPane.showMessageDialog(null, "Your height is going to be around in : " + p_height
						+ " inches and " + feet2 + " feet," + inches2 + " inches");
			}
			// if it is female it goes to this condition
			else if (Gender.equals("FEMALE") || Gender.equals("F")) {
				p_height = ((inches_converted_f * 12 / 13) + inches_converted_m) / 2;
				feet2 = (p_height / 12);
				inches2 = (p_height % 12);
				System.out.println("Your height is going to be around in  : " + p_height + " inches and " + feet2
						+ " feet," + inches2 + " inches");
				JOptionPane.showMessageDialog(null, "Your height is going to be around in  : " + p_height
						+ " inches and " + feet2 + " feet," + inches2 + " inches");
			}
			// if entered choice is not in if or else if condition it enters into else
			// condition
			else {
				System.out.print("Please enter appropriate Gender to predict your height.");
			}
			break;
		}

	}
}
