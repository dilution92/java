package exam;

public class SavingAccountDriver {

	public static void main(String[] args) {

		SavingAccount.setInterestRate(0.01);
		SavingAccount acct1 = new SavingAccount(101);
		acct1.deposit(10000);
		acct1.withdreaw(5000);
		System.out.println(acct1.toString());
		System.out.println();
		
		SavingAccount acct2 = new SavingAccount(102);
		acct2.deposit(80000);
		acct2.withdreaw(150000);
		acct2.withdreaw(70000);
		System.out.println(acct2.toString());
		SavingAccount.showBalance(acct2);
		System.out.println();
		System.out.println("생성된 계좌들의 수: "+ SavingAccount.getNumberOfAccounts());
	}

}
