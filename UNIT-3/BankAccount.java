class InsbalException extends Exception
{
	public InsbalException(String message){
		super(message);
	}
}
public class BankAccount{
	private double balance;
	public BankAccount(double balance){
		this.balance=balance;
	}
	public void withdraw(double amount) throws InsbalException{
		if(amount>balance){
			throw new InsbalException("Insufficient balance in account");
		}
		balance-=amount;
		System.out.println("Withdrawal succesfull.\n remaining balance:"+balance);
	}
	public static void main(String args[]){
		BankAccount account=new BankAccount(1000.0);
		try{
			account.withdraw(600.0);
			account.withdraw(500.0);
		}catch(InsbalException e){
			System.out.println("Error:"+e.getMessage());
		}
	}
}