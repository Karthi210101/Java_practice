package Advjava_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Product_project1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//InsertStatement();
		SelectStatement();
		//UpdateStatement();
		//DeleteStatement();
		
	}
	
	public static void InsertStatement() {
		
		System.out.println("Enter the Product i'd : ");
		String pid = sc.nextLine ();
		System.out.println("Enter the name of the product : ");
		String name = sc.nextLine();
		System.out.println("Enter the brand name: ");
		String brand = sc.nextLine ();
		System.out.println("Enter the Price of the product : ");
		double price = sc.nextDouble();
		System.out.println("Enter the Quantity of the product : ");
		int quantity = sc.nextInt();
		System.out.println("Enter the Rating for the product : ");
		double rating = sc.nextDouble();
		System.out.println("Enter the Color of the product : ");
		String color =sc.next() ;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
			PreparedStatement ps = c.prepareStatement("insert into product values (?,?,?,?,?,?,?)");
			ps.setString(1, pid);
			ps.setString(2, name);
			ps.setString(3, brand);
			ps.setDouble(4, price);
			ps.setInt(5, quantity );
			ps.setDouble(6, rating);
			ps.setString(7, color);
			int row = ps.executeUpdate();
			System.out.println(row+" rows affected.");
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void SelectStatement() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from product;");
			while(rs.next()) {
				System.out.println("pId "+rs.getInt(1));
				System.out.println("Name "+rs.getString(2));
				System.out.println("Brand "+rs.getString(3));
				System.out.println("Price "+rs.getDouble(4));
				System.out.println("Quantity "+rs.getInt(5));
				System.out.println("Rating "+rs.getDouble(6));
				System.out.println("Color "+rs.getString(7));
				System.out.println("-----------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void UpdateStatement() {
		try {
			System.out.println("Enter the price value to update : ");
			double price = sc.nextDouble();
			System.out.println("Enter the Primary key(Product name) : ");
			String name = sc.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
			PreparedStatement ps = c.prepareStatement("Update product set price = ? where name = ? ");
			ps.setDouble(1, price);
			ps.setString(2, name);
			int row = ps.executeUpdate();
			System.out.println(row+" rows affected successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void DeleteStatement() {
		try {
			System.out.println("Enter the row name to delete : ");
			String name = sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
			PreparedStatement ps = c.prepareStatement("delete from product where name = ? ");
			ps.setString(1, name);
			int row = ps.executeUpdate();
			System.out.println(row+" rows affected successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
