package placement;

public class fac {
	static int fact(int n) {
		if(n==0||n==1)
		  return 1;
		return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println(fact(num));
		

	}

}
