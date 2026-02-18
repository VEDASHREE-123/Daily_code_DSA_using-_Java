package placement;
import java.math.BigInteger;

public class gcdhcf {

    public static void main(String[] args) {
        int a = 20, b = 28;

        // Convert to BigInteger and compute GCD
        int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();

        System.out.println(gcd); 
    }
}

