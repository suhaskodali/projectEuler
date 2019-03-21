import java.math.BigInteger;

public class pe78 {

	public static void main(String[] args) {
		
		polynomial x1 = new polynomial(10000);
		x1.generateXN(1);
		

		
		
		

		

		for (int i=2; i<10000; i++) {
			polynomial px = new polynomial(10000);
			px.generateXN(i);
			x1.multiplyPoly(px);
		}
		
		BigInteger num1000 = new BigInteger("1000");
		BigInteger num0 = new BigInteger("0");
		
		for (int i=0; i<10000; i++) {
			if (x1.getPolynomial()[i].mod(num1000).compareTo(num0)==0)
				System.out.print("For " + i + ": " + x1.getPolynomial()[i].toString() + ", ");
		}

		
		
		
	}
}