package bankPack;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		int accountNumber;
		int pinNumber;
		PersonsAccountDetails person1 = new PersonsAccountDetails(45678, "clemin", 2500, 1234, "cle@123");
		PersonsAccountDetails person2 = new PersonsAccountDetails(98765, "ashik", 3500, 3547, "ash@456");
		PersonsAccountDetails person []= {person1,person2}; 
		Atm atm = new Atm();
		OnlineBanking online= new OnlineBanking();
		System.out.println("Banking Operations");
		System.out.println("1.ATM");
		System.out.println("2.ONLINE");
		System.out.println("Enter the option(1/2): ");
		option = sc.nextInt();
		System.out.println("Enter your account number");
		accountNumber=sc.nextInt();

		
		switch (option) {
		case 1:
			atm.pinCheck(person,accountNumber);
			break;
		case 2:
			online.pinCheck(person, accountNumber);

			break;

		default:
			break;
		}

	}

}
