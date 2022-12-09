
public class Tester{
public static void main(String[] args) {
	int a=30;
	int b=45;
	System.out.println(a+"and"+b);
	swapfunction(a,b);
	System.out.println(a+"and"+b);
}

	public static void swapfunction(int a,int b) {
		int c=a;
		a=b;
		b=c;
		
	}
}
