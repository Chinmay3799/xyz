package jan6;

public class j2 {
	int a;
	j2(){
		System.out.println("inside 0 const");
	System.out.println(a);
		 a=100;	
	}
	
	
public static void main(String[] args) {
	j2 v= new j2();
	System.out.println(v.a);
}
}
