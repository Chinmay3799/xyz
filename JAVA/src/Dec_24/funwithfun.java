package Dec_24;

public class funwithfun {
	public static void f1() {
		System.out.println("in f1");
		f2();
		System.out.println("end f1");
	}
	public static void f2() {
		System.out.println("inside f2");
		f3();
		System.out.println("f2 end");
	}
	public static void f3() {
		System.out.println("in f3");
		f4();
		System.out.println("f3 end");
	}
	public static void f4() {
		System.out.println("inside f4");
	}
	
	public static void main(String[] args) {
		
		System.out.println("program started");
		f1();
		System.out.println("program is over");
	}

}
