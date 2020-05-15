abstract class BankAccount{
public double balance = 0.0;
public int numDeposits = 0;
public int numWithdrawals = 0;
public double service = 0.0;
public double monthlyInt = 0;
public double annualInt = 0;
public double monthlyRate = 0;

public void BankAccount(double b,double a)
{
	this.balance = b;
	this.annualInt = a;
}

public void deposit(double amount)
{
	balance+= amount;
	numDeposits++;
}

public void withdraw(double amount)
{
	balance-= amount;
	numWithdrawals++;
}

public void calcInterest()
{
	monthlyRate = annualInt/12;
	monthlyInt = balance * monthlyRate;
	balance+= monthlyInt;
}

public void monthlyProcess()
{
	balance-= service;
	numWithdrawals = 0;
	numDeposits = 0;
	service = 0;
}

public void setBalance(double b)
{
	balance = b;
}

public double getBalance()
{
	return balance;
}

public void setAnnualInt(double i)
{
	annualInt = i;
}

public void setServiceCharge(double s)
{
	service = s;
}

}//end BankAccount