import java.util.*;
import java.io.*;

public class p11 {
	
	public static void main (String args[]) throws IOException {
		importing first = new importing();
		first.print1919();
		first.print0000();
		first.printlist();
		int large = first.checkAllHorizontalAndVertical();
		System.out.println(large);
		int large2 = first.checkAllDiagonalOne();
		int large3 = first.checkAllDiagonalTwo();
		System.out.println(large + " " +large2 + " " + large3);
	}

}