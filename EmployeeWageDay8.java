

//import java.util.Scanner;
//public class EmployeeWageDay8{
//
//	public static void main(String args[])
//	{
//		EmpWageCalculator company1 =new EmpWageCalculator ();
//		EmpWageCalculator company2 =new EmpWageCalculator ();
//		EmpWageCalculator company3 =new EmpWageCalculator ();
//
//
//		company1.wage ("Company1");
//		company2.wage ("Company2");
//		company3.wage ("Company3");
//
//
//	}
//}
//class EmpWageCalculator {
//
//	public void wage(String company ) {
//		int max = 1;
//		int min = 0;
//		int range = max - min + 1;
//		Scanner input = new Scanner ( System.in );
//		// generate random number
//
//		int rand = (int) (Math.random ( ) * range) + min;  //UC1 -CHECK EMPLOYEE PRESENT OR ABSANT
//
//
//
//
//
//		if (rand == 1) {
//
//			System.out.println ( "Employee Present " );
//
//
//			System.out.println ( "Employee belongs to " +company );
//
//
//			System.out.println ( "   Employee type 1.FULL TIME   2.PART TIME " );
//			int employee_type = input.nextInt ( );
//
//
//			switch (employee_type) {     // UC4--SOLVING USING SWITCH STATEMENT
//
//
//				case 1:
//					System.out.println ( "Daily Wage  Employee " );  //UC2 -DAILY WAGE EMPLOYEE
//
//					System.out.println ( "Daily   Employee wage Per Hour " );
//
//					int wagePerHour = input.nextInt ( );
//					System.out.println ( "No of Working Hours Per Day " );
//					int noofWorkingHoursPerDay = input.nextInt ( );
//
//					System.out.println ( "Working Days in Month " );
//
//					int workingDaysinMonth = input.nextInt ( );
//
//					int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
//					System.out.println ( "Employee wage per day is $" + empSalaryperDay );
//					int monthlySalary = empSalaryperDay * workingDaysinMonth;  //UC5 AND UC6-CALCULATING WAGES FOR MONTH
//					System.out.println ( "Employee wage per month is $" + monthlySalary );
//					break;
//
//				case 2:
//
//					System.out.println ( "Part time Employee " );   ////UC3 -PART TIME EMPLOYEE
//					System.out.println ( "Daily   Employee wage Per Hour " );
//
//					wagePerHour = input.nextInt ( );
//					System.out.println ( "No ofWorkingHoursPerDay " );
//					noofWorkingHoursPerDay = input.nextInt ( );
//
//					System.out.println ( "Working DaysinMonth " );
//
//					 workingDaysinMonth = input.nextInt ( );
//
//					 empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
//					System.out.println ( "Employee wage per day is $" + empSalaryperDay );
//					 monthlySalary = empSalaryperDay * workingDaysinMonth;  //UC5 AND UC6-CALCULATING WAGES FOR MONTH
//					System.out.println ( "Employee wage per month is $" + monthlySalary );
//					break;
//
//
//				default: //code to be executed if all cases are not matched
//
//					System.out.println ( "Invalid choice  " );
//
//			}
//
//		}
//		else {
//			System.out.println ( "Employee Absent " );
//
//
//		}
//	}
//}

