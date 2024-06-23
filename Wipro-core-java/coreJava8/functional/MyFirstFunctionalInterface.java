package coreJava8.functional;

public interface MyFirstFunctionalInterface {
	
	public void firstWork();
	//public void firstWork1();
	
	default void show() {
		System.out.println("Do it Now");
	}
	
	default void show1() {
		System.out.println("Do it Now");
	}

}
