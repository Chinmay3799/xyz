package Dec_16;

public class twodwhile {
	public static void main(String[] args) {
		int [][]s = new int [][] {
			{10,100,300,500,6},
			{400,33,2},
			{200,234,45,51},
			{120,40}
		};
		
		int r=0;
		int sum=0;
		while(r<s.length){
			int c=0;
		
			while(c<s[r].length) {
				
				System.out.print(String.format("%5d", s[r][c]));
				sum=sum+s[r][c];
				c+=1;
			}
			
			System.out.println("             Total sum="+String.format("%6d", sum));
			System.out.println();
			r+=1;
		}
	}

}