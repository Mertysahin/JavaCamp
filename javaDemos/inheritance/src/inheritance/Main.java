package inheritance;

public class Main {

	public static void main(String[] args)
	{
		Customer customer = new Customer();
		customer.email = "asd";
		Employee employee = new Employee();
		employee.salary = 1555;

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		employeeManager.Add();
		employeeManager.BestEmployee();
	}

}
