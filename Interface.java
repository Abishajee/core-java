package pbg;
interface It1
{
	void method1();
	void method2();
	void method3();
}
public class Interface implements It1 {
public void method1() {
	System.out.println("Method1");
}
public void method2() {
	System.out.println("Method2");
}
public void method3() {
	System.out.println("Method3");
}
public static void main(String args[]) {
	It1 t=new Interface();
	t.method1();
	t.method2();
	t.method3();
}
}
