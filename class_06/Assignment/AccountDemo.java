class AccountDemo
{
	public static void main(String[] args)
	{
		Account account = new Account();
		account.setaccountNumber(34234);
		account.setaccountName("Pravakar Rijal");
		System.out.println("Account Number: " + account.getaccountNumber());
		System.out.println("Account Name: " + account.getaccountName());
	}
}