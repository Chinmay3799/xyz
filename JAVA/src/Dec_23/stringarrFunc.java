package Dec_23;

public class stringarrFunc {
public static void main(String[] args) {
	String []s= {"ravi","sunny","mia","nikki"};
	String []b= new String [2];
	b=printarr(s);
	for(int x=0;x<b.length;x++) {
		System.out.println(b[x]);
	}
}
public static String[] printarr( String [] s) {
String []c= new String[2];
 c[0]=s[0];
 c[1]=s[s.length-1];
 return c;
}
}
