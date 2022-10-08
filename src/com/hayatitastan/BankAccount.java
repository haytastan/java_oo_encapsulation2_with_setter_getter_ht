/*
WHAT IS ENCAPSULATION?
•	Encapsulation is the process of wrapping data and methods into a single unit (class)
• 	Way to make programs more secure
•	Prevents unauthorized members from accessing certain variables and methods
•	Encapsulation in Java can be known as data hiding
•	You cannot directly access the private properties of a class unless you are writing code inside the class itself
•	It helps developers better group and organize data
•	Developers can easily change code without affecting other parts of the program
 */
/*
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
To achieve this, you must:
-declare class variables/attributes as private
- provide public get and set methods to access and update the value of a private variable
  Source:https://www.w3schools.com/java/java_encapsulation.asp
Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

*/

public class BankAccount {
	private int account_number;
	private int account_balance;

	//setter
	public BankAccount(int account_number, int account_balance) {
		this.account_number = account_number;
		this.account_balance = account_balance;
		System.out.println("You created account " + this.account_number + ".");
	}
	public void deposit(int addMoney) {
		if (addMoney < 0) {
			System.out.println("You cannot deposit a " + "negative amount.");
		} else {
			this.account_balance = this.account_balance + addMoney;
			System.out.println("$" + addMoney + " " + "deposited into account " + this.account_number + ".");
		}
	}

	public void withdraw(int removeMoney) {
		if (removeMoney < 0) {
			System.out.println("You cannot withdraw a " + "negative amount.");

		} else if (removeMoney > this.account_balance) {
			System.out.println("You cannot withdraw more " + "than what is in your account");

		} else {
			this.account_balance = this.account_balance - removeMoney;
			System.out.println("$" + removeMoney + " " + "has been withdrawn from account " + this.account_number + ".");
		}
	}
}
