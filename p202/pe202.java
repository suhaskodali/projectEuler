/*
How to solve the laserbeam problem
First, notice that reflections can be unwrapped into a straight line.
Thus, the line of reflections is just a straight line is a bigger tesselation of triangles
Let's consider the 11 reflections case: 11 is level 7, that is inside a 7 unit equailateral triangle, the line from the bottom to the top at the integer length (see picture)
Now, we consider the integers 1, 2, 3, 4, 5, 6. We need our integers to be relatively prime to 7, so that it doesn't pass through another corner earlier.
Next, we need the number to be 2 mod 3, so it actually exists the correct hole. 
That gives us 2 and 5, so two possibilities.

Similarly, with the code below (count2), consider 1000001 reflections.
The level is 500002 (i.e. 1000001+3/2). 
We look at the values 1, 2, ..., 5000001 which are relatively prime to 500002 and are also 2 mod 3 (coincidence).
Code give correct value.

Lastly, we do the same thing with large number. 
Because array have maxInteger index, I split it all the values 1, 2, .., n into five array. Don't actually show all five
Relatively prime is same for all five arrays, so I just picked.
Coincidentally, we are looking at 2 mod 3 values, so from 1 to n/5 (it's 1 mod 3, b/c of array index start at 0).
Next from n/5 to 2n/5, it's 2 mod 3, from 2n/5 to 3n/5, it's 0 mod 3 and so on. 
Code below calculates the values for each mod and I manually add the values to get: 1209002624

Suhas Kodali

*/

public class pe202 {
	
	

	public static void main (String args[]) {
		
		
		boolean[] first = new boolean[1201763915];

		
		//For division by 5
		for (int i=1; i<=240352783; i++) {
			first[5*(i)-1] = true;
		}
		//For division by 11
		for (int i=1; i<=109251265; i++) {
			first[11*(i)-1] = true;
		}
		//For division by 17
		for (int i=1; i<=70691995; i++) {
			first[17*i-1] = true;
		}
		//For division by 23
		for (int i=1; i<=52250605; i++) {
			first[23*i-1] = true;
		}
		//For division by 29
		for (int i=1; i<=41440135; i++) {
			first[29*i-1] = true;
		}
		//For division by 41
		for (int i=1; i<=29311315; i++) {
			first[41*i-1] = true;
		}
		//For division by 47
		for (int i=1; i<=25569445; i++) {
			first[47*i-1] = true;
		}
		
		int count = 0;
		for (int i=0; i<1201763915; i++) {
			if ((first[i] == false) && ((i%3)==2)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		/*
		Working for 1000001 reflections
		boolean second[] = new boolean[500002];
		
		//For division by 2
		for (int i=1; i<=250001; i++) {
			second[i*2-1] = true;
		}
		//For division by 53
		for (int i=1; i<=9434; i++) {
			second[53*i-1] = true;
		}
		//For division by 89
		for (int i=1; i<=5618; i++) {
			second[89*i-1] = true;
		}
		
		int count2 = 0;
		for (int i=0; i<500002; i++) {
			if ((second[i] == false) && ((i%3)==1))
				count2++;
		}
		
		System.out.println(count2);
		
		*/
	}

}