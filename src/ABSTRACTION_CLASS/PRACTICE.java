package ABSTRACTION_CLASS;

abstract class abc
{
	abstract void m1();
	public void m2()
	{
		System.out.println(" lets do it.");
	}
}

public class PRACTICE extends abc{
	void m1()
	{
		System.out.println("yes .. i am overriden method body.");
	}

	public static void main(String[] args) {
		abc p=new PRACTICE();
		p.m1();
		p.m2();

	}

}
