/*
 * This program is part of my learning Java series
 * This one looks at use of methods split over classes
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-6-avoiding-tangled-code-with.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

package sharedMethods;

public class basicMethod {

	public static void main(String[] args) {

		// Call the method to print - this is in another class
		printClass printout = new printClass();
		printout.printMe();
	}

}
