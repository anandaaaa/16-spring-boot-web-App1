package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView displayMessage()
	{
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg", "welcome to anand project ...!!!1");
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@GetMapping("/wish")
	public String displayWish(Model model)
	{
		
		model.addAttribute("msg", "Good morning sir");
		
		return "index";
	}

}
