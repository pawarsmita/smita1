package com.extermity.model;

public class Account 
{
	private long pan_NO;
	private String FName;
	private String Lname;
	private long Mob_no;
	private int dob;
	private long Acc_no;
	private long Blc;
	private String password;	
	private String Username;
	
	
	public void setPAN_NO(long pan_NO)      //PAN_NO
	{
		this.pan_NO=pan_NO;
	}
	public long getPAN_NO()
	{
		return pan_NO;
	}			
	
	
	public void setFNAME(String Fname )     //FNAME
	{
		this.FName=Fname;
	}
	
	public String getFNAME()
	{
		return FName;
	}
	
	
	public void setLNAME(String Lname )      //LNAME
	{
		this.Lname=Lname;
	}
	
	public String getLNAME()
	{
		return Lname;
	}
	
	public void setMOB_NO(long Mob_no)        //MOB_NO 
	{
		this.Mob_no=Mob_no;
	}
	public long getMOB_NO()
	{
		return Mob_no;
	}		
	
	
	
	public void setDOB(int dob)        //DOB 
	{
		this.dob=dob;
	}
	public int getDOB()
	{
		return dob;
	}

	public void setACC_NO(long Acc_no)       //Acc_no
	{
		this.Acc_no=Acc_no;
	}
	public long getACC_NO()
	{
		return Acc_no;
	}										
	
	public void setBLC(long rs)       //Blc
	{
		this.Blc=rs;
	}
	public long getBLC()
	{
		return Blc;
	}			
	
	public void setPASSWORD(String password )      //password
	{
		this.password=password;
	}
	
	public String getPASSWORD()
	{
		return password;
	}
	
	public void setUSERNAME(String Username )      //Username
	{
		this.Username=Username;
	}
	
	public String getUSERNAME()
	{
		return Username;
	}


}
