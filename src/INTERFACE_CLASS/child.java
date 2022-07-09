//Interface class=100% abstraction achieved// multiple inheritance is must here for implementation
package INTERFACE_CLASS;

interface secular//parent 1
{
	public static final int a=100;//field
	void m();//abstract method
	default void m1()//concrete method
	{
			System.out.println("India is secular country.");
	}
	
}
interface democratic//parent 2
{
	default void m2()//concrete method
	{
		System.out.println("India is democratic country.");
	}	
}

public class child implements secular,democratic//child
{	
	public void m()
	{
		System.out.println("i am abstract from all");
	}
	public static void main(String[] args) 
	{
		// By using object of child class
		System.out.println("By using object of child class=");
		child INDIA=new child();
		INDIA.m1();
		INDIA.m2();	
		INDIA.m();
		System.out.println();

		//By creating reference of the interface 
		//interface secular
		System.out.println("By creating reference of the interface ");
		secular india=new child();
		india.m1();
		//india.m2();// can't because only reference of secular interface
		
		democratic India=new child();
		//India.m1();// can't because only reference of democratic interface
		India.m2();
		

	}

}

//can get 100% abstraction only
//100% abstraction only through  the multiple inheritance*************
//here one child class implements the 2 interfaces...***************
//only include abstract method+++++ also concrete from jdk version 8,9==by default as a access modifier
//use interface and implement keyword ..no need of abstract keyword
//methods== public abstract(by default)
//fields/variables== public static final(by default)
//we need to override all the abstract  methods..
//by using interface we can perform multiple inheritance..otherwise without it,it is not possible i java.
//