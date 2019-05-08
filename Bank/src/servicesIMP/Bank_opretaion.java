package servicesIMP;

import java.util.Scanner;

import com.extermity.customException.InvalidAcc;
import com.extermity.customException.InvalidFname;
import com.extermity.customException.InvalidLname;
import com.extermity.customException.InvalidMobnumber;
import com.extermity.customException.Invaliddob;
import com.extermity.model.Account;
import com.extermity.service.Bank;

public class Bank_opretaion implements Bank

{
	
	
	String Blance= null;
	Account ac=new Account();
	Scanner sc =new Scanner(System.in);
	long Withdrow=0;
	int ct=0;
	
	private Object Blc;
	Account[] a1=new Account[10];
	int count=0;
	private Object Username;
	private int i;
	
	
	
	public void creatAccount()
	
	{ 
		try
		{
		Account ac=new Account();
		
			 System.out.println("Enter your user USERNAME");
		       ac.setUSERNAME(sc.next());
		 
		        System.out.println("Enter your password");
		        ac.setPASSWORD(sc.next());
		         
		        System.out.println("Enter your Pan_no");
			      ac.setPAN_NO(sc.nextLong());
		    	  
			      while(true)
		            {
		               System.out.println("Enter your  FName");
		                ac.setFNAME(sc.next());
		   
   	                   try
   	                {
   	         		      System.out.println("Enter the Fname");
   	         		      String Fname=sc.next();
   	         		      String regaxFname="[A-Z a-z]{3,}";
   	         		  if(Fname.matches(regaxFname))
   	   		           {
   	   			       ac.setFNAME(Fname);
   	   			       break;
   	   		           }
   		    
   		              else
   		               {
   			                  InvalidFname e=new InvalidFname("Enter the Fname"); 
   			                   throw e;
   		               }
   	                }
       
   	                catch (InvalidLname e)
   	               {
					System.out.println(e.getMessage());
				   }
		    }

		    while(true)
		    {
		    	try
		    	{
		            System.out.println("Enter your  LName");
		             ac.setLNAME(sc.next());
		             System.out.println("Enter the Lname");
	         		  String Lname=sc.next();
	         		  String regaxLname="[A-Z a-z]{3,}";
	         		  if(Lname.matches(regaxLname))
	   		           {
	   			       ac.setLNAME(Lname);
	   			       break;
	   		           }
		    
		              else
		               {
			                  InvalidLname e=new InvalidLname("Enter the Lname"); 
			                   throw e;
		               }
	         	}
		             
		             catch (InvalidLname e) 
		             {
		            	 System.out.println(e.getMessage());
					}
		    	}
		    while(true)
		    {
		    	
		    	try
		    	{
		    	         System.out.println("Enter the Mob_no");
		    	         String s=Long.toString(sc.nextLong());
 	         		    
 	         		      String regaxMob_no="[0-9]{10}";
 	         		       if(s.matches(regaxMob_no))
 	   		               {
 	         		    	   Long mob=Long.parseLong(s);
 	   			              ac.getMOB_NO();
 	   			              break;
 	   		               }
 		    
 		                  else
 		                   {
 		                	 InvalidMobnumber e=new InvalidMobnumber("Enter the Mob_no"); 
 			                   throw e;
 		                    }
 	              }
		    		
		    	
		    	catch (InvalidMobnumber e)
		    	{
		    		 System.out.println(e.getMessage());
				}
		    
		    }
		    System.out.println("Enter your  dob");
		    ac.setDOB(sc.nextInt());
		    
		    while(true)
		    {
		    	try
		    	{
		           System.out.println("Enter your  Acc_no");
		           String s=sc.next();

	    	        
        		    
        		      String regaxAcc_no="[0-9]{11}";
        		       if(s.matches(regaxAcc_no))
  		               {
        		    	   Long Acc_no=Long.parseLong(s);
  			              ac.setACC_NO(Acc_no);
  			              break;
  		               }
	    
	                  else
	                   {
	                	  InvalidAcc e=new InvalidAcc("Enter the Account_no"); 
		                   throw e;
	                    }
		    	}
		    	catch (InvalidAcc e) 
		    	{
		    		System.out.println(e.getMessage());
				}
		   
		    
		    System.out.println("Enter your  Blc");
		    long rs=sc.nextLong();
		    
		    
		    a1[count]=ac;
		    count++;
		    
		   	    
		    boolean bo=true;
		    while(bo)
		    	{
		           if(rs>=500)
		            {
			          ac.setBLC(rs);
			          System.out.println("Account created succufully");
			          bo=false;
		             }
		           else
		     
		              {
		    	 
		        	   System.out.println("Account not crated bcz blc is less 500");
		    	       bo=true;
		              }
		          
				  }

             System.out.println("-----------------------");
		}
		}
	
		catch (NumberFormatException e)
		{
		    	System.out.println("Enter the number");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Enter the Arrya Index");
		}
		
			
}

	
	public void deposite()
	
