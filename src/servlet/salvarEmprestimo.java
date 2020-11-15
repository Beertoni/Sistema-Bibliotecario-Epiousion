package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanLivro;
import bean.BeanUsuario;
import dao.DaoEmprestimo;
import dao.DaoLivro;
import dao.DaoUsuario;


@WebServlet("/salvarEmprestimo")
public class salvarEmprestimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DaoEmprestimo daoEmprestimo;
       
    public salvarEmprestimo() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		 daoEmprestimo = new DaoEmprestimo();
		
		String login = request.getParameter("login");
		String emprestimo = request.getParameter("emprestimo");
		String nomeLivro = request.getParameter("nomeLivro");
		String idLivro = request.getParameter("idLivro");
		String status = request.getParameter("status");
		
		BeanUsuario beanUsuario = new BeanUsuario();
		beanUsuario.setLogin(login);
		beanUsuario.setEmprestimo(emprestimo);
		daoEmprestimo.atualizarUser(beanUsuario);
		
		BeanLivro beanLivro = new BeanLivro();
		beanLivro.setNome(nomeLivro);
		beanLivro.setId(idLivro);
		beanLivro.setStatus(status);
		daoEmprestimo.atualizarLivro(beanLivro);
		
		try{
			RequestDispatcher view = request.getRequestDispatcher("/acessoadmin.jsp");
			view.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
