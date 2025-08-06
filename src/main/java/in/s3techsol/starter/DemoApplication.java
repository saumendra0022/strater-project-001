package in.s3techsol.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String sayHellow() {
		return "Welcome to Docker Practice Sessions";
	}
		
	@GetMapping("/welcome/{name}")
    public String welcomeUser(@PathVariable String name) {
        return "Welcome, " + name + "!";
    }

}
