package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		//Seller seller = DaoFactory.createSellerDao().findById(1);
	
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("== TEST 1 : seller findByid");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);	
		
		System.out.println("\n== TEST 2: seller findByDepartment");
		Department dep = new Department(2,null);
		List<Seller> list = sellerdao.findByDeparment(dep);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n== TEST 3: seller findByAll");
		list = sellerdao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}
}
