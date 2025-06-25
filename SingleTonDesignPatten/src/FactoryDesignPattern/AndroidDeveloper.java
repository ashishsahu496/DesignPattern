package FactoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("getting salary of android developer");
		return 50000;
	}
	

}
