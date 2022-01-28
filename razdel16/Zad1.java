package razdel16;
import java.math.BigInteger;
public class Zad1 {

	public static void main(String[] args) {
		BigInteger a;
		BigInteger b;
		BigInteger c;
		a = BigInteger.valueOf(10);
		b = BigInteger.valueOf(2);
		c = BigInteger.valueOf(3);
		a=a.pow(49);
		a.remainder(b);
		int i=0;
		while (i<6) {
			if (a.remainder(b)==BigInteger.valueOf(0)) {	
				i++;
				String aStr = a.toString();
				System.out.println(aStr);
				
				
			}
			if (a.remainder(c)==BigInteger.valueOf(0) && a.remainder(b)!=BigInteger.valueOf(0)) {
				i++;
				String aStr = a.toString();
				System.out.println(aStr);
				
			}
			a=a.add(BigInteger.ONE);
		}
		
	}

}
