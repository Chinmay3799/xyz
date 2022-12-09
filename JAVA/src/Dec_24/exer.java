package Dec_24;

import java.util.Scanner;

public class exer {
	
	public static void arrayPrint(int no, int[] arr)
	{
		int cnt=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				int sum= arr[i]+arr[j];
				
				if(sum==no)
				{
					System.out.println(i+","+j);
					cnt++;
					
				}
				
			}
			
			if(cnt==0)
				System.out.println("Addition not equal to target number..!");
			
		}
		// 12 17 16 28
		
	}
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Array length: ");
	int len=sc.nextInt();
	
	int arr[]=new int[len];
	
	System.out.println("Enter Array Values ");
	
	int n=0;
	for(int i=0; i<arr.length; i++)
	{
		System.out.print("Enter Array value of Index "+(n++)+": ");
		arr[i]=sc.nextInt();
	}
	
	System.out.print("Enter Target Number: ");
	int no=sc.nextInt();
	
	arrayPrint(no,arr);
			

}
}
