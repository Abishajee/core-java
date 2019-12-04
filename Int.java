package pbg;

public interface Int {
	public static void main(String args[]) {
		Int t=new noon();
		t.method1();
		t.method2();
		t.method3();
	}
	void method1();
	void method2();
	void method3();
}
 class noon implements Int {
public void method1() {
	System.out.println("Method9");
}
public void method2() {
	System.out.println("Method2");
}
public void method3() {
	System.out.println("Method3");
}

}
