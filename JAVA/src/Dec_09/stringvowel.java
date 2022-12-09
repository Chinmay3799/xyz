package Dec_09;

public class stringvowel {
public static void main(String[] args) {
	String a = "cybeer";
	
	for (int i =0;i<a.length();i+=1)
	       {
		char ch = a.charAt(i);
		if (ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
                System.out.println(a.charAt(i));
      
	       }	
	}
}
