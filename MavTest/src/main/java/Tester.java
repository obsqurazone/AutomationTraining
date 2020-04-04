
public abstract class Tester {
		
	
	/*
	 * 
	 * keyword abstract must be used prefix to class
	 * Abstract class can have abstract and non abstract methods
	 * Hiding 0-100%
	 * 
	 * if all methods are abstract, then 100% data hiding
	 * if all methods are instance, then 0% data hiding
	 * 
	 * Cannot create object, becuase instatination (new) is not allowed
	 * Abstract class do have constructor
	 */
	
	public abstract void writeTestCase(int a);
	public abstract int logDefects();
	
	
	public  String functionality(){
		
		return "my project";
	}
	
}
	

