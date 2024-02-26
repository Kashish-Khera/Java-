class bike
{
	void run()
	{
		System.out.println("Run method of Bike class");
	}
}


class splendor extends bike
{
//	parent method override
	
	void run()
	{
		System.out.println("run method of splendor class");
	}
	
}

public class Runtime_polymorphism {

	public static void main(String[] args) {
		
	bike b = new splendor(); //upcasting
		b.run();
	
	}

}
