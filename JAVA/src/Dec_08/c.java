package Dec_08;

public class c {
	public static void main(String[] args) {
		int no=6;
		int sum=0;
		for (int div=1;div<no;div++) {
		   int r= no%div;
		   if (r==0) {
			   sum=sum+div;
		   }
		}
				if (sum==no) 
			
				System.out.println(no+"is perfecct no");
			
			else 
				System.out.println(no+"is not perfect no");
			
				
		
	}

}
