package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller s = new Seller(1, "jos�", "jose@gmail.com", new Date(), 1000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println(s);
	}

}
