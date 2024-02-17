package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: findById ===");
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll ===");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== Test 3: Insert ===");
		Department obj = new Department(null,"Music");
		depDao.insert(obj);
		System.out.println("Inserted! new id: " + obj.getId());
		
		System.out.println("\n=== Test 4: Update ===");
		Department depUp = depDao.findById(1);
		depUp.setName("Food");
		depDao.update(depUp);
		System.out.println("Update completed");
		
		System.out.println("\n=== Test 5: Delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteByid(id);
		System.out.println("Delete completed");
		
		sc.close();
	}
}
