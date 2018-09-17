package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 672762
 */
@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/age"})
public class AgeCalculatorServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        request.setAttribute("age", age);
        
        //Display a message if no value is entered
        if (age == null || age.equals("")) {
            request.setAttribute("message", "you must enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        //calculate age next birthday
        int result = Integer.parseInt(age);
        
            result = result + 1;
            request.setAttribute("message", "Your age next birthday will be " + result);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);  
    }
}
