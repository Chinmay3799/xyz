package Dec_17;

public class funstring {
public static void main(String[] args) {
	String s1="virat";
	String s2=" rohit sharma";
	 
	System.out.println(comp2str(s1,s2));
}
public static String comp2str(String s1, String s2)
{
	String s;
	int s1len=s1.length();
	int s2len=s2.length();
	if (s1len>=s2len) 
		s=s1;
		
	else 
		s=s2;
return s;	
}
}
