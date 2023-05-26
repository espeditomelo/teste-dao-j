package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println("\n---- Teste 1 : seller finById ----");				
		Seller s1 = sellerDao.findById(3);
		System.out.println(s1);
		
		System.out.println("\n---- Teste 2 : seller finByDepartment ----");
		Department d = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(d);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n---- Teste 3 : seller findAll ----");		
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
	}

}
