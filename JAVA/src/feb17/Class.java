package feb17;

public class Class {
int a=1;
 void newmethod() {
	int b=2;
	if(a>b) {
		System.out.println(a);
	}
	else 
		System.out.println(b);
	if(a==b) {
		System.out.println(a);
	}
	else
		System.out.println(b);
	if (a!=b) {
		System.out.println(a);
	}
	else 
		System.out.println(b);
}
public static void main(String[] args) {
   Class o=new Class();
   o.newmethod();

	   
}
}
