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

import org.careerX2.O.dto.CostomerDTO;

public class OerderPlaceGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public OerderPlaceGet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerid = request.getParameter("cutomer_id");
		int id1 = Integer.parseInt(customerid);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Careerx2.0");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		CostomerDTO customerdto = entityManager.find(CostomerDTO.class, id1 );
		
		String cusName = customerdto.getCustomerName();
		int id = customerdto.getId();
		String comName = customerdto.getCompanyName();
		String conEmail = customerdto.getContactemail();
		String conNum = customerdto.getContactno();
		String badd = customerdto.getBaddress();
		String sadd = customerdto.getSaddress();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("cusName", cusName);
		session.setAttribute("comName", comName);
		session.setAttribute("conEmail", conEmail);
		session.setAttribute("conNum", conNum);
		session.setAttribute("badd", badd);
		session.setAttribute("sadd", sadd);
		session.setAttribute("cuid", id);
		
		RequestDispatcher rd = request.getRequestDispatcher("orderplace.jsp");
		 rd.forward(request, response);
	}



}
