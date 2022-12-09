package Dec_24;

public class overload {
	public static int add2no(int n1, int n2,int n3) {
		int res=n1+n2+n3;
		return res;
	}
	public static int add2no(int n1,int n2) {
		int res=n1+n2;
		return res;
		
	}
	public static String add2no(int n1, int n2, String s) {
	
	return s+" "+ (n1+ n2);
	}
	public static float add2no(float n1,float n2) {
		
		return n1+n2;			
	}
	public static float add2no(int n1,float n2) {
		return n1+n2;
	}
	public static String add2no(int n1,float n2,String a) {
		return n1+n2+a;
	}
public static void main(String[] args) {
	System.out.println("additin= "+ add2no(10,30,40));
	System.out.println("addition= "+ add2no(10,3));
	System.out.println("addition= "+ add2no(10,3,"chinmay"));
	System.out.println("addition= "+ add2no(10f,5.5f));
	System.out.println("addition= "+ add2no(10,5.6f));
System.out.println("a="+add2no(9,5f,"success"));
}
}
