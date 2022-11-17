package org.careerX2.O.cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.careerX2.O.dao.AllDao;
import org.careerX2.O.dto.Ordetails;


public class OrderCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrderCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String name = request.getParameter("customername");
			String companyName = request.getParameter("companyName");
			String email = request.getParameter("email");
			String Contactno = request.getParameter("Contactno");
			String Baddress = request.getParameter("Baddress");
			String saddress = request.getParameter("saddress");
			String product = request.getParameter("product");
			String size = request.getParameter("size");
			String Quantity = request.getParameter("Quantity");

			Ordetails de = new Ordetails();

			de.setBaddress(Baddress);
			de.setConnu(Contactno);
			de.setCopname(companyName);
			de.setCusNmae(name);
			de.setEmail(email);
			de.setProductN(product);
			de.setQuantity(Quantity);
			de.setSaddress(saddress);
			de.setSize(size);

			AllDao allDao = new AllDao();
			allDao.saveor(de);

			RequestDispatcher rd = request.getRequestDispatcher("creatNewCus.jsp");
			rd.include(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
