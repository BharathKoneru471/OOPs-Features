package ConstructorsConcepts;

public class Student {
	static int count=0;
	//Not recommended approaches
	String name;
	int age;
	
	//Role of Constructor:- to perform initialization of an object
	/*Advantages:-
	 * 1.we can maintain different values for each object
	 * 2.length of code is reduced
	 */
	
	//CONSTRUCTOR
	public Student(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	//INSTANCE BLOCK : Other than initialization, if we want to perform an activity for every object creation, then we go for Instance block
	{
		System.out.println("on each object creation, instance block will be executed automatically");
		count++;
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Bharath",24);//object creation
		//At the time of object creation, it is mandatory to initialize an object else it would be meaningless
		//Since JVM initializes each object created with the default values
		Student s2 = new Student("Bhavana",26);//A copy of instance stuff is given to each object
		
		System.out.println("total noof objects created are: "+count);
	}
	

}
