package web;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Demo {
	
	@RequestMapping("/balance")
	String balance() {
		return "balance";
	}
	
	@RequestMapping("/calculate")
	String calculate(double balance, Model model) {
		double result = balance * 1.25 / 100;
		model.addAttribute("result", result);
		return "result";
	}

}
