package BankAccountProject;
import java.util.*;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
		// User Input 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an id: ");
		int id = input.nextInt();
		bankAccount.setId(id);
		System.out.println(); // print new line
		
		displayUserOptions();
		
		
		while(true) {
			int choice = input.nextInt();
			// Set the id in the BankAccount Class 
			bankAccount.setChoice(choice);
			// Using switch statements for different use cases 
			switch (choice) {
				case 1:
					System.out.println("The balance is " + bankAccount.getAccountBalance());
					System.out.println();
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					bankAccount.withdraw(input.nextDouble());
					System.out.println();
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					bankAccount.deposit(input.nextDouble());
					System.out.println();
					break;
				case 4:
					System.out.println(); // print new line break 
					// System.out.print("Enter an id: ");
					// System.exit(1);
			}
			
			if (choice != 4) {
				displayUserOptions();
			} else {
				break;
			}
		}
		
		// Display bank account details after all the transactions 
		System.out.println(bankAccount.toString());
		// Close the scanner class to avoid memory leak 
		input.close();
		
	}
	
	public static void displayUserOptions() {
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.print("Enter a choice: ");
	}

}
