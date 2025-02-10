package kr.co.mbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/index")
	public void index() {
		
	}
	
	@GetMapping("/about")
	public void about() {
		
	}
	
	@GetMapping("/products")
	public void products() {
		
	}
	
	@GetMapping("/store")
	public void store() {
		
	}
}
