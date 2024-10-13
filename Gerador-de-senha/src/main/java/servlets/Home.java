package servlets;



import java.io.IOException;
import java.security.SecureRandom;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public final class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LOWERCASE="abcdefghijklmnopqrstuvwxyz";
	private static final String UPPERCASE=LOWERCASE.toUpperCase();
	private static final String SIMBOLS="+-*//:;.,><?|]}^~{[`´=_-)&%$#@!";
	private static final String NUMBERS="0123456789";
	public final static StringBuilder gerar() {
            
		StringBuilder senha = new StringBuilder();
		SecureRandom aleatorio = new SecureRandom();
		for(int i = 0; i<5;i++) {
			senha.append(LOWERCASE.charAt((int) aleatorio.nextLong(0, LOWERCASE.length())));
			
		}
		senha.append(UPPERCASE.charAt((int) aleatorio.nextLong(0, LOWERCASE.length())));
		for(int e = 0; e<3;e++) {
			senha.append(SIMBOLS.charAt((int) aleatorio.nextFloat(0, SIMBOLS.length())));
		}
		senha.append(NUMBERS.charAt((int) aleatorio.nextFloat(0, NUMBERS.length())));
		boolean randomico = aleatorio.nextBoolean();
                if(randomico == true){
                    return senha;
                }
                return senha.reverse();
	}
	/**
     * @param request
     * @param response
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
	 */
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("index.jsp");
	}

	/**
     * @param request
     * @param response
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String senha = new String (gerar());		
		request.setAttribute("senha", senha);	
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
        }
		
	}

