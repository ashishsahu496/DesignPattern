package FactoryDesignPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("getting salary of Web developer");
		return 60000;
	}

}
