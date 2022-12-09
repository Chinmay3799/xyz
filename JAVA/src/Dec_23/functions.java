package Dec_23;

public class functions {
	public static void main(String[] args) {
	String s="Dhoni";
	int cnt =4;
	printname(s,cnt);	
	}
	public static void printname(String a, int cnt) {
		for (int  x=1; x<=cnt; x++) 
			System.out.println(x+" "+a );
		
	}
}
