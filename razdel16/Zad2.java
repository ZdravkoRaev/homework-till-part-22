package razdel16;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Zad2 {

	public static void main(String[] args) {
		double d=Double.MAX_VALUE;
		BigInteger b;
		BigInteger c;
		
		BigInteger a = BigDecimal.valueOf(d).toBigInteger();
		b = BigInteger.valueOf(2);
		c = BigInteger.valueOf(3);;
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
//2^53-1