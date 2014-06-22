package myPackage;

import javax.swing.JOptionPane;

public class DialogTester 
{
	public static void main(String[] args)
	{
		//Creates Dialog box where a user-input is required.
		//The variable "name" was defined and it is a string.
		String name = JOptionPane.showInputDialog("What is your name?");
		//Prints to the console the user's input.
		System.out.println(name);
		//Creates a Dialog box displaying the message "Hello, [user's previous input]!"
		JOptionPane.showMessageDialog(null,("Hello, "+(name)+"!"));
		
		JOptionPane.showInputDialog("What would you like me to do?");
		//Ignores new user input and customizes the message with the initial user input.
		JOptionPane.showMessageDialog(null, ("I'm sorry, ")+(name)+(". I'm afraid I can't do that."));
		
		
		System.exit(0);
			}

}
