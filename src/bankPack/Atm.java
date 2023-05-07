package bankPack;

import java.util.Scanner;

public class Atm extends BankOperationClass {
	public boolean isNeeded = true;	
	private int EnteredCode;
	private int option;
	private int newPin;
	Scanner sc = new Scanner(System.in);

	public void pinCheck(PersonsAccountDetails person[], int accountNumber) {
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAccountNumber() == accountNumber) {

				for (int counter = 1; counter <= 3; counter++) {
					while (isNeeded == true) {
						System.out.println("Enter the pin number");
						EnteredCode = sc.nextInt();
						if (person[i].getPassword() == EnteredCode) {
							System.out.println(person[i].getNameOfHolder());
							System.out.println("Entered password is correct");

							displayOperation();
							option = sc.nextInt();
							switch (option) {
							case 1:
								withdraw(person[i]);
								break;

							case 2:
								depositMoney(person[i]);
								break;
							case 3:
								viewBalance(person[i]);
								break;
							case 4:
								changePin(person[i]);
								break;

							default:
								System.out.println("invalid option");
								break;
							}
							System.out.println("would you like to do another transaction ");
							isNeeded = sc.nextBoolean();

						} else if (counter == 3) {
							System.out.println("card blocked ");
						} else {
							System.out.println("entered pin incorrect");
						}
					}

				}

			}

		}

	}

	@Override
	public void changePin(PersonsAccountDetails person) {
	System.out.println("Enter the new pin");
	newPin = sc.nextInt();
	if(String.valueOf(newPin).length()>=4&& newPin!= person.getPassword()) {
		person.setPassword(newPin);
		System.out.println("Pin changed sucessfully");
	}
	else {
		System.out.println("Pin is not acceptable");
	}
		
	}
	
	

}
