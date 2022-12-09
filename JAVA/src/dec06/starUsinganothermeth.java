package dec06;

public class starUsinganothermeth {
public static void main(String[] args) {
	int cnt=4;
	for (int i=1;i<=5;i+=1)
	{
		for (int j=1;j<= i+cnt ;j++)
			System.out.print("*");
		cnt=cnt-2;
		System.out.println();
	}
}
}
