package mu.bom.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("mu.bom.demo.persistence.repo")
@EntityScan("mu.bom.demo.persistence.model")
@SpringBootApplication
public class DemoApplication {

	@Value("${spring.sample.property}")
	static String valueProperty;

	static void test() {
		System.out.print("Test Demo" + valueProperty);
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		test();
	}

}
