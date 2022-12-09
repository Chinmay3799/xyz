package Dec_14;

public class armstrong {
	public static void main(String[] args) {
	String str = "i will be joining infosys on 23 dec";
		//		System.out.println("length=" + str.length());

	int res2= str.indexOf('o');
	System.out.println(res2);
 int res=str.indexOf('o',str.indexOf('o')+1);
System.out.println(res);
 res= str.indexOf('o',res+1);
	System.out.println(res);
	res = str.indexOf('z');
	System.out.println(res);
	if (res==-1)
		System.out.println("index is not found");
	
	
	
	}
}
