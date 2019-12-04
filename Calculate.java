package pbg;
class cp
 {
	public void calculation(int a,int b)
	{
		System.out.println("calcutations");
		
		
	}
}
class addition extends cp{
	public void calculation(int a,int b) {
		
		System.out.println(a+b);
	}
}
class difference extends cp{
	public void calculation(int c,int b) {
		
		System.out.println(c-b);
	}
}
class multi extends cp{
	public void calculation(int a,int b) {
		
		System.out.println(a*b);
	}
}
public class Calculate{
	public static void main(String args[])
	{
		cp cal=new cp();
		cp add=new addition();
		cp diff=new difference();
		cp mul=new multi();
		
		cal.calculation(0,0);
		add.calculation(2,3);
		diff.calculation(3,2);
		mul.calculation(2,4);
	}
}