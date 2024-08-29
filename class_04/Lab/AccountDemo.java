class AccountDemo
{
	public static void main(String[] args)
	{
		Account account = new Account();
		account.accountName = "Pravakar Rijal";
		//account.accountNumber = 23422; doesnot compile due to encapsulation/ data hiding since private members can't be accessed.
		account.setaccountNumber(23434);
		System.out.println("Acccout No: " + account.getaccountNumber() + "\n" + "Account Name: " + account.accountName);
	}
}