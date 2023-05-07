package bankPack;

import java.util.Scanner;

public abstract class BankOperationClass {

	private double withdrawn;

	private double balanceAmt;
	private double deposit;

	Scanner sc = new Scanner(System.in);

	public void displayOperation() {
		System.out.println("Bank Transaction");
		System.out.println("1 Withdraw");
		System.out.println("2 Deposit");
		System.out.println("3 View Balance");
		System.out.println("4 Password Change");
		System.out.println("Enter the option 1/2/3/4");
	}

//withdraw money
	public void withdraw(PersonsAccountDetails person) {

		System.out.println("Enter the withdrawn amount");
		withdrawn = sc.nextInt();
		balanceAmt = person.getTotalFund();
		if (withdrawn <= balanceAmt) {
			System.out.println("Cash withdrawn amount=" + withdrawn);
			balanceAmt -= withdrawn;
			person.setTotalFund(balanceAmt);
			System.out.println("New balance " + balanceAmt);
		} else {
			System.out.println("Insufficient Balance ");
		}
	}

	// deposit money
	public void depositMoney(PersonsAccountDetails person) {
		System.out.println("Enter the deposit amount");
		deposit = sc.nextDouble();
		balanceAmt = person.getTotalFund();
		balanceAmt += deposit;
		person.setTotalFund(balanceAmt);
		System.out.println("cash deposited" + balanceAmt);

	}

	// view the current balance
	public void viewBalance(PersonsAccountDetails person) {
		System.out.println("current balance of your account is" + person.getTotalFund());

	}
	
	public abstract void changePin(PersonsAccountDetails person);

}
