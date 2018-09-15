package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 672762
 */
@WebServlet(name = "ArithmeticServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //variables
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        
        
        //check to make sure values are entered
        if (first == null && first.equals("") &&
                second == null && second.equals("")) {
            request.setAttribute("message",  "result: " + "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
            return;
        }
        //check to make sure values are entered
        if (first == null || first.equals("") ||
                second == null || second.equals("")) {
            request.setAttribute("message",  "result: " + "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
            return;
        }
        
        int fNum = Integer.parseInt(first);
        int sNum = Integer.parseInt(second);
        int result;
        
        if (request.getParameter("add") != null) {
           
            result = fNum + sNum;
            
            request.setAttribute("message",  "result: " + result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        }
        if (request.getParameter("subtract") != null) {
           
            result = fNum - sNum;
            
            request.setAttribute("message",  "result: " + result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        }
        if (request.getParameter("multiply") != null) {
           
            result = fNum * sNum;
            
            request.setAttribute("message",  "result: " + result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        }
        if (request.getParameter("divide") != null) {
           
            result = fNum / sNum;
            
            request.setAttribute("message",  "result: " + result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        }
         
    }

}
