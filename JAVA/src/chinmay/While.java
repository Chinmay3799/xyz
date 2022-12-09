package chinmay;

public class While {
public static void main(String[] args) {
int a=1;
  while(a<=10) {
	      if (a==5) {
	    	  a+=1;
	    	  continue;
	      }
	  System.out.print(a+" ");
	  a=a+1;
  }
}
}
