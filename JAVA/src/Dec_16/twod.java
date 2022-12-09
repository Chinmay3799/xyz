package Dec_16;

public class twod {
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
		int [][]s2 = new int [][] {
			{0,0,0},
			{0,0,0},
			{0,0,0},
			
		};
		
		for (int i=0;i<s.length;i+=1) {
			for (int j=0;j<s.length;j+=1) {
				System.out.print(String.format("%-5d", s[i][j]));
			}
			if ( i == s.length/2) 
				System.out.print("+ ");
				
				else 
					System.out.print("  ");				
			
		for (int j=0; j<s.length; j+=1) {

			System.out.print(String.format("%-5d", s1[i][j]));
			
		}
		
		
			
		}System.out.println();
		}
}
		
		
		
		
		
		
		


