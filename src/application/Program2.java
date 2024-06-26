package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: seller findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
			
		System.out.println("\n=== TESTE 2: seller findAll =====");
		List<Department> list = departmentDao.findAll();		
		for(Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TESTE 3: insert =====");
		Department newDepartment = new Department(7, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TESTE 4: department update =====");
		Department dep2 = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed.");
		
		System.out.println("\n=== TESTE 5: seller delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed.");
		
		sc.close();

	}

}
