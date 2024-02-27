interface printable
{
	void print();
}

class A implements printable
{

	@Override
	public void print() {

		System.out.println("print method from class A");
	}
	
}

public class Interface_example_one {

	public static void main(String[] args) {

		A obj = new A();
		obj.print();
	}

}
