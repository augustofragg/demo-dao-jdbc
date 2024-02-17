package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		//Seller seller = DaoFactory.createSellerDao().findById(1);
	
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("==== TEST 1 : seller findByid ====");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);	
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department department = new Department(2,null);
		List<Seller> list = sellerdao.findByDeparment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3: seller findByAll ====");
		list = sellerdao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.00,department);
		sellerdao.insert(newSeller);
		System.out.println("Insert! new id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ====");
		seller = sellerdao.findById(1);
		seller.setName("Martha Wayne");
		sellerdao.update(seller);
		
		System.out.println("Update complete");
		
	}
}
