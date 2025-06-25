package FactoryDesignPattern;

public class Client {

	public static void main(String[] args) {
		
	Employee e1=EmployeeFactory.getEmployee("Android Developer");
	System.out.println(e1.salary());
	
	Employee e2=EmployeeFactory.getEmployee("Web Developer");
	System.out.println(e2.salary());
		

	}

}
