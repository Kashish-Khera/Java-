
public class Accessor_Mutator {
	
	private int roll; 
	private String name;
	
	
//	Accessor method 
	public int getRollno()
	{
		return roll;
	}

	
//	Mutatror method	
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	
//	Accessor 
	public String getName()   
	{  
	return name;  
	}  
	
//	Mutator
	public void setName(String name)   
	{  
	this.name = name;  
	} 
	
	
	public void display()  
	{  
	System.out.println("Roll no.: "+ roll);  
	System.out.println("Student name: "+name);  
	}  
	
	
	public static void main(String[] args) {
			
		Accessor_Mutator obj = new Accessor_Mutator(); 
		
System.out.println("----Set method used----\n");
		obj.setRoll(100);
		obj.setName("Madison"); 
		obj.display();
		
		int rollno = obj.getRollno();
		String name = obj.getName(); 
		
		System.out.println("\n----Get method used----\n");
		System.out.println("Roll no.: "+ rollno);  
		System.out.println("Student name: "+name);
		
	}

}
