package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Controller", value = "/login")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().println("Email "+ req.getParameter("email"));
//        resp.getWriter().println("Pass "+ req.getParameter("pass"));
            String email = req.getParameter("email");
            String pass = req.getParameter("pass");
            if ("abc@gmail.com".equals(email) && "123".equals(pass)){
                resp.getWriter().println("Login Success");
            }else{
                req.setAttribute("error", "Bạn đã nhập sai tài khoản hoặc mật khẩu");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }

    }
}
