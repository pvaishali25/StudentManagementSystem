package com.Vaishali.BankApplication.service;

import java.util.Scanner;

import com.Vaishali.BankApplication.model.Account;

public class ServiceImpl implements ServiceI{
	
	Scanner sc=new Scanner(System.in);
	Account acc=new Account();

	@Override
	public void createAccount() {
		System.out.println("Enter your Account Number :");
		int accno = sc.nextInt();
		acc.setAccNo(accno);
		
		System.out.println("Enter your Name:");
		String name = sc.next();
		acc.setAccName(name);
		
		System.out.println("Enter your Address:");
		String addr = sc.next();
		acc.setAccAddr(addr);
		
		System.out.println("Enter your PAN No.:");
		String panno = sc.next();
		acc.setAccPan(panno);
		
		System.out.println("Enter Amount You want to Deposite:");
		
		double amt = sc.nextDouble();
		acc.setAccAmt(amt);
		
		System.out.println("Account Created Successfully");
		System.out.println();
		System.out.println();
         	
	}

	@Override
	public void viewAccount() {
		System.out.println("By Using Getter");
		System.out.println("AccNo: "+acc.getAccNo());
		System.out.println("AccName:" +acc.getAccName());
		System.out.println("AccAddress: "+acc.getAccAddr());
		System.out.println("AccPan :"+acc.getAccPan());
		System.out.println("AccBalance:"+acc.getAccAmt());
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter Your Account Number");
		int userAcc = sc.nextInt();
		
		if (userAcc==acc.getAccNo()) {
			System.out.println("Enter Amount you want to withdraw:");
			Double userAmt = sc.nextDouble();
			if(userAmt<acc.getAccAmt()) {
				
				Double remainingAmount=acc.getAccAmt()-userAmt;
				acc.setAccAmt(remainingAmount);
				System.out.println("Withdraw Successfully... Your current Balance is:" +acc.getAccAmt());
				
			}else {
				System.out.println("Insufficient Funds");	
			}
		}else {
			System.out.println("Invalid Account Number");
		}
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter Account Number");
		int userAcc = sc.nextInt();
		
		if(userAcc==acc.getAccNo()) {
			System.out.println("Enter Amount you want to Deposite");
			double userAmt = sc.nextDouble();
			
			double creditAmount=userAmt+acc.getAccAmt();
			
			acc.setAccAmt(creditAmount);
			System.out.println("Withdraw Successfully."+acc.getAccAmt());
			
		}else {
			System.out.println("Invalid Account Number");
		}
		
	}

	@Override
	public void updateAccount() {
		System.out.println("Enter Account Number");
		int userAcc = sc.nextInt();
		
		if(userAcc==acc.getAccNo()) {
			boolean flag=true;
			while (flag) {
				System.out.println("Press 1 for Update Name");
				System.out.println("Press 2 for Update Address");
				System.out.println("Press 3 for Uodate Pan No.");
				System.out.println("Press 4 for Exit");
				
				int ch=sc.nextInt();
				
				switch (ch) {
				
				case 1: 
					System.out.println("Enter Name you want to update");
					String name = sc.next();
					acc.setAccName(name);
					System.out.println("Your updated name is: "+acc.getAccName());
					break;
					
				case 2:
					System.out.println("Enter Addrss you want to update");
					String addr = sc.next();
					acc.setAccAddr(addr);
					System.out.println("Your Updated Address is:"+acc.getAccAddr());
					break;
					
				case 3:
					System.out.println("Enter PAN Card No. you want to update");
					String pan = sc.next();
					acc.setAccPan(pan);
					System.out.println("Your updated PAN No. is:" +acc.getAccPan());
					break;
					
				case 4:
					flag=false;
					break;
					
				default:
					System.out.println("Invalid Choice");
					break;
				}
			}
		}
		
	}

}
