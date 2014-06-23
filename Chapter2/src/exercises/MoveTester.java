package exercises;

import java.awt.Rectangle;
//The System and String classes are in the java.lang package and are automatically imported.
 
/*	import packageName.ClassName;
 * This is used to import a class from a package for use in a program.
 */
public class MoveTester 
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		//Move the Rectangle
		box.translate(15, 25);
		
		//Print the information about the moved rectangle.
		System.out.println("After moving, the top left corner is:");
		System.out.println(box.getX());
		System.out.println(box.getY());
	
		/** Rectangle eye = new Rectangle(35, 35, 10, 10);
		Rectangle mouth = new Rectangle(35, 15, 45, 10);
		System.out.print(eye);
		eye.translate(35, 0);
		System.out.println(eye);
		System.out.print(mouth);
		**/
		/* This was an attempt to create a face using rectangles.
		 * This is incorrect because the variables do not contain the object.
		 * These are references to their memory location!
		 */
		
		/*Understanding the difference between how objects are referenced
		 * and how variables store information.
		 */
		String greeting = "Hello!";
		System.out.println(greeting);
		String greeting2 = greeting;
		greeting2 = "Hello, Antoinette!";
		System.out.println(greeting2);
		System.out.println(greeting);
		greeting2 = greeting;
		greeting2.toUpperCase();
		System.out.println(greeting2);
		System.out.println(greeting);
		
	/* Give Java code to construct the following objects:
	 * a. Rectangle with center (100,100) and all side lengths equal to 50.
	 * b. String "Hello, Dave!"
	 */
		
		Rectangle question = new Rectangle(75, 75, 50, 50);
		Rectangle questionA = question;
		
		String questions = new String("Hello, Dave!");
		String questionsB = questions;
		//An object is the particular instance, while an object variable creates a reference.
		
	}
	

}
