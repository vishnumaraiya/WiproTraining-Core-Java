package Array;

import com.emp.Employee;

public class Main {

	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		e[0] = new Employee(1,"john",2345);
		e[1] = new Employee(2,"alice",87482);
		e[2] = new Employee(3,"alex",7482);

		// traverse the array and print the employee details
		System.out.println("Employee Details ");

		for(Employee emp : e) {
			System.out.println("ID: "+emp.getId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("ID: "+emp.getSalary());
		}
		
	}

}
