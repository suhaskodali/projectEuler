import java.math.BigInteger;

public class polynomial {

	private BigInteger[] poly;
	private int length;

	public polynomial(int num) {
		poly = new BigInteger[num];
		length = num;
	}
	
	public BigInteger[] getPolynomial() {
		return poly;
	}
	
	public BigInteger getValueAt(int i) {
		return poly[i];
	}
	
	public int getLength() {
		return length;
	}
	
	public void generateXN(int num) {
		for (int i=0; i<length; i++) {
			if (i%num==0)
				poly[i] = BigInteger.ONE;
			else
				poly[i] = BigInteger.ZERO;
		}
	}
	
	public void multiplyPoly(polynomial newPoly) {
		BigInteger[] currPoly = new BigInteger[length];
		for (int i=0; i<length; i++) {
			currPoly[i] = BigInteger.ZERO;
		}
		for (int i=0; i<length; i++) {
			for (int j=0; j<newPoly.getLength(); j++) {
				if (i+j<length)
				{
					BigInteger curr = newPoly.getValueAt(j).multiply(poly[i]);
					currPoly[i+j] = currPoly[i+j].add(curr);
				}
			}
		}
		poly = currPoly;
	}
	
	
	
	

}