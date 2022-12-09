package Dec_16;

public class arrayaddition {
	public static void main(String[] args) {
		int [][]s = new int [][] {
			{10,100,300},
			{400,33,2},
			{200,234,45},
			
		};
		int [][]s1 = new int [][] {
			{10,100,300},
			{400,33,2},
			{200,234,45},
			
		};
		int[][]c=new int [3][3];
		for(int i=0;i<s.length;i+=1) {
			for (int j=0;j<s1.length;j+=1) {
				c[i][j]=s[i][j]+s1[i][j];
				System.out.print(String.format("%5d", c[i][j]));
			}
			System.out.println();
		}
		
		
	}

}
