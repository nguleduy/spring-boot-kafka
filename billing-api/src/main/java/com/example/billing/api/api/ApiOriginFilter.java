package com.example.billing.api.api;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApiOriginFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletResponse httpServletResponse = (HttpServletResponse) response;
    httpServletResponse.addHeader("Access-Control-Allow-Origin", "*" );
    httpServletResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT" );
    httpServletResponse.addHeader("Access-Control-Allow-Headers", "Content-Type" );
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {

  }
}
