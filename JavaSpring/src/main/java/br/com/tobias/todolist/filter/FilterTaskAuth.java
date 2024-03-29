package br.com.tobias.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

                // Pegar a autenticação (usuário e senha)
                var authorization = request.getHeader("Authorization");
                System.out.println("Authorization");
                System.out.println(authorization);


                // Validar usuário

                // Validar senha

                // Segue viagem

                filterChain.doFilter(request, response);
    }

    
    
}
