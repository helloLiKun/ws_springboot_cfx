package com.cfx.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import  javax.servlet.annotation.WebServlet;
import javax.servlet.Servlet;

@SpringBootApplication
@ServletComponentScan
public class WsSpringbootCfxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsSpringbootCfxApplication.class, args);
	}


}

