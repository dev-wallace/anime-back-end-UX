package dev.wallace.animeux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.wallace.animeux.dto.MovieDTO;

import dev.wallace.animeux.service.MovieService;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/movies")
public class MoviesController {
    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getMovieById (@PathVariable Long id){
       try {
        MovieDTO result = movieService.getMovieById(id);
        return ResponseEntity.ok(result);
       } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Erro: Filme com ID " + id + " não encontrado.");
       }
    }

    @GetMapping
    public List<MovieDTO> getAllMovies(){
       var result = movieService.getAllMovies();

        return result;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable Long id) {
        try {
            movieService.deleteMovie(id);
            return ResponseEntity.ok("Filme deletado com sucesso!");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Erro: Filme com ID " + id + " não encontrado.");
        }
    }


    @PostMapping(value = "/create")
    public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movieDTO) {
        MovieDTO movie = movieService.createMovie(movieDTO);

        return new ResponseEntity<MovieDTO>(movie, HttpStatus.CREATED);

    }
}

