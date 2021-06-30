package in.anand.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/date")
public class DateController {
	
	@GetMapping("/todaysDate")
	public ModelAndView displayDate()
	{
		
		ModelAndView modelAndView = new ModelAndView();
		LocalDate ld=LocalDate.now();
		modelAndView.addObject("date", "Todays date::::"+ld);
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
