package org.jsp.val;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.careerX2.O.dao.AllDao;
import org.careerX2.O.dto.SelesReDetails;



public class SelsRepLoginVal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SelsRepLoginVal() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String u = request.getParameter("conNum");
		String p = request.getParameter("pass");
		
		AllDao dao = new AllDao();
		SelesReDetails selesReDetails = dao.findById(u);
		
		String name = selesReDetails.getFirstName() + " "+ selesReDetails.getLastName();
		if (p.equals(selesReDetails.getPassword()) && u.equals(selesReDetails.getContact())) {
			session.setAttribute("name", name );
			RequestDispatcher rd = request.getRequestDispatcher("SalesRepHomePa.jsp");
			rd.forward(request, response);
	}
		else {
			request.setAttribute("submit","failed"); 
			RequestDispatcher rd = request.getRequestDispatcher("salesRepLogin.jsp");
			rd.forward(request, response);
		}
	}
}
