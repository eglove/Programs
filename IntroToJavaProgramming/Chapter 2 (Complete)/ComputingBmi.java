/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated
 * by taking your weight in kilograms and dividing by the square of your height
 * in meters. Write a program that prompts the user to enter a weight in pounds
 * and height in inches and displays the BMI. NOte that one pounds is 
 * 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 */
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class ComputingBmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		double kilos = weight * 0.45359237;
		double meters = height * 0.0254;
		double bmi = kilos / (Math.pow(meters,2));
		
		System.out.println("BMI is " + df.format(bmi));
	}
}