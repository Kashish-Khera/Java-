class calculation
{
	void fact(int n)
	{
		int fact = 1; 
		for(int i = 0; i<n ; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " + n + " is "  + fact);
	}
	
}
public class Anonymous_Object {

	public static void main(String[] args) {
	
		new calculation().fact(5);

	}

}
