package org.jsp.val;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("userName");
		String p = request.getParameter("password");
		
		if(p.equalsIgnoreCase("root") && u.equalsIgnoreCase("root") ) {
			request.setAttribute("submit","success"); 
			 RequestDispatcher rd = request.getRequestDispatcher("allord.jsp");
			 rd.forward(request, response);
		}
		else {
			request.setAttribute("submit","failed"); 
			RequestDispatcher rd = request.getRequestDispatcher("adminlog.jsp");
			 rd.forward(request, response);
		}
	}
	}

