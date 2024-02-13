package application;

import model.dao.impl.SellerDaoJDBC;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
	Seller seller = DaoFactory.createSellerDao().findById(1);
		
		
	System.out.println(seller);

		
	}
}
