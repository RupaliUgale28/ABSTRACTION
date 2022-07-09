 //Abstraction class=0 to 100%=
package ABSTRACTION_CLASS;

abstract class backend
{
	public void m()
	{
		System.out.println("I am concrete method from backend abstract class");
	}
	
	abstract void state();//abstract method
}

class ahmednagar extends backend
{
	void state()
	{
		System.out.println("Ahmednagar is in Maharashtra");
	}
}

class jaipur extends backend
{
	void state()
	{
		System.out.println("Jaipir is in Rajastan");
	}
}

class ayodhya extends backend
{
	void state()
	{
		System.out.println("Ayodhya is in UP");
	}
}

public class display
{
	
	// void states()
	{
		System.out.println("I am here to display which city is from the which states=");
	}

	public static void main(String[] args) 
	{		
		//creating separate object for each class
		//we can create reference of the abstract class also

		
		//Aahmednagar class
		ahmednagar AHMEDNAGAR=new ahmednagar();//object= ahmednagar class
		AHMEDNAGAR.state();//abstract method
		AHMEDNAGAR.m();//concrete method--we can 
		System.out.println();
		
		//jaipur class
		jaipur JAIPUR=new jaipur();//jaipur=class name///JAIPUR= object name
		JAIPUR.state();
		JAIPUR.m();
		System.out.println();
		
		//ayodhya class
		ayodhya AYODHYA=new ayodhya();
		AYODHYA.state();
		AYODHYA.m();
		
	}

}
//here we use the concept of hierarchial inheritance
//we can call concrete method every time when we extends the abstract class and create the object of child class
//we need to override all the abstract method.
//