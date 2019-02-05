import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Kekse {

	@RequestMapping("/")
	String kekse() {
		return "{\"need_more\": \"kekse\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(Kekse.class, args);
	}

}