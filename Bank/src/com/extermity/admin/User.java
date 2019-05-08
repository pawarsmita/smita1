package com.extermity.admin;

import java.util.Scanner;

import servicesIMP.Bank_opretaion;

public class User
{
	
	public static void main(String[] args) 
     {
		 Bank_opretaion bo =new Bank_opretaion();
	
    	Scanner sc=new Scanner(System.in);
    	
    	while (true)
    	{
    		System.out.println("1.Creat Account");	
    		System.out.println("2.Deposite");
    		System.out.println("3.Withdrow");
    		System.out.println("4.Blance Enquiry");
    		System.out.println("5.Account detalis");
    		System.out.println("6.not choice");
    		System.out.println("Enter you choice");
    		
    	    int choice=sc.nextInt();
    	    System.out.println(choice);
    	
    	switch(choice)
    	{
    	case 1:
    		System.out.println("Creat Account");
    		bo.creatAccount();
    		break;
    	case 2:
    		System.out.println("Deposite");
    		bo.deposite();
    		break;
    	case 3:
    		System.out.println("Withdrow");
    		bo.Withdrow();
    		break;
    	
    	case 4:
    		System.out.println("Blance Enquiry");
    		bo.Blance_Enquiry();
    		break;
    		
    	case 5:
    		System.out.println("Account detalis");
    		bo.Account_detalis();
    		break;
    	default:
    		System.out.println("not choice");
    		break;
    	}
    	
      }
     }

}
