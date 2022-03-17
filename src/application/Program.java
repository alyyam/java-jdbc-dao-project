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

		System.out.println("=== TEST 1: Seller findById===");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment===");
		
		Department department = new Department(2, null);
		
		List<Seller>list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller findAll===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Insert Seller===");
		Seller newSeller = new Seller(null, "Greg", "greag@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId()); 
		
		
		System.out.println("\n=== TEST 5: Update Seller===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.udpate(seller);
		System.out.println("update completed");
		
		
		System.out.println("\n=== TEST 6: Delete Seller===");
		System.out.println("Enter an ID number");
		int id = sc.nextInt();
		seller =  sellerDao.findById(id);
		System.out.println("Delete completed");
		
		
		
		sc.close();
	}
	
	
	
	

}
