package placement;

public class sqaurefindnautral {
	static int findNatural(int n) {
		return (n*(n+1)*(2*n+1))/6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("natural number"+findNatural(n));

	}


}
