package com.example.vel.SpringJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vel.SpringJPA.Models.Movie;
import com.example.vel.SpringJPA.Service.MovieService;

@RestController
public class MovieController {

	@Autowired
	public MovieService movieService;
	
	@GetMapping("/get_movies")
	public List<Movie> getAllStudents(){
		System.out.println("Hey Universe");
		return movieService.getAllMovies();
	}
	
	@PostMapping("/create_movie")
	public void createMovie(@RequestBody Movie movie) {
		movieService.createMovie(movie);
	}
	
}
