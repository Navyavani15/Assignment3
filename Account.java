package java_Programs;



	public class Account {
		String account;
		double balance;
		double deposit;
		
		public Account(String account,double balance, double deposit) {
			
			this.account= account;
			this.deposit= deposit;
			this.balance= balance;
		}
		public void depositAmount() {
			
			System.out.println("Deposited amount"+deposit);
			if(account == "Active" || account == "active") {
				System.out.println("Balance "+balance);
				double bal= deposit + balance;
				System.out.println("Deposit successful");
				
				System.out.println("Balance after deposit = "+ bal);
				
			}
			else  {
				System.out.println("Deposit unsuccessful due to inactive account");
			}
			
			
		}

	}

