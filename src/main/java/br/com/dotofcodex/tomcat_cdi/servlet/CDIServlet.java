package br.com.dotofcodex.tomcat_cdi.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dotofcodex.tomcat_cdi.service.SimpleService;

@WebServlet(urlPatterns = {"/CDIServlet.do"})
public class CDIServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private SimpleService service;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		service.getMessage("Pedro Ferreira");
		
		response.sendRedirect(getServletContext().getContextPath()+"/index.jsp");
	}

}
