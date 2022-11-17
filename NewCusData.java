package org.careerX2.O.cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.careerX2.O.dao.AllDao;
import org.careerX2.O.dto.CostomerDTO;



public class NewCusData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public NewCusData() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
	    String name =  request.getParameter("customername");
	    String companyName =  request.getParameter("companyName");
	    String email =  request.getParameter("email");
	    String Baddress =  request.getParameter("Baddress");
	    String bcountry =  request.getParameter("bcountry");
	    String bstate =  request.getParameter("bstate");
	    String bcity =  request.getParameter("bcity");
	    String bzip =  request.getParameter("bzip");
	    String Contactno =  request.getParameter("Contactno");
	    String sadd =  request.getParameter("sadd");
	    String scountry =  request.getParameter("scountry");
	    String sstate =  request.getParameter("sstate");
	    String scity =  request.getParameter("scity");
	    String szip =  request.getParameter("szip");
	    
	    CostomerDTO customerdto = new CostomerDTO();
	    
	    customerdto.setCompanyName(companyName);
	    customerdto.setContactemail(email);
	    customerdto.setContactno(Contactno);
	    customerdto.setCustomerName(name);
	   
	       
	       
	    
	       
	       customerdto.setCity(bcity);
	       customerdto.setCountry(bcountry);
	       customerdto.setBaddress(Baddress);
	       customerdto.setState(bstate);
	       customerdto.setZip(bzip);
	       
	       customerdto.setSaddress(sadd);
	       customerdto.setScity(scity);
	       customerdto.setsCountry(scountry);
	       customerdto.setSstate(sstate);
	       customerdto.setSzip(szip);
	       
	      

	    AllDao allDao = new AllDao();
		allDao.savecus(customerdto);
		
		
		request.setAttribute("status","success"); 
   	    RequestDispatcher rd = request.getRequestDispatcher("creatNewCus.jsp");
    	rd.include(request, response);
    	
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
	}

}
