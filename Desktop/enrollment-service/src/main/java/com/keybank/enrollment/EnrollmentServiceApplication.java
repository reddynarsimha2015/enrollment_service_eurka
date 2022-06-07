package com.keybank.enrollment;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EnrollmentServiceApplication {
	@Value("${connectionTimeOut}")
	private int connectionTimeOut;
	
	@Value("${readTimeOut}")
	private int readTimeOut;

	public static void main(String[] args) {
		SpringApplication.run(EnrollmentServiceApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		System.out.println("------------connectionTimeOut11111--------------"+connectionTimeOut);
		System.out.println("------------readTimeOut111111--------------"+readTimeOut);

		//HttpComponentsClientHttpRequestFactory httpRequestFactory=new HttpComponentsClientHttpRequestFactory();
		//httpRequestFactory.setConnectTimeout(connectionTimeOut);
		//httpRequestFactory.setReadTimeout(readTimeOut);
	    return new RestTemplate();
	}
	

}
