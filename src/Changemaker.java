import java.util.Scanner;

public class Changemaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the vending machine change maker!");
		//Prompt for item price
		System.out.println("What is the item price in cents?");
		int price = input.nextInt();
		
		//Prompt for money inserted
		System.out.println("How many (individual) coins and bills were paid?");
		int n = input.nextInt();
		int paymentarray[];
		paymentarray = new int[n];
		for(int i=0; i < n; i++) {
			int k = 1+ i;
			System.out.println("What is the value of Bill or Coin Number " + k + " inserted in cents?");
			paymentarray[i] = input.nextInt();					
		}
		
		//Calculate total payment received (Sum array elements)
		int payment;
		payment = 0;
		for(int j=0; j < n; j++) {
			payment = payment + paymentarray[j];			
		}
		System.out.println("Total payment received is " + payment + " cents.");
		
		//Calculate change to be returned
			int changedue;
				if(payment >= price){		
				changedue = payment - price;
				System.out.println("Item vended.");
				System.out.println("Total change due is " + changedue + " cents.");
				}else {
					System.out.println("Item NOT vended.");
					System.out.println("Insufficient funds inserted. Returning funds now.");
					changedue = payment;
				}

		
		//Make change array
		int changearray[];
		changearray = new int[4];
		while(changedue > 0) {
			if(changedue >= 25){				
				changedue = changedue - 25;	
				changearray[3]++;
			} else if(changedue >= 10) {
				changedue = changedue - 10;
				changearray[2]++;
			} else if(changedue >= 5) {
				changedue = changedue - 5;
				changearray[1]++;
			} else if(changedue >= 1) {
				changedue = changedue - 1;
				changearray[0]++;
			} else {
				System.out.println("Something is wrong.");
				changedue = 0;
			}
		}
		
		System.out.println("Pennies returned: " + changearray[0]);
		System.out.println("Nickles returned: " + changearray[1]);
		System.out.println("Dimes returned: " + changearray[2]);
		System.out.println("Quarters returned: " +changearray[3]);
		
		
input.close();
	}

}
