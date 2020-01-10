package ConstructorsConcepts;

//Creating our own singleton class
public class SingletonClasses {
	
	//APPROACH-1:
	private static SingletonClasses s = new SingletonClasses();//Only one Singleton class object is created.
	
	//By declaring constructor as private, no one is allowed to create an object outside of class yes
	private SingletonClasses() {
		
	}
	
	//just getting the instance of Singleton class
	public static SingletonClasses  getSingletonClassInstance() {
		return s;
	}
	//As we cannot create instance of singleton class outside of class using new operator, we use factory method
	
	//Approach 2:
	/*
	 * Instead of creating an object at the beginning itself
	 * We create the object upon first request
	 * On consecutive requests, we re-use the existing object created.
	 */

	//PRIVATE CONSTRUCTORS are helpful in creating our own singleton class
}
