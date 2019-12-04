package pbg;

import java.util.Scanner;

public class Direct1 {
String name;
String address;
String email;
int phno;

public Direct1(String name,String address,String email,int phno)
{
this.name=name;
this.address=address;
this.email=email;
this.phno=phno;
}
public void display() {
System.out.println(" Registeration");
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Email:"+email);
System.out.println("Contact Number:"+phno);
}
public static void main(String[] args) {

Scanner s=new Scanner(System.in);
System.out.println("Enter User Details");
System.out.println("Enter  user name");
String name=s.next();
System.out.println("Enter address");
String address=s.next();
System.out.println("Enter email");
String email=s.next();
System.out.println("Enter Phone Number");
 int phno=s.nextInt();
 Direct1 obj=new Direct1(name,address,email,phno);
 obj.display();
 

}
}
