package ConstructorsConcepts;

public class RecursiveConstructorCall {
	
	RecursiveConstructorCall(){
		//this(10);
	}
	RecursiveConstructorCall(int i){
		//this();
	}
	RecursiveConstructorCall(double d){
		System.out.println("double-arg");;
	}

	public static void main(String[] args) {
		RecursiveConstructorCall r = new RecursiveConstructorCall(12);
		
		System.out.println("Hello all");
	}

}
