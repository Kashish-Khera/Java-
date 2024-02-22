
public class Instance_Method {
	
	
	int s ; 
	
	public int add(int a, int b)
	{
		s = a+b ; 
		return s; 
	}
	
	
	public static void main(String[] args) {
		
		//Creating an object of the class  
		Instance_Method obj = new Instance_Method();
		
		//invoking instance method   
		int sum = obj.add(1, 2);
		
		System.out.println("SUM is "  + sum);
	}

}
