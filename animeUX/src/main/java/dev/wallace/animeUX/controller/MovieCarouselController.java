package dev.wallace.animeux.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.wallace.animeux.dto.MovieCarouselDTO;
import dev.wallace.animeux.service.MovieCarouselService;

@RestController
@RequestMapping ("/movies/carousel")

public class MovieCarouselController {
    private MovieCarouselService movieCarouselService;

    public MovieCarouselController(MovieCarouselService movieCarouselService) {
        this.movieCarouselService = movieCarouselService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<MovieCarouselDTO> createMovieCarousel(@RequestBody MovieCarouselDTO movieCarouselDTO) {
        MovieCarouselDTO result = movieCarouselService.createMovieCarousel(movieCarouselDTO);
        return new ResponseEntity<  MovieCarouselDTO>(result, HttpStatus.CREATED);
    }
    

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteMovieCarousel(@PathVariable Long id) {
        try {
            movieCarouselService.deleteMovieCarousel(id);
            return ResponseEntity.ok("MovieCarousel deleted successfully!");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Error: MovieCarousel with ID " + id + " not found.");
        }
    }
}
