package Practice;

public class star {
	public static void prpy(int n) {
		
		for (int i=1;i<=n;i++) 
		{
			for (int j=n-1;j>=1;j--)
			{
			System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
		
	    }
 }
	public static void main(String[] args) {
		int n=10;
		prpy(n);
	}
	}

