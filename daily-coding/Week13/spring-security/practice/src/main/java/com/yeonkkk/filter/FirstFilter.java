package com.yeonkkk.filter;


import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {

    // servlet  컨테이너 실행 시 생성
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("FirstFilter 생성됨");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("========First 필터 시작========");
        chain.doFilter(request, response); // filter 실행
        System.out.println("========First 필터 종료========");
    }

    // servlet 컨테이너가 종료할 때 실행
    // 종료해도 destroy 실행 결과가 나오지 않는 이유 -> 인텔리제이에서 실행했기 때문
    // 터미널에서 실행해보면 확인할 수 있다.
    @Override
    public void destroy() {
        System.out.println("FirstFilter 사라짐");
        Filter.super.destroy();
    }
}
