
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@EnableDiscoveryClient
public class Application {
	
	@RequestMapping("/")
	String home() {
		return "Hello Registry!";
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
