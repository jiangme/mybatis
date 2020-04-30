package com.jiang.core.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author Luosj
 * @date 2020-04-29 15:05
 */
public class TestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter before .. ");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter after .. ");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destory ..");
    }
}