package ua.kaudeveloper.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ua.kaudeveloper.warehouse")
//@EnableAutoConfiguration
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

}
