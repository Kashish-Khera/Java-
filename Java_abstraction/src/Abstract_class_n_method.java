abstract class bike
{
	abstract void run();
}

class Honda extends bike
{
	void run()
	{
		System.out.println("Run method from the honda class");
	}
}


public class Abstract_class_n_method {
		
	public static void main(String args[])
	{
		bike obj = new Honda();
		obj.run();
		
	}
	
}
