package Dec_14;

public class find2occinstr {
public static void main(String[] args) {
	String s= "google zoath";
	int cnt=0;
	for (int i=0;i<s.length();i+=1) {
		char ch = s.charAt(i);
		if (ch=='t')
		{ 
			cnt=cnt+1;
			System.out.println("char found at index="+i);
		}
		if (cnt==3) {
			System.out.println("char found at index=" + i);
			break;
		}
	
	}
	System.out.println("cnt="+cnt);
if (cnt==0) {
	System.out.println("char t does not found");
}
}	
}
