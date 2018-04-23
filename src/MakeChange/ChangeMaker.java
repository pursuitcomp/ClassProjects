package MakeChange;

import java.util.Scanner;
/*User input the amount of change needed between 0 to 99,
 * Program determines how much of each change is to be given to user.
 * 
 * */
public class ChangeMaker {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter an amount between 1-99");
			int payAmount=input.nextInt();
			
			returnChange(payAmount);

		}
	// method to calculate tip amount
		public static void returnChange(int change) {
			
			if(change>=0 && change<=99) {
			int quaters=0;
			int dimes=0;
			int nickles=0;
			int pennies=0;
			
				//calc quaters
				quaters=(int)change/25;
				change=change%25;
				//calc dimes
				dimes=(int)change/10;
				change=change%10;
				//calc nickles
				nickles=(int)change/5;
				change=change%5;
				
				//calc pennies
				pennies=(int)change/1;

				
			//print results
			System.out.println("Quaters: "+quaters);
			System.out.println("Dimes: "+dimes);
			System.out.println("Nickles: "+nickles);
			System.out.println("Pennies: "+pennies);
			}else {
				
				System.out.println("Sorry amount must be between 0 to 99 cents");
			}
		}//end main method
		
	}//end class
	

