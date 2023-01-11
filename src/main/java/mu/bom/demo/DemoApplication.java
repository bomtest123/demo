package mu.bom.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
      	
		@Value("${spring.sample.property}")
		String valueProperty;
		System.out.println("Test Demo", valueProperty);
		
	}

}
