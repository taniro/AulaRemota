import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
		urlPatterns = {"/ciclo", "/teste"},
		initParams = {
			@WebInitParam(name="email", value = "teste@gmail.com")
		})
public class CicloVida extends HttpServlet {

	public CicloVida(){
		System.out.println("CONSTRUTOR CHAMADO");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT CHAMADO");

		super.init(config);

		/*
		System.out.println("CONTEXTO");
		ServletContext servletContext = getServletContext();
		var admin = servletContext.getInitParameter("admin");
		System.out.println(admin);

		System.out.println("GET CHAMADO");
		ServletConfig servletConfig  = getServletConfig();
		var email = servletConfig.getInitParameter("email");
		System.out.println(email);
		 */
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SERVICE CHAMADO");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("DESTROY CHAMADO");
		super.destroy();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET CHAMADO");
		ServletConfig servletConfig  = getServletConfig();
		var email = servletConfig.getInitParameter("email");
		var username = servletConfig.getInitParameter("username");
		response.getWriter().println("Hello " + email + " username " + username);
	}
}
