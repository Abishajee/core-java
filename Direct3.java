package pbg;
	import java.util.Scanner;

	public class Direct3 {


	public static void main(String[] args) {
	Direct2 obj=new Direct2();
	Scanner s=new Scanner(System.in);
	System.out.println("Registration");
	System.out.println("Name");
	String name=s.next();
	obj.setname(name);
	   System.out.println("Address");
	String address=s.next();
	obj.setaddress(address);
	System.out.println("Email");
	String email=s.next();
	obj.setemail(email);
	System.out.println("Phone Number");
	 int phno=s.nextInt();
	 obj.setphno(phno);
	 
	 //user details
	System.out.println(" Registration");
	System.out.println("Name:"+obj.getname());
	System.out.println("Address:"+obj.getaddress());
	System.out.println("Email:"+obj.getemail());
	System.out.println("Contact Number:"+obj.getphno());

	}

	}



