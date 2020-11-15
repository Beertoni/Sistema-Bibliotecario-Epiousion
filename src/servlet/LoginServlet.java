package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanUsuario;
import dao.DaoLogin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DaoLogin daoLogin = new DaoLogin();
	

    public LoginServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			
		BeanUsuario beanUsuario = new BeanUsuario();
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		request.getSession().setAttribute("login", login);
		
		if(daoLogin.validarLoginAdm(login,senha)){ //acesso ok	
			if(login.equals("admin") && senha.equals("master")){
				RequestDispatcher dispatcher = request.getRequestDispatcher("acessoadmin.jsp");
				dispatcher.forward(request, response);
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("acessoliberado.jsp");
				dispatcher.forward(request, response);
			}
				
		}else{ //acesso negado
			RequestDispatcher dispatcher = request.getRequestDispatcher("acessonegado.jsp");
			dispatcher.forward(request, response);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		

		
		
		
	}

}
