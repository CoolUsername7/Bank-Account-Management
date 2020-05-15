
import java.util.Scanner;

public class BankDemo{

public static void main (String [] args){

Scanner keyboard = new Scanner(System.in);
BankAccount account = new SavingsAccount(); //Create new instance of SavingsAccount

System.out.print("Enter account Balance: \n$");
account.setBalance(keyboard.nextInt());
userResponse(account);

}//end main

public static void userResponse(BankAccount account)
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Balance: " + account.getBalance() + "\nWithdraw (0)   Deposit (1)   Calculate Interest(2)    Monthly Process(3)    Exit(4)");
	int response = keyboard.nextInt();

	if(response == 0)
	{
		System.out.print("Enter amount to withdraw: \n$");
		int amount = keyboard.nextInt();
		account.withdraw(amount);
		System.out.println("New Balance: $" + account.getBalance());
		userResponse(account);
	}
	else if (response == 1)
	{
		System.out.print("Enter amount to deposit: \n$");
		int amount = keyboard.nextInt();
		account.deposit(amount);
		System.out.println("New Balance: $" + account.getBalance());
		userResponse(account);
	}
	else if (response == 2)
	{
		System.out.print("Enter Annual Interest Rate: \n");
		account.setAnnualInt(keyboard.nextDouble());
		System.out.println("Calculating Monthly Interest..");
		account.calcInterest();
		System.out.println("New Balance: $" + account.getBalance());
		userResponse(account);
	}
	else if (response == 3)
	{
		System.out.print("Enter Monthly Service Charge: \n$");
		account.setServiceCharge(keyboard.nextDouble());
		account.monthlyProcess();
		System.out.println("New Balance: $" + account.getBalance());
		userResponse(account);
	}
	else if (response == 4)
	{
		System.exit(0);
	}
	else
	{
		System.out.println("Invalid Response");
		userResponse(account);
	}

}
}//end BankDemo