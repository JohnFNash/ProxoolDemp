package com.johnfnash.study.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.johnfnash.study.util.Constants;

public class CrossFilter extends OncePerRequestFilter {

	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if (request.getHeader(Constants.ACCESS_CONTROL_REQUEST_METHOD) != null && "OPTIONS".equals(request.getMethod())) {
            // CORS "pre-flight" request
            response.addHeader(Constants.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
            response.addHeader(Constants.ACCESS_CONTROL_ALLOW_METHODS, "GET, POST, PUT, DELETE");
            response.addHeader(Constants.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
            response.addHeader(Constants.ACCESS_CONTROL_MAX_AGE, "1800");//30 min
        }
        filterChain.doFilter(request, response);
    }

}
