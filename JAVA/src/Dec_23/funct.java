package Dec_23;

public class funct {
public static void main(String[] args) {
	int a=10;
	int b=15;
	float res=multi(a,b);
	//System.out.println(res);
	System.out.println("res="  + String.format("%10.1f", res));
}
public static float multi(int a, int b) {
	int res=a*b;
	return res*0.545f;
	
}
}
