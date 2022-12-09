package Dec_21;

public class Function {
	public static void main(String[] args) {
         printString();
         printString("world of  java world");
         int res = add(10,20);
         System.out.println("result="+res);
	}
public static int add(int a, int b)
{
	return a+b;
}
public static void printString(String s)
{
	System.out.println("this is the " + s);
}
 public static void printString()
 {
	 System.out.println("this is default");
 }

}
