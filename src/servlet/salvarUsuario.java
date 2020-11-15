package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanUsuario;
import dao.DaoUsuario;

@WebServlet("/salvarUsuario")
public class salvarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DaoUsuario daoUsuario = new DaoUsuario();

    public salvarUsuario() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String permissao = request.getParameter("permissao");
		String emprestimo = request.getParameter("emprestimo");
		
		BeanUsuario usuario = new BeanUsuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setPermissao(permissao);
		usuario.setEmprestimo(emprestimo);
		
		daoUsuario.salvar(usuario);
		
		
		
		try{
		RequestDispatcher view = request.getRequestDispatcher("/acessoadmin.jsp");
//		request.setAttribute("usuarios", daoUsuario.listar());
		
		view.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
