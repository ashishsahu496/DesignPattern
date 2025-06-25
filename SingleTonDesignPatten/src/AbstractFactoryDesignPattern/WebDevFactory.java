package AbstractFactoryDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	Employee createEmployee() {
		return new WebDeveloper(); }
}
