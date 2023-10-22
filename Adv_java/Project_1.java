package Advjava_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product_project {
public static void main(String[] args) {
//	CreateStatement();
	SelectStatement();
//	UpdateStatement();
//DeleteStatement();
	
}
public static void CreateStatement(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into product values (1,'mobile','MI',12000,1,5,'Black')");
		s.executeUpdate("insert into product values (2,'TV','Samsung',30000,1,4,'White')");
		s.executeUpdate("insert into product values (3,'Washing Machine','Whirlpool',25000,3,4.5,'Blue')");
		System.out.println("Inserted Successfully");
		
	} catch (ClassNotFoundException | SQLException e) {
		
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
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
		Statement s = c.createStatement();;
		int row = s.executeUpdate("update product set price = 30000, rating = 4 where name = 'Washing Machine' ");
		System.out.println(row+"rows Altered successfully");
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
}
public static void DeleteStatement() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
		Statement s = c.createStatement();

		int row = s.executeUpdate("delete from product where name = 'TV'");
		System.out.println(row+" rows Deleted Successfully");
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
}

}

