package ConstructorsConcepts;

import java.io.IOException;

public class Child extends Parent {
	
	protected Child(int i) throws IOException{//compiler checks whether programmer has written either super() or this() in the 1st statement. If not then it 
		//provides
		super();
		System.out.println("child-arg constructor");
	}

	public static void main(String[] args)
	{
		try {
			Child c = new Child(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// parent- class constructors by default are not available to child class
	}
}
