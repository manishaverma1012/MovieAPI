package com.Movie.MovieAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class MovieApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieApiApplication.class, args);
	}
//	@GetMapping("/")
//	public String Apiindex()
//	{
//		return "Hello Manisha";
//
//	}

}
