package dev.wallace.animeux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.wallace.animeux.dto.MovieDTO;
import dev.wallace.animeux.service.MovieService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/movies")
public class MoviesController {
    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping(value = "/{id}")
    public MovieDTO getMovieById (@PathVariable Long id){
        MovieDTO result = movieService.getMovieById(id);
        return result;
    }

    @GetMapping
    public List<MovieDTO> findAll(){
       var result = movieService.getAllMovies();

        return result;
    }


    }
    

