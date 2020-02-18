package nz.co.telco.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ScaPersistanceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaPersistanceServiceApplication.class, args);
	}

}
