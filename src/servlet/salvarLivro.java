package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanLivro;
import dao.DaoLivro;

@WebServlet("/salvarLivro")
public class salvarLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DaoLivro daoLivro = new DaoLivro();
       
 
    public salvarLivro() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String autor = request.getParameter("autor");
		String id = request.getParameter("id");
		String status = request.getParameter("status");
		
		BeanLivro livro = new BeanLivro();
		livro.setNome(nome);
		livro.setAutor(autor);
		livro.setId(id);
		livro.setStatus(status);
		
		daoLivro.salvarLivro(livro);
		
		try{
		RequestDispatcher view = request.getRequestDispatcher("/acessoadmin.jsp");
		view.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
