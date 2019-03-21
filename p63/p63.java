public class p63 {

	public static void main (String[] args) {
		String s = "";
		for (int i=8; i<10; i++) {
			s += "\n";
			for (int j=1; j<25; j++) {
				s += Math.pow(i,j) + " ";
			}
		}
		System.out.println(s);
	
	}
	
	/* for 1 digit: 1, 2, 3, 4, 5, 6, 7 ,8, 9 = 9
	 for 2 digits: 16, 25, 36, 49, 64, 81 = 6
	 for 3 digits: 125, 216, 343, 512, 729 = 5
	 for 4 digits: 1296, 2401, 4096, 6561 = 4
	 for 5 digits: 16807, 32768, 59049 = 3
	 for 6 digits: 117649, 262144, 531441 = 3
	 for 7 digits: 2097152, 4782969 =2 
	 for 8 digits: 2
	 for 9 digits: 2
	 for 10 digits: 2
	 for 11-
	Total : 36
	*/

}