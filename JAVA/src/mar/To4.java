package mar;

public class To4 {
	
	void printno() 
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}	
			System.out.println();
		}
	}
public static void main(String[] args) {
	To4 obj= new To4();
	obj.printno();
}
}
