package Dec_24;

public class max2func {
	public static int findmax(int t, int...a ) {
		int c=t;
		for (int v=0;v<a.length;v++) {
			if (a[v]> t)
			c=a[v];
			
		}
		return c;
	}
	
	public static int findmax(String s, char c, int...a) {
		System.out.println(s+"ch="+c);
		int m=a[0];
		for (int x=0;x<a.length;x++) {
			if (a[x]>m)
				m=a[x];
	}
	return m;	
	}
	
	public static void main(String[] args) {
	System.out.println(findmax("chinmay",'c',10,4,5,6,1));
		System.out.println(findmax(100,10,52,30,1,2,655));
	}

}
