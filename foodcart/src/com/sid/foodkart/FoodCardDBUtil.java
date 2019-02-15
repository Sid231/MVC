package com.sid.foodkart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCardDBUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException{
		
		List<Food> foodList = new ArrayList<Food>();
		
		String url = "jdbc:mysql://localhost:3306/Food?useSSL=false";
		String username = "root";
		String password = "********";
		
		//load mysql server
		Class.forName("com.mysql.jdbc.Driver");
		
		//get the connection
		Connection conn = DriverManager.getConnection(url,username,password);
		
		//create a statement
		Statement stmt = conn.createStatement();
		
		//execute query
		ResultSet rs = stmt.executeQuery("Select * from foodcart");
		
		while(rs.next()){
			int id = rs.getInt(1);
			String item = rs.getString(2);
			int price = rs.getInt(3);
			
			Food food = new Food(id,item,price);
			foodList.add(food);
		}
		
		return foodList;
	}
}
