
public class pyra {
	public static void main(String[] args) {
	
		for (int i=1;i<=20;i+=1)
		{
        for (int space=20;space>=i;space-=1)
        	System.out.print(" ");
        for (int j=1;j<=i;j+=1)
			System.out.print("*"+" ");
      
	  System.out.println();

	  
		}
}
}