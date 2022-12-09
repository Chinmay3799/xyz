package Dec_23;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ENGLISH MARK");
		int n1= sc.nextInt();
		System.out.println("ENTER MATH MARK");
		int n2=sc.nextInt();
		System.out.println("TOTAL MARK");
		String s= sc.nextLine();
		System.out.println(s);
		int res=n1+n2;
		System.out.println(res);
		sc.close();
	
	}

}
