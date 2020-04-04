
public class Developer extends Tester{
	
	public void writeTestCase(int age){
		
		System.out.println("Developer must write unit test case");
	}
	
	public void writeTestCase(){
		
		System.out.println("-----------");
	}
	
	public void writeTestCase(String name){
		
		System.out.println(name);
	}
	
	int defect =0;
	public int logDefects(){
		
		return 2;
	}
	
	public  String functionality(){
		
		return "Tis is a developer project";
	}
	
	
	public static void main(String a[]){
		
		Developer ob = new Developer();
		
		// Overloading concept
		ob.writeTestCase();
		
		ob.writeTestCase(39);
		
		ob.writeTestCase("Anoopp");
		
		ob.functionality();
		
	}
	
	
}


