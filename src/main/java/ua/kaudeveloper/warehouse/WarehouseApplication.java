package ua.kaudeveloper.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;



@SpringBootApplication(scanBasePackages = "ua.kaudeveloper.warehouse",exclude = {JacksonAutoConfiguration.class})
public class WarehouseApplication   {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

}
