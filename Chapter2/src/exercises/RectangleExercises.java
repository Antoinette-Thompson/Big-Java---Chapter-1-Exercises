package exercises;

import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class RectangleExercises 
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
				
		JOptionPane.showMessageDialog(null,("Hello, ")+(name)+(". Let's find the area and perimeter of a rectangle."));
		//Creates a dialog pane that displays the user's prior input and a defined string.
		
		String widthStr = JOptionPane.showInputDialog("What is the integer width of your rectangle?");
		String heightStr = JOptionPane.showInputDialog("What is the integer height of your rectangle?");
		//User's input is stored as a string to the variables widthStr and heightStr
		
		int widthInt = Integer.parseInt(widthStr);
		int heightInt = Integer.parseInt(heightStr);
		//The variables are then parsed into integer format to be used in the construction of the Rectangle.		
		
		Rectangle box = new Rectangle(0, 0, widthInt , heightInt);
		//Here, the rectangle object is being constructed using the parsed variables.
		double width = box.getWidth();
		double height = box.getHeight();
		
		System.out.println("The area of the rectangle is "+(width*height)+".");
		System.out.println("The perimeter of the rectangle "+(width*2+height*2)+".");
		
		/* Constructs a Rectangle object and then computes and 
		 * prints its area and perimeter using getWidth and getHeight methods.
		 */
		
		JOptionPane.showMessageDialog(null,(name)+(", your rectangle has an area of ")+(width*height)+("."));
		JOptionPane.showMessageDialog(null,(name)+(", your rectangle has a perimeter of ")+(width*2+height*2)+("."));
		JOptionPane.showMessageDialog(null,("Have a good day, ")+(name)+("."));
		
		System.exit(0);
	}
}
