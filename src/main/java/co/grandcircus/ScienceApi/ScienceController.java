package co.grandcircus.ScienceApi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ScienceController {

	@RequestMapping("/")
	public ModelAndView tiny() {
		ModelAndView mav = new ModelAndView("index");
		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();

		// Set up headers.
		//HttpHeaders headers = new HttpHeaders();
		//headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		
		// Set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		// Make the Request.
		ResponseEntity<Tiny> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null), Tiny.class);

		// Extract body from response.
		Tiny result = response.getBody();
		
		mav.addObject("result", result.getClass());
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		ModelAndView mav = new ModelAndView("complete");
		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();

		// Set up headers.
		//HttpHeaders headers = new HttpHeaders();
		//headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		
		// Set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		// Make the Request.
		ResponseEntity<Complete> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null), Complete.class);

		// Extract body from response.
		Complete result = response.getBody();
		
		mav.addObject("result", result.getClass());
		return mav;
	}
	
	
}
