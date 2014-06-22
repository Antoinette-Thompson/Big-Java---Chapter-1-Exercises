package exercises;
import java.io.PrintStream;
public class variablePractice 
{
	public static void main(String[] args)
	{
	
	/* typeName variableName = value;
	 * or
	 * typeName variableName;
	 * 			Defines a new variable of a type and optionally supplies an initial value. */
	
	//Sets greeting to represent the string "Hello, World!"
	String greeting = "Hello, World!";
	//Sets printer to represent the PrintStream System.out
	PrintStream printer = System.out;
	//Sets luckyNumber to represent the integer 13
	int luckyNumber = 13;
	
	//Same as System.out.println("Hello, World!")
	printer.println(greeting);
	//Same as System.out.println(13)
	printer.println(luckyNumber);
	
	String selfName = "Antoinette";
	//Define and call a variable that holds your name using camel case.
	printer.println(selfName);
	
	/* variableName = value;
	 * Assigns a new value to a previously defined variable. */
	
	luckyNumber = 21;
	printer.println(luckyNumber);
	//This will print the newly assigned luckyNumber value.
	
	greeting = "Hello, Nina!";
	printer.println(greeting);
	//Assigned a new value to greeting and then prints the string.
	
	greeting = " Hello, World! ";
	int n = greeting.length();
	printer.println(n);
	//Set n to the number of characters in the string object and then printed this value.
	
	String state = "North Carolina";
	String bigState = state.toUpperCase();
	printer.println(bigState);
	n = bigState.length();
	printer.println(n);
	/* The variable state was defined as the string "North Carolina.
	 * bigState was then defined as state with its lower case characters switched to uppercase.
	 * bigState is then printed to the console.
	 * n is reassigned to the length of the String bigState.
	 * Finally, n's new value is printed to the console. */
	
	String lowerState = state.replace("Nor", "Sou");
	/* The replace method is defined as 
	 * public String replace(String target, String replacement)
	 */
	printer.println(lowerState);
	
	String unrealState = state.replace("o", "q");
	printer.println(unrealState);
	
	String newGreeting = greeting.replace("World", "Dave");
	printer.println(newGreeting);
	
	
	}
}
