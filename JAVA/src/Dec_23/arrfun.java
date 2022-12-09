package Dec_23;

public class arrfun {
public static void main(String[] args) {
	String []s= {"sunny","mia","ava","lisa"};
	String []b= printarr(s);
	for (int y=0; y<s.length;y++) {
		System.out.println(b[y]);
	}
}
public static String [] printarr(String []s) {
	String []v = new String [2];
	v[0]=s[0];
	v[1]=s[s.length-1];
	return v;
			
}
}
