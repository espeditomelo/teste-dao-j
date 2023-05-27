package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println("\n---- Teste 1 : seller finById ----");				
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
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
		
		/*
		System.out.println("\n---- Teste 4 : seller insert ----");		
		Seller s = new Seller(null, "Antonia", "antonia@gmail.com", new Date(), 4000.0, d);
		sellerDao.insert(s);
		System.out.println("Inserted! New seller id = " + s.getId());

		System.out.println("\n---- Teste 5 : seller update ----");
		Seller newSeller = sellerDao.findById(9);
		// newSeller.setName("Antonia Silva");
		newSeller.setBaseSalary(newSeller.getBaseSalary() + 500.0);
		sellerDao.update(newSeller);
		System.out.println("Update completed!");*/
		
		System.out.println("\n---- Teste 6 : seller delete ----");		
		System.out.println("Enter a seller Id for test delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
