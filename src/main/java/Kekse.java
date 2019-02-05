import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Kekse {

	@RequestMapping("/")
	String kekse() {
		return "In need for Kekse!";
	}

	@RequestMapping("/liveness")
	String liveness() {
		return "OK";
	}

	@RequestMapping("/readyness")
	String readyness() {
		return "OK";
	}

	public static void main(String[] args) {
		SpringApplication.run(Kekse.class, args);
	}

}