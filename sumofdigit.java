package placement;

public class sumofdigit {
	static int sumofdig(int n) {
		if(n==0)
			return 0;
		return (n%10)+sumofdig(n/10);
	}

	public static void main(String[] args) {
		System.out.println(sumofdig(12345));
		// TODO Auto-generated method stub

	}

}
