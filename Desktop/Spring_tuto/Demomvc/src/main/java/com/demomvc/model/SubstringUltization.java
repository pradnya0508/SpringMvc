package com.demomvc.model;

public class SubstringUltization 
{
	public  static void main(String args[]) 
	{
		String originalstring= "Pradnya";
		//String substring = originalstring.substring(1, 7);
		
		String substrings = originalstring.substring(0, 0).intern();
		System.out.println(substrings);
	}

}
