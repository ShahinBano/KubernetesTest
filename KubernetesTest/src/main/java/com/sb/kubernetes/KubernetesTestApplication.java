package com.sb.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubernetesTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesTestApplication.class, args);
		System.out.println("KkubernetesTestApplication.main()");
		System.out.println("Hello paddu");
	}

}
