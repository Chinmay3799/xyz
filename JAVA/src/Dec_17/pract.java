package Dec_17;

public class pract {
	public static void main(String[] args) {
		int [][]s = new int [][] {
			{11,12,13},
			{21,22,23},
			{30,31,34},
			
		};
		int [][]s1 = new int [][] {
			{11,12,13},
			{21,22,23},
			{31,32,33},
			
		};
	
		int sum=0;
		for (int i=0;i<3;i+=1) {
			for(int j=0;j<3;j+=1) {
				for(int k=0;k<3;k+=1) {
				sum=sum+s[i][k]*s1[k][j];
				}
		System.out.print(String.format("%6d",sum));
		
		}
			System.out.println();
		
	
	}
	}
}
