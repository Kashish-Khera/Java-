abstract class bank {
	abstract int rate_of_interest();
}

class SBI extends bank {
	@Override
	int rate_of_interest() {
		return 7;
	}
}

class PNB extends bank {
	@Override
	int rate_of_interest() {
		return 9;
	}
}

public class abstract_class_example_two {

	public static void main(String[] args) {

		bank b;

		b = new SBI();
		System.out.println("Rate of interest at SBI : " + b.rate_of_interest());

		b = new PNB();
		System.out.println("Rate of interest at PNB : " + b.rate_of_interest());

	}

}
