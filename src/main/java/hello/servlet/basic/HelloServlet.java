package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet",urlPatterns = "/hello")
public class HelloServlet  extends HttpServlet {//서블릿은 HttpServlet 클래스를 상속 받아야 한다


    //ctrl + o 를 누르고 service를 누른다음 열쇠로 잠겨있는거 더블 클릭해서 가져옴
    //서블릿이 실행되면 이 service가 호출됌
    //service는 was에서 request 와 response를 받아서 작동
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //text/plain = 단순문자
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("hello " + username);
    }
}
