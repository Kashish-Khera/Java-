class Bank {

	int get_rate_Of_interest() {
		return 0;
	}

}

class SBI extends Bank {
	int get_rate_Of_interest() {
		return 8;
	}
}

class ICICI extends Bank {
	int get_rate_Of_interest() {
		return 7;
	}
}

class AXIS extends Bank {
	int get_rate_Of_interest() {
		return 9;
	}
}

public class Method_overriding {

	public static void main(String[] args) {

		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();

		System.out.println("SBI Rate of Interest: " + s.get_rate_Of_interest());
		System.out.println("ICICI Rate of Interest: " + i.get_rate_Of_interest());
		System.out.println("AXIS Rate of Interest: " + a.get_rate_Of_interest());

	}

}
