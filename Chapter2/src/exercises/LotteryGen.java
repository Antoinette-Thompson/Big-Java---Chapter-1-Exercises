package exercises;
import javax.swing.JOptionPane;
import java.util.Random;
public class LotteryGen {
	public static void main(String[] args)
	{
		Random lottGen = new Random();
		
		//Using the .nextInt() method and addition, integers between 1 and 49 will be produced.
		int lottNo1 = ((lottGen.nextInt(49))+1);
		//The first generated number will always be a unique integer as it is the first in the set.
		System.out.println(lottNo1);
		
		int lottNo2 = ((lottGen.nextInt(49))+1);
		//Continues to generate numbers until the 2nd integer produced does not match the first.
		while ((lottNo2 == lottNo1)) 
		{
			lottNo2 = ((lottGen.nextInt(49))+1);
		}
		//Once the while loop completes, the updated value for lottNo2 is printed to the console.
		System.out.println(lottNo2);
		
		int lottNo3 = ((lottGen.nextInt(49))+1);
		//Using the inclusive or operator, this while loop generates integers until neither condition is true.
		while ((lottNo3 == lottNo1) || (lottNo3 == lottNo2))
		{
			lottNo3 = ((lottGen.nextInt(49))+1);
		}
		System.out.println(lottNo3);
		
		int lottNo4 = ((lottGen.nextInt(49))+1);
		while ((lottNo4 == lottNo1) || (lottNo4 == lottNo2) || (lottNo4 == lottNo3))
		{
			lottNo4 = ((lottGen.nextInt(49))+1);
		}
		System.out.println(lottNo4);
		
		int lottNo5 = ((lottGen.nextInt(49))+1);
		while ((lottNo5 == lottNo1) || (lottNo5 == lottNo2) || (lottNo5 == lottNo3) || (lottNo5 == lottNo4));
		{
			lottNo5 = ((lottGen.nextInt(49))+1);
		}
		
		int lottNo6 = ((lottGen.nextInt(49))+1);
		while ((lottNo6 == lottNo1) || (lottNo6 == lottNo2) || (lottNo6 == lottNo3) || (lottNo6 == lottNo4) || (lottNo6 == lottNo5))
		{
			lottNo6 = ((lottGen.nextInt(49))+1);
		}
		System.out.println(lottNo6);
		
		//Finally, a series of pseudo-randomized integers from 1-49 (without repeats) is produced.
		
		JOptionPane.showMessageDialog(null, 
				(("Your winning lottery numbers are [")+(lottNo1)+(", ")+(lottNo2)+(", ")+(lottNo3)+(", ")+(lottNo4)+(", ")+(lottNo5)+(", ")+(lottNo6)+("].")));
	
		//In a panel, the above message is displayed to the user with the list of generated integers.
		
		System.exit(0);
	}

}

