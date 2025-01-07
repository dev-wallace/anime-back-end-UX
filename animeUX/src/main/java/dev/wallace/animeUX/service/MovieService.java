package dev.wallace.animeux.service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import dev.wallace.animeux.dto.MovieDTO;
import dev.wallace.animeux.repository.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(movie -> new MovieDTO(
                        movie.getTitle(),
                        movie.getDescription(),
                        movie.getRelease_year(),
                        movie.getGenre(),
                        movie.getDirector(),
                        movie.getRating(),
                        movie.getDuration()))
                .collect(Collectors.toList());
    }
}
