public class  p16 {


	private static long startTime = System.currentTimeMillis();
	public static void main(String[] args) {
		
		int[] powerOfTwo = new int[303];
		powerOfTwo[0] = 2;
		new p16().exponentiate(999, powerOfTwo);
		int total =0;;
		for (int i=0; i<303; i++) {
			total+=powerOfTwo[i];
		}
		System.out.println(total);
		long endTime = System.currentTimeMillis();
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}
	
	public int[] multiply2(int[] curr) {
		int value =0;
		for (int i=0; i<curr.length; i++) {
			value = 2*curr[i];
			curr[i] = value;				
			}
		
		return curr; 
		
	}
	
	public int[] carryOneOver (int[] curr) {
		int value =0;
		for (int i=0; i<curr.length; i++) {
			if (curr[i]>9) {
				value = curr[i];
				curr[i] = value-10;
				curr[i+1] = curr[i+1]+1;
			}
		}
		return curr;
	}
	
	public void exponentiate(int number, int[] curr) {
		for (int i=0; i<number; i++) {
			multiply2(curr);
			carryOneOver(curr);
		}
		
	}
}