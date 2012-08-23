/**
 * Paul Harrison A00191332
 * 
 * Objects and classes lab2
 */

public class Car
{
	String name;
	String colour;
	String speed;

	/**
	 * car constructor as called by car_test class colour and name stings are
	 * passed
	 * 
	 * @param colour
	 * @param name
	 */
	public Car(String colour, String name)
	{
		setName(name);
		setColour(colour);

	}

	// car speed setters and getters - sting passed and therefore of type string
	public String getSpeed()
	{
		return speed;
	}

	public void setSpeed(String speed)
	{
		this.speed = speed;
	}

	// car name setters and getters - sting passed and therefore of type string

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// car colour setters and getters - sting passed and therefore of type
	// string

	public String getColour()
	{
		return colour;
	}

	public void setColour(String colour)
	{
		this.colour = colour;
	}

}