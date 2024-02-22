
abstract class Demo
{
	//abstract method declaration  
	abstract void display();
}


public class Abstract_Method  extends Demo {
	
	//method impelmentation  
		@Override
		void display() {
			
			System.out.println("This is an Abstract method");
		}

	public static void main(String[] args) {

		//creating object of abstract class  
		Demo obj = new Abstract_Method();
		
		//invoking abstract method  
		obj.display();
	}

	

}
