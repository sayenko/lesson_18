package ua.lviv.lgs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Create an instance of the Employee class");
		File file = new File("Employee.txt");
		Methods methods = new Methods();
		
		Employee employee = new Employee("Tetyana", 13, 45550.80);
		System.out.println("Serialize: " + employee);
		methods.serialize(file, employee);
		
		Employee employee2 = (Employee) methods.deserealize(file);
		System.out.println("Deserealize: " + employee2);		
		
		file.delete();
		System.out.println();
		
		System.out.println("Create a collection of Employee objects");
		List <Employee> list = new ArrayList<>();
		list.add(new Employee ("Tetyana", 13, 45550.80));
		list.add(new Employee ("Mariya", 18, 16000.80));
		list.add(new Employee ("Ivan", 5, 37000.50));
		list.add(new Employee ("Yuriy", 2, 18700.90));
		list.add(new Employee ("Yan", 10, 40000.00));
		
		System.out.println("Serialize: " + list);
		methods.serialize(file, list);
		
		List <Employee> list2 = (List <Employee>) methods.deserealize(file);
		System.out.println("Deserealize: " + list2);
	}

}
