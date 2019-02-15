package com.sid.foodkart;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodCart
 */
@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the data from the database
		List<Food> foodItems;
		try {
			foodItems = FoodCardDBUtil.getFoodList();
			request.setAttribute("fooditems", foodItems);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//redirect to a different page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}
}
