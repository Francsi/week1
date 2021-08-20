package Interface;

public class Atm {
	public static void main(String args[]) {
		BankDepositWithdraw BankDepositWithdraw = new BankDepositWithdraw();
		System.out.println("Bank balance of the account number "+BankDepositWithdraw.ACCOUNTNUMBER+" is "+ BankDepositWithdraw.bankBalance);
		BankDepositWithdraw.depositAmount(4000);
		BankDepositWithdraw.withdrawAmount(4000);
	}
}
