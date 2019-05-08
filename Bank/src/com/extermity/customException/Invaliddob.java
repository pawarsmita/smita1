package com.extermity.customException;

public class Invaliddob extends RuntimeException
{
   public Invaliddob(String msg)
   {
	   super(msg);
   }
}
