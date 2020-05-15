/** Class SavingsAccount
 * Determines whether an account is inactive before performing a desired action on the bank account (ie: withdraw, deposit, monthly process)
 * @author Justin Delgado
 */

public class SavingsAccount extends BankAccount{

    private boolean status;


/** A method that determines whether the account is inactive before a withdrawal is made */
    public void withdraw(SavingsAccount account,double amount)
    {

		if(account.isActive() == true)
		{
		super.withdraw(amount);
		}

		else
		System.out.println("Account is not active, account balance must be greater than $25");

    }

/** A method that determines whether the account is inactive before a deposit is made */
    public void deposit(SavingsAccount account,double amount)
    {
		if(account.isActive() == true)
		{
		super.deposit(amount);
		}

		else if(account.isActive() == false && (balance + amount) > 25)
		{
		status = true;
		super.deposit(amount);
		}
		else
		System.out.println("Account is not active, account balance must be greater than $25");
    }

/** A method that checks the number of withdrawals and adds the service charge accordingly */
    public void monthlyProcess()
    {
	if(numWithdrawals > 4)
	{
		service = 1 * (numWithdrawals-4);
		super.monthlyProcess();
	}
	else if(numWithdrawals < 4){
	super.monthlyProcess();
	}

	if(balance < 25)
	status = false;

   }

    public boolean isActive(){
        if(balance < 25){
			status = false;
            return status;
        }
        else{
        status = true;
        return status;
		}

	}//end isActive



}//end Savings Account