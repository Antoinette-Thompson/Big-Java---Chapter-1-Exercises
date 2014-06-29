package exercises;
import java.util.Random;
import javax.swing.JOptionPane;
public class RandomGen 
{
	public static void main(String[] args)
	{
	String name = JOptionPane.showInputDialog("Hello, what is your name?");
	
	String dieGuess = JOptionPane.showInputDialog((name)+(", please guess a die roll between 1 and 6."));
	System.out.println(dieGuess);
	//Prints the user's input to the console for visual confirmation.
	
	int dieGuessInt = Integer.parseInt(dieGuess);
	//Parses the user's guess into an integer for later comparison.
	
	Random dieSix = new Random();
	int dieRoll = ((dieSix.nextInt(6))+1);
		/*Creates an object of the Random class and then calls the .nextInt 
	 * method to generate a pseudo-random number between 1 and 6. 
	 */
	
	System.out.println(dieRoll);
	
	if(dieRoll != dieGuessInt)
	/* If the user's guess does not match the generated integer,
	 * the panel is displayed with the below message.
	 */
	{
		JOptionPane.showMessageDialog(null, (("I'm sorry, ")+(name)+(". You have guessed incorrectly.")));
		System.exit(0);
	}
	/* If the user's guess matches the generated integer,
	 * the panel is displayed with the below message.
	 */
	JOptionPane.showMessageDialog(null, (("Congratulations, ")+(name)+("! You win!")));
	System.exit(0);
		
	}
}
