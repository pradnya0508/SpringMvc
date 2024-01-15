package com.demomvc.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializationdem0 
{
	String name;
	String rollnumber;
	
	public static void main(String[] args) throws IOException 
	{
		Serializationdem0 s1 = new Serializationdem0(); 
		s1.name ="Pradnya";
		s1.rollnumber ="12345";
		
		try{
		String filename = "C:\\Users\\Admin\\Desktop\\All project\\Zee Tv\\Testfile.txt";
		
		FileOutputStream fos = new FileOutputStream(filename); //call file output class to store string
		ObjectOutputStream os = new ObjectOutputStream(fos); //call for serializable 
		os.writeObject(s1);
		
		os.close();
		fos.close();
		System.out.println("Data save successfully");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
