
public class ifint {
public static void main(String[] args) {

	double n1 = -4.5, n2=3.9, n3=2.5;
	if(n1<=n2 && n1<=n3) {
		System.out.println(n1+ "is the smallest number");
	}
	else if (n2<=n1 && n2<=n3) {
		System.out.println(n2+ "is the smallest number");
	} 
	if (n3<=n1 && n1<=n2) {
		System.out.println(n3+ "is the smallest number");
	}
}
}
