package com.pak1;

import java.util.Scanner;

public class AtmMachine 
{
	class ATM
	{
		float Balance;
		int PIN=1010;
		
		public void checkpin()
		{
			System.out.println("Please enter Your PIN");
			Scanner sc=new Scanner(System.in);
			int enteredpin=sc.nextInt();
			
			if(enteredpin==PIN)
			{
				menu();
			}
			else
			{
				System.out.println("PIN is Invalid");
			}
			
		}
		public void menu()
		{
			System.out.println("************************ Welcome to the ATM *******************************");
			System.out.println("Please Enter Your ");
			System.out.println("1. Check Account Balance");
			System.out.println("2.Withdraw Amount");
			System.out.println("3.Deposit Amount");
			System.out.println("4.Exit");
			
			Scanner sc=new Scanner(System.in);
			int opt=sc.nextInt();
			
			if(opt==1)
			{
				checkBalance();
			}
			else if (opt==2) 
			{
				withdrawAmount();
			}
			else if (opt==3) 
			{
				DepositAmount();
			}
			else if (opt==4) 
			{
			  return;	
			}
			else
			{
				System.out.println("Please Enter a valid choice");
			}
					 
		}
		public void checkBalance()
		{
			System.out.println("Balance : " + Balance);
			menu();
		}
		public void withdrawAmount()
		{
			System.out.println("Enter Withdraw Amount");
		    Scanner sc=new Scanner(System.in);
		    
			float amount=sc.nextFloat();
			if(amount>Balance)
			{
				System.out.println("Insufficient Funds");
			}
			else
			{
				Balance=Balance-amount;
				System.out.println("Money Withdraw Successfully");
			}
			menu();
			
		}
		public void DepositAmount()
		{
			 System.out.println("Enter the Amount");
			 Scanner sc=new Scanner(System.in);
			 float amount=sc.nextFloat();
			 
			 Balance=Balance+amount;
			 System.out.println("Deposit Succefully");
			 menu();
			 
		}
		
		
	}
	
		
 public static void main(String[] args) 
 {
	
   	AtmMachine machine = new AtmMachine();   // create an instance of the outer class
   	ATM aobj = machine.new ATM();           //  create an instance of the inner class
   	aobj.checkpin();
   	System.out.println("**********************************Thank you !**********************************************");
 }
}
