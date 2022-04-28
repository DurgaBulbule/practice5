package com.app;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Request;
import com.app.pojos.Response;
@RestController
@SpringBootApplication

@RequestMapping("/durga/bulbule")
public class BackendBajajFinservApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendBajajFinservApplication.class, args);
	}
	@PostMapping(path = "bfhl")
	public Response getData(@RequestBody Request req) {
		
		List<String> numbers = new LinkedList<>();
		List<String> alphabets = new LinkedList<>();
		
		for(String s : req.getData()) {
			
			try{
				Integer.parseInt(s);
				numbers.add(s);
			}catch(Exception e) {
				alphabets.add(s);
			}
		}
		
		Response s = new Response();
		s.setIsSuccess(true);
		s.setUserId("Durga_Bulbule_21101996");
		s.setEmail("durgabulbule@gmail.com");
		s.setRollNumber("PD0060");
		s.setNumbers(numbers);
		s.setAlphabets(alphabets);
		
		return s;
}
	}
