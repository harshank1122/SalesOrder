package org.careerX2.O.cont;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.careerX2.O.dto.CostomerDTO;


public class delectcus extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public delectcus() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contactno = request.getParameter("student_contactNo");
		int id = Integer.parseInt(contactno);
		System.out.println(contactno);
   
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Careerx2.0");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		CostomerDTO studentDetails = entityManager.find(CostomerDTO.class, id );
		if (studentDetails != null) {
			entityManager.remove(studentDetails);
			entityTransaction.commit();
			response.sendRedirect("mycus.jsp");
		} 
		
	}



}
