package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
	//Seller seller = DaoFactory.createSellerDao().findById(1);

	SellerDao sellerdao = DaoFactory.createSellerDao();
	
	Seller seller = sellerdao.findById(3);
		
	System.out.println(seller);	
	}
}
