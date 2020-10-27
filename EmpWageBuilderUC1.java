public class EmpWageBuilderUC1{
		public static void main(String args[]){
			int IS_FULL_TIME = 1;                           //constants
			System.out.println("Welcome to EmployeeWage ComputationProgram");
			double empCheck=Math.floor(Math.random() * 10)%2;//computation
			if(empCheck == IS_FULL_TIME )
				System.out.println("Employee is Present");
			else
				 System.out.println("Employee is not Present");

		}
}
