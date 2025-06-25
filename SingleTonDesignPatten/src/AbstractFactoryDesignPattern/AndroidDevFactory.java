package AbstractFactoryDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{

	@Override
	Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
