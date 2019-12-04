package pbg;

import java.util.Scanner;
public class Encap{	
public static void main(String[]args) {
	
	Scanner s=new Scanner(System.in);
	Encap1 ee=new Encap1();
	System.out.println("Enter your Name");
	String Name=s.next();
	ee.setname(Name);
	System.out.println("Enter your Username");
	String Username=s.next();
	ee.setusername(Username);
	System.out.println("Enter your Password");
	String Password=s.next();
	ee.setpassword(Password);
	System.out.println("Enter your ID");
	int Id=s.nextInt();
	ee.setid(Id);
	
	
	
	  System.out.println("NAME:"+Name);
	   System.out.println("USERNAME:"+Username);
	   System.out.println("PASSWORD:"+Password);
	   System.out.println("ID:"+Id);	   
  }
}
