package Practice;

public class p4 {
int a=100;
float b=200.5f;
public static void main(String[] args) 
{
	char c='x';
	 System.out.println(c);
//System.out.println(p4.a);
p4.m2();
p4 refvar = new p4();
System.out.println(refvar.b);
refvar.m1();
System.out.println(refvar.a);
}

void m1() {
	System.out.println("inside ns m1");
}
static void m2() {
	System.out.println("inside s m2");
}}