import java.util.*;
class bank{
	Scanner scan = new Scanner(System.in);
	String name;
	long acc_no;
	String type;
	double balance = 0.00;
	void assign(){
		System.out.println("Enter name of account holder: ");
		name = scan.nextLine();
		System.out.println("Enter Account no.: ");
		acc_no = scan.nextLong();
		System.out.println("Enter type of account: ");
		type = scan.nextLine();
		}
	void deposit(){
		System.out.println("Enter amount to deposit: ");
		balance += scan.nextDouble();
		System.out.println("New balance is " + balance);
		}
	void withdraw(){
		System.out.println("Enter amount to be withdrawn: ");
		balance -= scan.nextDouble();
		System.out.println("New balance is " + balance);
		}
	void display(){
		System.out.println("Name of the account holder is " + name);
		System.out.println("Current balance is " + balance);
		}
	public static void main(String args[]){
		bank acc = new bank();
		acc.assign();
		acc.deposit();
		acc.withdraw();
		acc.display();	
		}	
	}
