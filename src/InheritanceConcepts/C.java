package InheritanceConcepts;

public class C extends B{
	//Its not overriding
	//Overloading
	public void m1(int x)
	{
		System.out.println("child method");
	}
	
	public static void main(String[] args)
	{
		C c = new C();
		c.m1(10);
		c.m1(10);
		c.m1();
		//var-arg methods have least priority when compared to other methods. If no methods match, then only var arg methods are executed
	}
	
}
