package Dec_16;

public class TwodAraay {
	public static void main(String[] args) {
		int [][] a= new int [4][3];
			a[0][0]=10;
			a[0][1]=100;
			a[0][2]=300;
		    		a[1][0]=400;
				    a[1][1]=33;
				    a[1][2]=2;
				    		a[2][1]=200;
						    a[2][2]=234;
						    a[2][2]=45;
						    		a[3][0]=120;
								    a[3][1]=435;
								    a[3][2]=32;
								    
								   for (int i=0;i<4;i+=1) {
									   for (int j=0;j<3;j+=1) {
									System.out.print(String.format("%5d", a[i][j]));	   
						
									   }System.out.println("");
									   
								   }System.out.println("=================================");
								   
								   a[1][1]=8;
								   
								   for (int i=0;i<4;i+=1) {
									   for (int j=0;j<3;j+=1) {
									System.out.print(String.format("%5d", a[i][j]));	   
						
									   }System.out.println();
						
								    
								      
	}
	
	}
}
