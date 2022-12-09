package dec06;

public class printStarsAtBoundarySqaure {
	public static void main(String[] args) {
		for (int r=0;r<5;r+=1)
		{
			for(int c=0;c<5;c+=1)
			{
				if(r>0 && c>0 && c<4 && r<4)
					System.out.print("");
				else 
					System.out.print("*");
			}
		System.out.println();
		}
	}

}
