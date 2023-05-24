package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller s = new Seller(1, "josé", "jose@gmail.com", new Date(), 1000.0, obj);

		System.out.println(s);
	}

}
