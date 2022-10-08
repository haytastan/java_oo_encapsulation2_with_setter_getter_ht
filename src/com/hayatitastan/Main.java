import java.awt.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Create an account with number: ");
		int no = input.nextInt();
		
		System.out.println("Your first deposit: ");
		int money = input.nextInt();
		
		BankAccount myBankAccount = new BankAccount (no,money);
		// System.out.println(myBankAccount.bank_account);
		
		boolean status = true;
		while(status) {
			System.out.println("deposit [d], withdraw [w], quit[q]: ");
			char option = input.next().charAt(0);
			option = Character.toLowerCase(option);
			switch(option) {
				
				case 'd':
					// code block
					System.out.println("Amount to deposit : ");
					int deposit_amount = input.nextInt();
					myBankAccount.deposit( deposit_amount);
					break;
					
				case 'w':
					System.out.println("Amount to withdraw : ");
					int withdraw_amount= input.nextInt();
					myBankAccount.withdraw(withdraw_amount);
					break;
					
				case 'q':
					status = false;
					break;
				default:
				
			}
			
		}
		//myBankAccount.deposit( -60);
		//myBankAccount.withdraw( 150);
		
		//myBankAccount.deposit( 100);
		//myBankAccount.withdraw( 200);
	}
}