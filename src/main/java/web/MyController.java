package web;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

	@RequestMapping("/")
	String index() {
		return "index";
	}

	@RequestMapping("/test")
	String test() {
		return "test.jsp";
	}
}
