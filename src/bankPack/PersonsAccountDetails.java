package bankPack;

public class PersonsAccountDetails {
	private int accountNumber;
	private String nameOfHolder;
	private double totalFund;
	private int password ;
	private String onlinePassword;
	
	public PersonsAccountDetails(int accountNumber, String nameOfHolder, double totalFund, int password,
			String onlinePassword) {
		this.accountNumber = accountNumber;
		this.nameOfHolder = nameOfHolder;
		this.totalFund = totalFund;
		this.password = password;
		this.onlinePassword = onlinePassword;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getOnlinePassword() {
		return onlinePassword;
	}

	public void setTotalFund(double totalFund) {
		this.totalFund = totalFund;
	}

	public void setOnlinePassword(String onlinePassword) {
		this.onlinePassword = onlinePassword;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getNameOfHolder() {
		return nameOfHolder;
	}

	public double getTotalFund() {
		return totalFund;
	}
	
	
	

}
