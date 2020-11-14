import java.util.Scanner;
public class Main {
	public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
		if (hoursPerWeek < 0) {
			return -1;
		}
		if (amountPerHour < 0) {
			return -1;
		}
		double weeklyPaycheck = hoursPerWeek * amountPerHour;
		double unpaidTime = vacationDays * amountPerHour * 8;
		return (weeklyPaycheck * 52) - unpaidTime;
	}

	public static void printSalary(double yourSalary){
		System.out.println("Your Salary is " + yourSalary + " USD.");
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many hours do you work in a week?");
		double hoursPerWeek = input.nextDouble();

		System.out.println("How much do get for working one hour in USD?");
		double amountPerHour = input.nextDouble();

		System.out.println("How many days do you use on vacation in one year?");
		int vacationDays = input.nextInt();

		double salary = salaryCalculator(hoursPerWeek, amountPerHour,vacationDays);
		printSalary(salary);	}
}