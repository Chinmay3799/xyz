package Dec_17;

public class fun3 {
public static void main(String[] args) {
	 float a= 1.23f;
			 float b=3.67f;
	float j=add2no(a,b);
	add2no(15.66f,16.45f);	
System.out.println("j="+j);
}
public static float add2no( float a, float b)
{
	float res; 
	res = a+b;
	return res;
}
}
