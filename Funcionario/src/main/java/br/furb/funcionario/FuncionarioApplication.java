package br.furb.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @author Leticia Woelfer de Oliveira
 *
 */

@SpringBootApplication
public class FuncionarioApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FuncionarioApplication.class, args);
	}

}
