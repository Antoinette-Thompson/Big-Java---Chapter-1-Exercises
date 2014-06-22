package myPackage;

public class SumReciprocals {
	public static void main(String[] args){
		//Computes *incorrectly* the sum of 1/1+1/2+...+1/10
		System.out.println(1/1+1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10);
		//Computes the sum of 1/1+1/2+...+1/10 correctly.
		System.out.println(1/1.0+1/2.0+1/3.0+1/4.0+1/5.0+1/6.0+1/7.0+1/8.0+1/9.0+1/10.0);
				
		/* The second method prints a correct value because it is understood
		 * to be a floating point. The values from the first method are truncated to
		 * "1+0+0+....+0" respectively. */
	
		}

}
