import java.util.*;
import java.io.*;

public class importing{
	private int[][] dataInput = new int[20][20];
	
	public importing() throws IOException {
		Scanner fileScan;
		int firstEntry=0;
		int secondEntry=0;
		int value;
		
		fileScan = new Scanner (new File("data.txt"));
		while (fileScan.hasNext()) {
			value = fileScan.nextInt();
			dataInput[firstEntry][secondEntry] = value;
			firstEntry = nextFirstEntryValue(firstEntry, secondEntry);
			secondEntry = nextSecondEntryValue(secondEntry);			
		}
	}
	
	public int nextSecondEntryValue(int secondEntry) {
		int second = secondEntry;
		if (second==19) {
			second=0;
		}
		else {
			second++;
		}
		return second;
		
	}
	
	public int nextFirstEntryValue (int firstEntry, int secondEntry) {
		int first = firstEntry;
		int second = secondEntry;
		if (second==19) first++;
		return first;
	}
	
	public void printlist() {
		String s = "";
		for (int i=0; i<20; i++) {
			s += "\n";
			for (int j=0; j<20; j++) {
				s += dataInput[i][j] + " ";
			}
		}
		System.out.println(s);
	}
	
	public void print1919() {
		String s = "" + dataInput[19][19];
		System.out.println(s);
	}
	
	public void print0000() {
		String s = "" + dataInput[0][0];
		System.out.println(s);
	}
	
	public int checkAllHorizontalAndVertical() {
		int highest = 0;
		int valueH =0;
		int valueV = 0;
		
		for (int i=0; i<20; i++) {
			for (int j=0; j<17; j++) {
				valueH = dataInput[i][j]*dataInput[i][j+1]*dataInput[i][j+2]*dataInput[i][j+3];
				valueV = dataInput[j][i]*dataInput[j+1][i]*dataInput[j+2][i]*dataInput[j+3][i];
				if (valueH > highest) highest = valueH;
				if (valueV > highest) highest = valueV;
			}
		}
		
		return highest;
	}
	
	public int checkAllDiagonalOne() {
		int highest =0;
		int valueD1 = 0;
		
		for (int i=0; i<17; i++) {
			for (int j=0; j<17; j++) {
				valueD1 = dataInput[i][j]*dataInput[i+1][j+1]*dataInput[i+2][j+2]*dataInput[i+3][j+3];
				if (valueD1 > highest) highest = valueD1;
			}
		}
		
		return highest;
	}
	
	public int checkAllDiagonalTwo() {
		int highest =0;
		int valueD2=0;
		for (int i=0; i<17; i++) {
			for (int j=19;j>2;j--){
				valueD2 = dataInput[i][j]*dataInput[i+1][j-1]*dataInput[i+2][j-2]*dataInput[i+3][j-3];
				if (valueD2 > highest) highest = valueD2;
			}
		}
		return highest;
	}
	
	

}