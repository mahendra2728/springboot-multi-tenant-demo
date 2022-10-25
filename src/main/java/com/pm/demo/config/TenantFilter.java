package com.pm.demo.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
public class TenantFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String tenantName = req.getHeader("X-TenantID");
        com.pm.demo.config.TenantContext.setCurrentTenant(tenantName);

        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            TenantContext.setCurrentTenant("");
        }

    }
}
