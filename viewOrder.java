package org.careerX2.O.cont;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.careerX2.O.dto.Ordetails;


public class viewOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public viewOrder() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contactnoView = request.getParameter("cutomernum");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Careerx2.0");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Ordetails ordetails = entityManager.find(Ordetails.class, contactnoView );
		
		String CusName = ordetails.getCusNmae();
		String CusNUm = ordetails.getConnu();
		String badd = ordetails.getBaddress();
		String Cupname = ordetails.getCopname();
		String email = ordetails.getEmail();
		String proname = ordetails.getProductN();
		String quantity = ordetails.getQuantity();
		String Sadd = ordetails.getSaddress();
		String size = ordetails.getSize();
		
		HttpSession session = request.getSession();
		session.setAttribute("size", size);
		session.setAttribute("quantity", quantity);
		session.setAttribute("proname", proname);
		session.setAttribute("CusName",CusName);
		session.setAttribute("CusNUm", CusNUm);
		session.setAttribute("Cupname", Cupname);
		session.setAttribute("Sadd", Sadd);
		session.setAttribute("badd", badd);
		session.setAttribute("email", email);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		 rd.forward(request, response);
		
	}

}
