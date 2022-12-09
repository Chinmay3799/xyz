import java.util.*;

class Contest{
    int Contestid;
    String Contestname;
    String Contestwinner;
    int Contestpoints;
    String Category;
    
    Contest
    ( int Contestid,
    String Contestname,
    String Contestwinner,
    int Contestpoints,
    String Category)
    {
        this.Contestid =Contestid;
        this.Contestname = Contestname;
        this.Contestwinner=Contestwinner;
        this.Contestpoints=Contestpoints;
        this.Category=Category;
    }
    public int getcontestid()
    {
        return this.Contestid;
    }
    public String getcontestname()
    {
        return this.Contestname;
    }
    public String getContestwinner()
    {
    return this.Contestwinner;
    } 
    public int getcontestpoints()
    {
        return this.Contestpoints;
    }
    public String getcategory()
    {
        return this.Category;
    }
}
public class Solution {
	 public static void main(String []args) {
	        Scanner sc = new Scanner (System.in);
	        int n=sc.nextInt();
	        Contest[] c = new Contest[n];
	        for(int i=0;i<n;i++){
	            int Contestid= sc.nextInt();
	            sc.nextLine();
	            String Contestname=sc.nextLine();
	            String Contestwinner=sc.nextLine();
	            int Contestpoints=sc.nextInt();
	            sc.nextLine();
	            String Category=sc.nextLine();
	          c [i]= new Contest(  Contestid, Contestname,Contestwinner, Contestpoints,Category);  
	        }
	        String Contestwinner=sc.nextLine();
	        String Category=sc.nextLine();
	        sc.close();
	        }
	/* int p=findTotalPointsBasedOnWinner(c,Contestwinner);
	 if (p!=0) {
		 System.out.println(p);
	 }
	 else {
		 System.out.println("There is no matching contest");
	 }
	 Contest result=getContestWithSecondHighestPoints(c,Category);
	 if (result!=null) {
		 System.out.println(result.getcontestpoints());
	 }else {
		 System.out.println("there is no matching contest");
	 }
	 }*/
   public static int findTotalPointsBasedOnWinner(Contest[] c,String Contestwinner) {
	   int tp=0;
	   if (c!= null && Contestwinner.length()>0) {
		   for(int a=0;a<c.length;a++) {
			if (c[a].getContestwinner().equalsIgnoreCase(Contestwinner))   
			{
				tp++;
			}
		   }
	   }
	   return tp;
   }/*
public static Contest getContestWithSecondHighestPoints(Contest[] c,String Category ) {
	Contest m= null;
	PriorityQueue<Integer> pq= new PriorityQueue<>();
	if (c !=null && Category.length()>0) {
		for (int b=0;b<c.length;b++) {
			if (c[b].getcategory().equalsIgnoreCase(Category)) {
				pq.add(c[b].getcontestpoints());
			}
		}
		if (pq!=null) {
			while(pq.size()>2) {
				pq.poll();
			}
			int p=pq.peek();
			for(int d=0;d<c.length;d++) {
				if(c[d].getcontestpoints()==p) {
					m=c[d];
				}
			}
		}
	}
	if (m==null) {
		return null;
	}
	else return m;
}*/
	
}
