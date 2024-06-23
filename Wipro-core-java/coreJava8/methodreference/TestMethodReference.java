package coreJava8.methodreference;

public class TestMethodReference {

	public TestMethodReference() {
		System.out.println("Hi! Already defined in constructor");
	}
	
	public static float CommonRate() {
		System.out.println("static method");
		return 3.4f;
		
	}
	public static void main(String[] args) {
		

		Bank b1 = TestMethodReference::CommonRate;
		float rate = b1.getInterestedOfAccount();
		System.out.println(rate);
		
		Company c1 = TestMethodReference::new;
		c1.welcome();
	}

}
