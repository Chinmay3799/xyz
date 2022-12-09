package Practice;


	public class p {
		static int a=100;
		static float m2(float xx)
		{
			System.out.println("inside m1");
			float aa=xx+20;
			return aa;
		}
		
		public static void main(String[] args) {
			System.out.println("start @ cyber success");
			float xx=200.5f;
		System.out.println(p.a);
		float b=p.m2(xx);
		System.out.println(b);
		System.out.println("stop @ cyber sucess");
		}

	}


