package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {
	@Override
	public int salary() {
		System.out.println("Salary of Web Developer");
		return 60000;
	}

	@Override
	public String name() {
		System.out.println("I Am Web Developer");
		return "WEB DEVELOPER";
	}

}
