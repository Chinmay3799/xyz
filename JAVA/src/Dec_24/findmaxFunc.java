package Dec_24;

public class findmaxFunc {
	public static void findmax(int... s) {
		int m = -100;
		for (int a = 0; a < s.length; a++) {
			if (s[a] > m) {
				m = s[a];

			}
		//	System.out.println("max no=" + m);
		}
		System.out.println("max no=" + m);
	
	}

	public static void main(String[] args) {
		findmax(10, 20, 5, 4, 90);
	}

}
