package mu.bom.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${spring.sample.property}")
	static String valueProperty;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.print("Test Demo" + valueProperty);
	}

}
