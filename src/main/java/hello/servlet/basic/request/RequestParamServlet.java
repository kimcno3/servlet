package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("전체 파라이머 조회 - 시작");

        req.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + " : " + req.getParameter(paramName)));

        System.out.println("전체 파라이머 조회 - 종료");

        System.out.println();

        System.out.println("단일 파라이머 조회 - 시작");

        String name = req.getParameter("username");
        String age = req.getParameter("age");

        System.out.println("name = " + name);
        System.out.println("age = " + age);

        System.out.println("단일 파라이머 조회 - 종료");
    }
}
