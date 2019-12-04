package pbg;
class java
{
public void add(int a,int b)

{
System.out.println(a+b);
}
}
public class Inherit extends java
{
public void sub(int a,int b)
{
System.out.println(a-b);
}
public static void main(String [] args)
{
Inherit ja=new Inherit();
ja.add(20,10);
ja.sub(20,10);

}

}
