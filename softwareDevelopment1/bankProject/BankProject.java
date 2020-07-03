import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
class Insert{
	public static void main(String[]args){
		//create and call the AccountLog object
		AccountLog object =new AccountLog("Alonso","A001");
		object.menu();
	}
}
//a class for our accounts that involves all the methods in our system
class AccountLog {
	String TransactionText;
	//String newTransactionText;
	double balance;
	String clientName;
	double RecentTransaction;
	double transfer;
	String name;
	String id;
	Double RecipientAmount;
	Date trasactiondate = new Date();
	ArrayList <String> TransactionHistory = new ArrayList<String>();
		

	AccountLog(String CustomerName, String customerid){
		name = CustomerName;
		id = customerid;
	}

	void menu(){
		Scanner bank = new Scanner(System.in);
		System.out.println("Enter your Bank Account Name.");
		String AccountName = bank.nextLine();
		System.out.println("Bank Account Number.");
		Long AccountNumber = bank.nextLong();
		

		System.out.println("========================================================================");
		System.out.println("Hello "+AccountName+", your account number: "+AccountNumber);
		System.out.println("========================================================================");
		System.out.println("\n");
		
		System.out.println("    What would you like?");
		System.out.println(" ============================");
		System.out.println("| A: Balance                 |");
		System.out.println("| B: Deposit                 |");
		System.out.println("| C: Withdraw                |");
		System.out.println("| D: Recent Transaction      |");
		System.out.println("| G: Transaction List        |");
		System.out.println("| F: Transfer                |");
		System.out.println("| E: Exit                    |");
		System.out.println(" =============================");


		char selection;
		do {
			System.out.println("Make a selection");
			selection = bank.next().toUpperCase().charAt(0);

			if (selection == 'A'){
				System.out.println("---------------------------------------");
				System.out.println("Your current balance is "+ balance);
				System.out.println("---------------------------------------");

				if (balance < 50.0){
					System.out.println("Low balance, please deposit on account");
				
				}
			
			}
			else if (selection == 'B'){
				System.out.println("Enter the amount you want to deposit");
				System.out.println("---------------------------------------");
				Double amount = bank.nextDouble();
				//bank.next();
				System.out.println("---------------------------------------");
				deposit(amount);
				System.out.println(amount+" has been succefully deposited on your account.");
				
			}
			else if (selection == 'C'){
				System.out.println("Enter the amount you want to withdraw");
				System.out.println("---------------------------------------");
				Double amountwd = bank.nextDouble();
				withdraw(amountwd);
				System.out.println("---------------------------------------");
				System.out.println("You have withdrawn "+amountwd+" from your account");
				System.out.println("---------------------------------------");
				
				

			}
			else if (selection == 'D'){
				System.out.println("---------------------------------------");

				//if (RecentTransaction==RecipientAmount){
				//System.out.println("Amount Transfered = "+RecipientAmount);
				//}
				//else{
				getRecentTransaction();//}
				System.out.println("---------------------------------------");
			}
			else if (selection == 'E'){
				System.out.println("Thanks for using our online services....");
				break;
			}
			else if (selection == 'F'){
				System.out.println("---------------------------------------");
				getTransfer();

			}
			else if (selection == 'G'){
				System.out.println("---------------------------------------");
				getAllTransactions();


			}
			else if(selection != ('A')||selection != ('B')||selection !=('C')||selection !=('D')||selection !=('F')||selection !=('E')){
				System.out.println("Wrong selection, please try again.....");
			}
			else {
				System.out.println();
			}
			
		}while (selection != 'E');
	}

	void deposit(Double amount){

		if (amount !=0){
			balance +=amount;
			RecentTransaction=amount;
			TransactionText=trasactiondate+" Amount Deposited = "+RecentTransaction;
			TransactionHistory.add(TransactionText+"\n");
			
		}
	}
	void withdraw(Double amount){

		if (amount !=0){
			balance -=amount;
			RecentTransaction = -amount;
			TransactionText = trasactiondate+" Amount Withdrawn = "+Math.abs(RecentTransaction);
			TransactionHistory.add(TransactionText+"\n");
			
		}
	}
	void getRecentTransaction(){
			
			System.out.println(TransactionText);
		}
	void getTransfer(){
			Scanner BankTransfer = new Scanner(System.in);

			System.out.println("Please enter the account name of the recipient");
			System.out.println("---------------------------------------------------------------");
				String RecipientName = BankTransfer.nextLine();
				System.out.println("---------------------------------------------------------------");
				System.out.println("Please enter the account number of the recipient");
				System.out.println("---------------------------------------------------------------");
				Long RecipientNumber = BankTransfer.nextLong();
				System.out.println("---------------------------------------------------------------");
				System.out.println("Enter the amount to be transfered");
				System.out.println("---------------------------------------------------------------");
				RecipientAmount = BankTransfer.nextDouble();
				System.out.println("---------------------------------------------------------------");
				
				System.out.println(RecipientName+" with account number "+RecipientNumber+" will receive "+ RecipientAmount);
				
				System.out.println("Please confirm...\nY: Yes\nN: No");

				char confirm = BankTransfer.next().toUpperCase().charAt(0);
				if (confirm=='Y'){
								withdraw(RecipientAmount);
								System.out.println("Your Transfer of "+RecipientAmount+" has been made succefully.....");
								RecentTransaction=RecipientAmount;
								TransactionText=trasactiondate+" Amount Transfered = "+RecipientAmount;
								TransactionHistory.add(TransactionText+"\n");

						}
				else if (confirm=='N'){
					System.out.println("Please try again....");
					System.out.println("==================================");
				}
				else {
					System.out.println("Wrong selection, please insert Y or N...");
				}

		}	
	void getAllTransactions(){
		
			System.out.println (TransactionHistory);
			System.out.println("---------------------------------------------------------------");
			System.out.println ("The current balance is: "+balance);
			System.out.println("---------------------------------------------------------------");

		}	
}	