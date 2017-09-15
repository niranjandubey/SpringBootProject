package SpringBootExample.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("SpringBootExample")
@EnableAutoConfiguration
@EnableJpaRepositories("SpringBootExample")
@EntityScan("SpringBootExample")
public class SpringBootFirstWebApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(SpringBootFirstWebApplication.class, args);
	    }
}
