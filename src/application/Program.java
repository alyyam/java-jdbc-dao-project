package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department  dep = new Department(1, "Books");
		Seller seller = new Seller(21, "Alysson", "alysson-am@gmail.com", new Date(), 2000.00, dep);
		
		System.out.println(seller);
	}

}
