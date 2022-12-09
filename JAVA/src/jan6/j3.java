package jan6;

public class j3 {
	int a;
	j3(){
		System.out.println("inside const");
System.out.println(a);
	}
	j3(int n){
		System.out.println("inside 2 cont");
this.a=a+100;
System.out.println(n);
	}
public static void main(String[] args) {
	j3 v= new j3();
	j3 n= new j3(100);
	
}
}
