package day2;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int numberofday=4;
		
		switch (numberofday) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Mondayy");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
			
			default:
				System.out.println("Invalid day");
				break;
		}
		
	}

}
