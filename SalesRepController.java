package org.careerX2.O.cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.careerX2.O.dao.AllDao;
import org.careerX2.O.dto.SelesReDetails;

public class SalesRepController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SalesRepController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String address = request.getParameter("addres");
			String comname = request.getParameter("comname");
			String contact = request.getParameter("contactno");
			String email = request.getParameter("email");
			String fn = request.getParameter("fname");
			String ln = request.getParameter("lname");
			String pass = request.getParameter("pass");
			String state = request.getParameter("state");
			String zip = request.getParameter("zip");
			
			
			SelesReDetails selesReDetails = new SelesReDetails();
			
			selesReDetails.setAddress(address);
			selesReDetails.setCompanyName(comname);
			selesReDetails.setContact(contact);
			selesReDetails.setEmail(email);
			selesReDetails.setFirstName(fn);
			selesReDetails.setLastName(ln);
			selesReDetails.setPassword(pass);
			selesReDetails.setState(state);
			selesReDetails.setZip(zip);
			
			AllDao allDao = new AllDao();
			allDao.save(selesReDetails);
			
			
			request.setAttribute("status","success"); 
       	    RequestDispatcher rd = request.getRequestDispatcher("salesRepLogin.jsp");
        	rd.include(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
