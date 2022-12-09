
public class c {
public static void main(String[] args) {
	int mult=1;
	int no=5;
	for (int i=1; i<=no; i++) 
	{
		System.out.print(i);
		if(i<5)
			System.out.print("*");
		
		mult=mult*i;
	}
	
		System.out.println("="+mult);
		
	
}
}


/*  

multi=1*1 =1
m=1*2= 2
M=3*2=6
m=4*6=24
m=5*24=120

*/