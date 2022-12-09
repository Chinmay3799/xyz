package feb20;

public class fizzbuzz {
	void printfizzbuzz() {
		int n=20;
		for(int i=1;i<=n;i++) {
		
			if(i%3==0 && i%5==0) {
		System.out.println("fizzbuzz");
			}
		
			else	if(i%5==0) {
				System.out.println("Buzz");
			}
			
			else if(i%3==0 ) {
				System.out.println("fiz");
			}
			else 
				System.out.println(i);
		}
	}
public static void main(String[] args) {
	fizzbuzz obj = new fizzbuzz();
	obj.printfizzbuzz();
}
}

