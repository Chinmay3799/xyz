package Dec_09;

public class stringdowhile {
public static void main(String[] args) {
	String s="Rohit Sharma";
	int i=s.length()-1;
	do {
	System.out.print(s.charAt(i));	
	i-=1;
			}
	while(i>=0);
	
}
}
