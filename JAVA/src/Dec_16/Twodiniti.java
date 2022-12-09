package Dec_16;

public class Twodiniti {
	public static void main(String[] args) {
		int [][] s=  new int [][] {
			{10,100,300,40,10},
			{400,33,2,50,20,200},
			{200,234,45,66,},
			{120,40,400}
		};
		/*System.out.println("s.lenghth="+s.length);
		System.out.println(s[0].length);
		System.out.println(s[1].length);
		System.out.println(s[2].length);
		System.out.println(s[3].length);
		*/
		int r=0;
		while(r<s.length) {
			int c=0;
			while(c<s[r].length) {
				System.out.print(String.format("%5d", s[r][c]));
				c++;
			}
			System.out.println();
			r++;
		}
	}
}
