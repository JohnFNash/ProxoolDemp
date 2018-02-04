package com.johnfnash.study.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.johnfnash.study.util.Constants;

public class CrossInterceptor extends HandlerInterceptorAdapter {	

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(!response.containsHeader(Constants.ACCESS_CONTROL_ALLOW_ORIGIN)) {
        	response.addHeader(Constants.ACCESS_CONTROL_ALLOW_ORIGIN,"*");
        }    	
        if(!response.containsHeader(Constants.ACCESS_CONTROL_ALLOW_METHODS)) {
        	response.addHeader(Constants.ACCESS_CONTROL_ALLOW_METHODS,"*");
        }
        if(!response.containsHeader(Constants.ACCESS_CONTROL_MAX_AGE)) {
        	response.addHeader(Constants.ACCESS_CONTROL_MAX_AGE,"100");
        }
        if(!response.containsHeader(Constants.ACCESS_CONTROL_ALLOW_HEADERS)) {
        	response.addHeader(Constants.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
        }       
        if(!response.containsHeader(Constants.ACCESS_CONTROL_ALLOW_CREDENTIALS)) {
        	response.addHeader(Constants.ACCESS_CONTROL_ALLOW_CREDENTIALS,"false");
        }         
        return super.preHandle(request, response, handler);
    }

}