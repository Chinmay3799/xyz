package Dec_16;

public class twoDsum {
public static void main(String[] args) {
	int [][]s = new int [][] {
		{10,100,300,500,6},
		{400,33,2},
		{200,234,45,51},
		{120,40}
	};
	int sum=0;

	for (int r=0;r<s.length;r+=1)
	{
		int rowsum=0;
		for (int j=0;j<s[r].length;j+=1) {
			System.out.print(String.format("%5d", s[r][j]));
		sum= sum+s[r][j];
		rowsum=rowsum+s[r][j];
		}System.out.println("="+rowsum);
		System.out.println();
	}
	System.out.println("Total sum="+sum);	
		
	
}
}
