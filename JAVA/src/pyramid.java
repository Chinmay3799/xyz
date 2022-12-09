
public class pyramid {
public static void main(String[] args) {
	int space=10;
	int starCount=1;
	for (int row=1;row<=10;row+=1)
	{
		for(int j=1;j<=space;j+=1)
			System.out.print(" ");
		for(int j=1;j<=starCount;j+=1)
			System.out.print("*");
		starCount+=2;
		space=space-1;
	System.out.println();
	}
}
}
