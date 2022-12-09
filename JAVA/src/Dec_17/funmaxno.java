package Dec_17;

public class funmaxno {
public static void main(String[] args) {
	int a=10;
	int b=20;
	findmax(a,b);
	findmax(180,120);
}
public static void findmax(int a, int b)
{
	if (a>b)
		System.out.println("a= "+a);
	else 
		System.out.println("b= "+ b);
}
}
