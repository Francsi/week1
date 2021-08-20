package Interface;

public class BankDepositWithdraw implements Withdraw,Deposit{
	int bankBalance = 30000;
	int ACCOUNTNUMBER = 123456;
	public void depositAmount(int amt) {
		bankBalance+=amt;
		System.out.println("Balance Amount after deposited is "+bankBalance);
	}
	public void withdrawAmount(int amt) {
		if(bankBalance>MIN_BALANCE) {
			bankBalance-=amt;
			System.out.println("Balance Amount afer withdraw is "+bankBalance);
		}
		else {
			System.out.println("Balance is insufficient");
		}
	}
}
