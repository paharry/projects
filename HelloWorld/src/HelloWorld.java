/**
 * A class to test the Car class.
 */
public class HelloWorld
{
	/**
	 * Tests the methods of the Car class
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args)
	{
		Car Porche = new Car("black", "Porche"); //
		System.out.println("The car color is " + Porche.getColour());
		System.out.println("Expected: black");
		Car Ferarri = new Car("Red", "Ferarri");
		System.out.println("The Ferarri is " + Ferarri.getColour());
		Porche.setSpeed("100");
		Ferarri.setSpeed("100");
		System.out.println("The Porche maxSpeed is : " + Porche.getSpeed());
		System.out.println("The Porche maxSpeed is : " + Ferarri.getSpeed());
	}
}