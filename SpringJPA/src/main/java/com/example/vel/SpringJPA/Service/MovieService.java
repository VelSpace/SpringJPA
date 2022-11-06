package com.example.vel.SpringJPA.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.vel.SpringJPA.Models.Movie;
import com.example.vel.SpringJPA.Repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	public void createMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
}
