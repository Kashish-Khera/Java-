class A
{
	private int data = 40 ; 
	private void msg()
	{
		System.out.println("msg method from class A");
	}
}


public class Private_modifier {
	
	public static void main(String args[])
	{
		A obj = new A(); 
		System.out.println(obj.data);
		obj.msg();
	}

}
