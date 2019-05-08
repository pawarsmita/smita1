package com.extermity.customException;

public class InvalidAcc extends RuntimeException 
{
  public InvalidAcc(String msg)
  {
	  super(msg);
  }
}
