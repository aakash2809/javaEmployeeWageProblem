
public class EmpWageBuilderUC4 {

	static int WAGE_PER_HOUR = 20; // wage per hour
	static int FULL_DAY_HOUR = 8; // Number of fixed Hours per day for full day
	static int PART_TIME_HOUR = 4;// Number of fixed Hours per day for part time
	static double calculateDailyWage = 0;

	// function to give result for no.of hours done for work done
	public static int getWorkPerDay(int employeeStatus) {
		int workDone = 0;
		switch (employeeStatus) {
		case 0:
			workDone = FULL_DAY_HOUR;
			break;
		case 1:
			workDone = PART_TIME_HOUR;
			break;

		}
		return workDone;
	}

	// main function
	public static void main(String args[]) {

		System.out.println("Welcome to Employee wage Computation Program");

		int employeeStatus = (int) (Math.floor(Math.random() * 10) % 2); // key genration for half day or full day
		int dayHours = EmpWageBuilderUC4.getWorkPerDay(employeeStatus);

		calculateDailyWage = (dayHours * WAGE_PER_HOUR); // daily full day wage camputation
		System.out.println("Employee daily Full day wage - " + calculateDailyWage);

	}

}

