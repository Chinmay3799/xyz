package jan6;

public class j1 {
	j1(){
		System.out.println("inside 0 constructor");
	
	}
	j1(int a){
		System.out.println("inside 1 arg const");
	System.out.println(a);
	}
	
	
public static void main(String[] args) {
	System.out.println("start");
j1 b= new j1();
j1 a= new j1(100);

}
}
