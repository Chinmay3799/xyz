package Dec_09;

public class palindrome {
	public static void main(String[] args) {
		String s ="infosys";
		 for (int i=0;i<s.length()%2;i+=1)
		 {
			if (s.charAt(i) != s.charAt(s.length()-i-1))
		
			System.out.println(s+ " string is not palindrome");
			else
				System.out.println(s+ " string is palindrome");
				
				
			}
		 }		 
	

}