	{
		ct=0;

		
		System.out.println("Enter your usrename" );
		String username=sc.next();
		
		System.out.println("Enter the Password");
	     String pass=sc.next();
		
	    try
	    {
	    	for(int i=0;i<a1.length;i++)
	    		
	       
	    	if(a1[i].getUSERNAME().equals(username)&& a1[i].getPASSWORD().equals(pass))
	         {
	    	    System.out.println("Enter Blance");
	    	    long blc=sc.nextLong();
	    	     long TotalBlc=blc+ac.getBLC();
	    	     System.out.println(TotalBlc);
	    	     a1[i].setBLC(TotalBlc);
	    	     ct++;
	    	     break;
	         }
	  
	     
	    if(ct<=0)
	    {
	    	System.out.println("Password & Username is incorrect");
	    }
	    
	    }
	    catch (ArithmeticException e) 
	    {
			System.out.println("Enter the non zero value");
		}
	}
		
		
	
	public void Withdrow()
	
	{
		
		//Account ac=new Account();
		ct=0;

		System.out.println("Enter the Usernsme");
		String Usrename=sc.next();
		
		System.out.println("Enter the Password");
		String Password=sc.next();
		
		String PASSWORD=sc.next();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==null)
		    {
				break;
		     }
      		
		    
			{	
				if(a1[i].getUSERNAME().equals(Usrename)&& a1[i].getPASSWORD().equals(Password))
		      {
	    	     System.out.println("Enter Blance");
	    	     long blc=sc.nextLong();
	    	     long Withdrowblc=a1[i].getBLC()-blc;
	   
	    	      if(Withdrowblc>=500)
	    	       {
	    		     System.out.println("Blance Withdrow successfully");
		    	      a1[i].setBLC(Withdrowblc);
	    	   }
	    	  
	    	 else
	    	     {
	    		     System.out.println("Blance can not decucated less than 500");
	    	     }  
	    	      ct++;
	    	      break;
	    }
	     if(ct<=0)
	     {
	    	  System.out.println("Invalid username");
	     }
	   }
	 }
		
		
		
	}
	
	public void Blance_Enquiry()
	
	{   
		ct=0;
		//Account ac=new Account();
	    //int count=0;
		System.out.println("Enter the Usernsme");
		String Usrename=sc.next();
		
		System.out.println("Enter the Password");
		String Password=sc.next();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==null)
			{
				break;
			}
      		{
		      if(a1[i].getUSERNAME().equals(Usrename)&& a1[i].getPASSWORD().equals(Password))
		       {
	    	    System.out.println(Blance +"a1[i].getBLC()");
	    	     count++;
	    	     break;
	           }
		    
		      if(count<=0)
		      { 
		    	  System.out.println("Password & Username is incorrect");
		      }
		     
      		}
		}	
	}
	
	public void Account_detalis()
	
	{	
		int ct=0;
	     
      	System.out.println("Enter the Username");
		String Usrename=sc.next();
		
		System.out.println("Enter the Password");
		String Password=sc.next();
		
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==null)
			{
				break;
			}
		
		if(a1[i].getUSERNAME().equals(Usrename)&& a1[i].getPASSWORD().equals(Password))
	       //if(Username.equals(a1[i].getUSERNAME()) && Password.equals(a1[i].getPASSWORD()))
	       {
	    	   System.out.println(a1[i].getACC_NO());
	    	   System.out.println("Pan_no:"+a1[i].getPAN_NO());
	   	       System.out.println("FName:"+a1[i].getFNAME());
	   	       System.out.println(" LName:"+a1[i].getLNAME());
	   	    System.out.println("Mob_no:"+a1[i].getMOB_NO());
	   	    System.out.println("dob:"+a1[i].getDOB());
	   	    System.out.println("Acc_no:"+a1[i].getACC_NO());
	   	    System.out.println("Blc:"+a1[i].getBLC());
	   	    System.out.println ("password:"+a1[i].getUSERNAME());
	   	    System.out.println("Username:"+a1[i].getPASSWORD());
	   	    
	    	   count++;
	       }
	       
	}

		if(count<=0)
	       {
	    	   System.out.println("Password & Username is incorrect");
	       }
		
	  
	}  
	
}
	
