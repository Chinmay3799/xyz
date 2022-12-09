package Dec_15;

public class arra2 {
	public static void main(String[] args) {
		String []s = new String [5];
	//	for (int i=0;i<s.length;i+=1) 
	
		
	//	System.out.println(s[i]);
		
		s[0]="orange";
		s[1]="yellow";
		s[2]="red";
		s[3]="pink";
		s[4]="blue";
		for (int i=0;i<s.length;i+=1)	
		System.out.println(s[i]);
	for(String s1: s) {
	System.out.println(s1);
	
	}
	}
}
