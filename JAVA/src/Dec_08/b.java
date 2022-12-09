package Dec_08;

public class b {
	public static void main(String[] args) {
		int fno=0;
		int sno=1;
		int t=0;
		while (fno<=21) {
			System.out.println(fno);
			t=fno+sno;
			fno=sno;
			sno=t;
		}
			
				
	}

}
