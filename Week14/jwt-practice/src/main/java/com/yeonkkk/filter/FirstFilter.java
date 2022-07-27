package com.yeonkkk.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// (1) HttpServletRequest: Http 프로토콜의 request 정보를 서블릿에 전달하기 위한 목적으로 사용
//     Header 정보, Parameter, cookie, URI, URL 등의 정보를 읽어들이는 메서드를 가진 클래스
// (2) HttpServletResponse: Servlet이 HttpServletResponse 객체에 Content Type, 응답코드, 응답 메세지 등을 담아서 전송

public class FirstFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;      // (1)
        HttpServletResponse res = (HttpServletResponse) response;   // (2)

        res.setCharacterEncoding("UTF-8");
        if (req.getMethod().equals("POST")) {
            String headerAuth = req.getHeader("Authorization");

            if (headerAuth.equals("codestates")) {
                chain.doFilter(req, res);
            } else {
                PrintWriter writer = res.getWriter();
                writer.println("인증 실패");
            }
        }
    }
}
