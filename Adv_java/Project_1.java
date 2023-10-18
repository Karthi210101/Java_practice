package Advjava_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product_project {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","root");
		Statement s = c.createStatement();
//		s.executeUpdate("insert into product values (1,'mobile','MI',12000,1,5,'Black')");
//		s.executeUpdate("insert into product values (2,'TV','Samsung',30000,1,4,'White')");
//		s.executeUpdate("insert into product values (3,'Washing Machine','Whirlpool',25000,3,4.5,'Blue')");
//		System.out.println("Inserted Successfully");
		s.executeUpdate("update product set price = 30000, rating = 4 where name = 'Washing Machine' ");
		System.out.println("Altered successfully");
		s.executeUpdate("delete from product where name = 'TV'");
		System.out.println("Deleted Successfully");
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	

}
}
