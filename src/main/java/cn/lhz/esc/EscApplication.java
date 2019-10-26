package cn.lhz.esc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EscApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscApplication.class, args);
	}

}
