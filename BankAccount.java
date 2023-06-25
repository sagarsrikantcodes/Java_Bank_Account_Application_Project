package BankAccountProject;

public class BankAccount {
	// private data fields 
	private int id = 1;
	private double accountBalance = 100;
	private double amountWithdrawn = 0;
	private double amountDeposited = 0;
	private java.util.Date dateCreated;
	private int choice = 1;
	private String name = "Sameer";
	private String emailAddress = "Sam@hotmail.com";
	private int phoneNumber = 26593028;
	
	// No-arg or Default Constructor for creating the BankAccount object. 
	public BankAccount() {
		dateCreated = new java.util.Date();
	}
	
	// COnstructor with specified data fields for creating a bank account 
	public BankAccount(int id, double accountBalance, double amountWithdrawn, double amountDeposited) {
		this.id = id;
		this.accountBalance = accountBalance;
		this.amountWithdrawn = amountWithdrawn;
		this.amountDeposited = amountDeposited;
		dateCreated = new java.util.Date();
	}
	
	public BankAccount(int choice, String name, String emailAddress, int phoneNumber, int id, double accountBalance, double amountWithdrawn, double amountDeposited) {
		this.id = id;
		this.accountBalance = accountBalance;
		this.amountWithdrawn = amountWithdrawn;
		this.amountDeposited = amountDeposited;
		this.choice = choice;
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		dateCreated = new java.util.Date();
	}
	
	
	
	// Getter Methods 
	public int getId() {
		return id;
	}
	
	public int getChoice() {
		return choice;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public double getAmountWithdrawn() {
		return amountWithdrawn;
	}
	
	public double getAmountDeposited() {
		return amountDeposited;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(double amountWithdrawn) {
		if (accountBalance <= 0) {
			System.out.println("Sorry you don't have even balance in your account. Please deposit $100 immediately");
			return;
		}
		
		this.amountWithdrawn = amountWithdrawn;
		accountBalance -= this.amountWithdrawn;
	}
	
	public void deposit(double amountDeposited) {
		this.amountDeposited = amountDeposited;
		accountBalance += this.amountDeposited;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return  "Account Holder Name: " + getName() + "\nContact Number: " + getPhoneNumber() + "\nEmail Id: " + getEmailAddress() + "\nBank Account Id: " + getId() + ", created on " + getDateCreated() + ", Account Balance: $" + getAccountBalance(); 
	}
}
