package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Salary of Android developer");
		return 60000;
	}

	@Override
	public String name() {
		System.out.println("I Am android Developer");
		return "ANDROID DEVELOPER";
	}

}
