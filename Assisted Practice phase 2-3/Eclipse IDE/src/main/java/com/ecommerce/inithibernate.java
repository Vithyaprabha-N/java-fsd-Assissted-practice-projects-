package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.*;
import javax.xml.bind.*;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ecommerce.EProduct;
import com.ecommerce.hibernateutil;


/**
* Servlet implementation class InitHibernate
*/
@WebServlet("/InitHibernate")

public class inithibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inithibernate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         try {
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");

                 SessionFactory factory = hibernateutil.getSessionFactory();
                        
                 Session session = factory.openSession();
                 out.println("Hibernate Session opened.<br>");
                 session.close();
                 out.println("Hibernate Session closed.<br>");
                        
                 out.println("</body></html>");
                    
                     
                 } catch (Exception ex) {
                         throw ex;
                 }

}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
}

}


