package com.tomasz.springsecuritypodstawa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("package com.tomasz.springsecuritypodstawa.controller") // optional. Spring zawsze skanuje cały pakiet w @SpringBootApplication
public class SpringSecurityPodstawaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPodstawaApplication.class, args);
	}

}
