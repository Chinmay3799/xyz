package Dec_16;

public class twod3 {
public static void main(String[] args) {
	int [][]s = new int [][] {
		{10,100,300},
		{400,33,2},
		{200,234,45},
		{120,40,20}
	};
	int r=0;
	while(r<s.length) {
		int c=0;
	
		while(c<s[r].length){
			System.out.print(String.format("%5d", s[r][c]));
			c+=1;
		}
		r+=1;
		System.out.println();
	}
	System.out.println("-".repeat(15));
     for (int i=0;i<3;i+=1)
    	 System.out.println(String.format("%5d", s[i]));
}
}