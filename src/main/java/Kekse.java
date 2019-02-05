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
	String kekse() {
		return "I am the liveness monster.";
	}

	@RequestMapping("/readyness")
	String kekse() {
		return "I am ready. Hit me.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Kekse.class, args);
	}

}