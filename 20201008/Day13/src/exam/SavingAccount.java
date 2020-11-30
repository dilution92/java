package exam;

public class SavingAccount {

	private int accountNumber;
	private double balance;
	
	public static double interestRate = 0;
	public static int numberOfAccounts = 0;
	
	public SavingAccount(int number) {
		accountNumber = number;
		balance = 0;
		numberOfAccounts++;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public static void showBalance(SavingAccount account) {
		System.out.println(account.getAccountNumber()+ "�� �ܰ� : "+ account.getBalance());
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public String toString() {
		String resultString = "";
		resultString = resultString +"���¹�ȣ : "+getAccountNumber()+"\n";
		resultString = resultString +"�ܰ� : "+getBalance()	;
		return resultString;
	}
	
	public static void setInterestRate(double newRate) {
		interestRate = newRate;
	}
	public void addInterest() {
		balance = balance * (1+getInterestRate());
	}
	public void setAccountNumber(int number) {
		accountNumber = number;
	}
	public void setBalance(int amount) {
		balance = amount;
	}
	public void deposit(int amount) {
		balance = balance + amount;
	}
	public void withdreaw(int amount) {
		if(amount > balance) {
			System.out.println("����: �� �ܰ� ������� �ʴ�.");
		}else {
			balance = balance - amount;
		}
	}
	
	public static void main(String[] args) {

		
	}

}
