class bank1 
{
	float get_interest_rate()
	{
		return 0;
	}
}

class SBI_bank extends bank1
{
	float get_interest_rate()
	{
		return 8.4f;
	}
}

class ICICI_bank extends bank1 
{
	float get_interest_rate()
	{
		return 7.3f;
	}
}

class AXIS_bank extends bank1
{
	float get_interest_rate()
	{
		return 9.5f;
	}
}

public class Runtime_polymorphism_example_two {

	public static void main(String[] args) {
		

		bank1 b ;
		b = new SBI_bank();
		System.out.println("SBI Rate of Interest: "+b.get_interest_rate());
		
		b = new ICICI_bank();
		System.out.println("ICICI Rate of Interest: "+b.get_interest_rate());  

		b = new AXIS_bank();
		System.out.println("AXIS Rate of Interest: "+b.get_interest_rate());  
	
	}

}
