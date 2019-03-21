import java.util.*;
import java.io.*;

public class import{
	private int[][] dataInput = new int[20][20];
	
	public import() throws IOException {
		Scanner fileScan;
		int firstEntry=0;
		int secondEntry=0;
		int value;
		
		fileScan = new Scanner (new File("data.txt"));
		while (fileScan.hasNext()) {
			value = fileScan.nextInt();
			dataInput[firstEntry][secondEntry] = value;
			firstEntry = nextFirstEntryValue(firstEntry);
			secondEntry = nextSecondEntryValue(firstEntry, secondEntry);			
		}
	}
	
	public int nextFirstEntryValue(int firstEntry) {
		int first = firstEntry;
		if (first==19) {
			first=0;
		}
		else {
			first++;
		}
		return first;
		
	}
	
	public int nextSecondEntryValue (int firstEntry, int secondEntry) {
		int first = firstEntry;
		int second = secondEntry;
		if (first=19) second++;
		return second;
	}
	
	public void printlist() {
		String s;
		for (int i=0; i<20; i++) {
			for (int j=0; j<20; j++) {
				s += dataInput[i][j] + "\n";
			}
		}
		System.out.println(s);
	}
	
	

}