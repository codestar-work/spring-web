package web;
import org.springframework.boot.*;
import org.springframework.boot.builder.*;
import org.springframework.boot.context.web.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] s) {
		SpringApplication.run(Application.class, s);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(Application.class);
	}
}
