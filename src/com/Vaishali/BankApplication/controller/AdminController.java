package com.Vaishali.BankApplication.controller;

import java.util.Scanner;

import com.Vaishali.BankApplication.service.ServiceI;
import com.Vaishali.BankApplication.service.ServiceImpl;

public class AdminController {

	public static void main(String[] args) {
		
		ServiceI serviceI=new ServiceImpl();
		
		boolean flag=true;
		while(flag) {
		
		System.out.println("****Welcome to SBI Bank*****");
		System.out.println("Press 1 for create Account");
		System.out.println("Press 2 for view Account");
		System.out.println("Press 3 for Withdraw Money");
		System.out.println("Press 4 for Deposite Money");
		System.out.println("Press 5 for Update Account");
		System.out.println("Exit");
		
		Scanner sc=new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			serviceI.createAccount();
			break;
			
		case 2:
			serviceI.viewAccount();
			break;
			
		case 3: 
			serviceI.withdrawMoney();
			break;
			
		case 4:
			serviceI.depositMoney();
			break;
			
		case 5:
		    serviceI.updateAccount();
		    
		case 6:
			flag=false;
			break;
			
		default:
		    System.out.println("Invalid Choice");
		    break;
		    
		}
		}
		System.out.println("Thanks for using SBI Bank Services");
	}
}
