package chinmay;

public class month {
public static void main(String[] args) {
	int month1=55;
	 if (month1 > 12)
	 
		 month1= month1 % 12;
	 
	 if (month1 == 0)
	 {
		 month1 = 12;
	 }
	 
	 switch (month1)
	 {case 1:
		System.out.println("jan");
		break;
	 case 2:
		 System.out.println("feb");
		 break;
	 case 3:
		 System.out.println("march");
	 case 4:
			System.out.println("apr");
			break;
		 case 5:
			 System.out.println("may");
			 break;
		 case 6:
			 System.out.println("june");
		 case 7:
				System.out.println("jul");
				break;
			 case 8:
				 System.out.println("aug");
				 break;
			 case 9:
				 System.out.println("sept");
				 break;
			 case 10:
				 System.out.println("oct");
			 break;
			 case 11:
			 System.out.println("nov");
			 break;
			 case 12:
				 System.out.println("dec");
} 
	
	  
	
}

}
