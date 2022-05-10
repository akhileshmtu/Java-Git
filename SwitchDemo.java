import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*Switch Case
		 * 1. Deposit
		 * 2. Withdrawal
		 * 3. Balance check
		 * apart from these option, if user is pressing anything, we will display 
		 * message to the user that "Please Provide Correct Option"
		 */
		
		System.out.println("Press 1 for Deposit");
		System.out.println("Press 2 for Withdrawal");
		System.out.println("Press 3 for Balance check");
		
		System.out.println("Please Provide Your Input");
		Scanner object = new Scanner(System.in);
		
		int input = object.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Deposit");
			break;
			
		case 2:
			System.out.println("Withdrawal");
			break;
			
		case 3:
			System.out.println("Balance Check");
			break;
				
			
		default:
			
			System.out.println("Please Provide Correct Option");	
		}
		
		
	}

}
