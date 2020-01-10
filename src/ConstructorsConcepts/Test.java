package ConstructorsConcepts;

public class Test {
	//It is legal to declare a method name same as that of the class name
	
	//Here compiler will not generate default constructor as we are providing/defining the constructor.
	//Compiler generates default constructor only if we are not providing any constructor in class. 
	
	//Overloaded constructors:
	Test(){
		this(10);
		System.out.println("no-args constructor");
		//super(); --constructor calls can be made only within a constructor and only as first statement of constructor
		//this();
	}
	Test(int i)
	{
		this(12.350);
		System.out.println("int arg constructor");
	}
	Test(double d)
	{
		System.out.println("double-arg constructor");
	}
	
	void Test() {
		System.out.println("method but not constructor");
	
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.Test();
		//System.out.println(super.hashCode());--cannot use super, this keywords in static context
		Test t1 = new Test(10);
		Test t2 = new Test(10L);//actually there is no constructor that takes long as argument. 
		//In overloading, automatic promotion happens
		
		SingletonClasses s1 = SingletonClasses.getSingletonClassInstance();
		SingletonClasses s2 = SingletonClasses.getSingletonClassInstance();
		
	}

}
