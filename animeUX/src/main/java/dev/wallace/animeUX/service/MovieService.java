package dev.wallace.animeux.service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import dev.wallace.animeux.dto.MovieDTO;
import dev.wallace.animeux.exception.MovieNotFoundException;
import dev.wallace.animeux.model.Movie;
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
                        movie.getDuration(),
                        movie.getBackgroundImage(),
                        movie.getThumbnailImage(),
                        movie.getLogo()))
                .collect(Collectors.toList());
    }


    public MovieDTO createMovie(MovieDTO movieDTO) {
        
        Movie movie = new Movie();
        
       
        movie.setTitle(movieDTO.getTitle());
        movie.setDescription(movieDTO.getDescription());
        movie.setThumbnailImage(movieDTO.getThumbnailImage());
        movie.setBackgroundImage(movieDTO.getBackgroundImage());
        movie.setLogo(movieDTO.getLogo());
        movie.setRelease_year(movieDTO.getRelease_year());
        movie.setGenre(movieDTO.getGenre());
        movie.setDirector(movieDTO.getDirector());
        movie.setRating(movieDTO.getRating());
        movie.setDuration(movieDTO.getDuration());
        
       
        movieRepository.save(movie);
        
       
        return new MovieDTO(
                movie.getTitle(),
                movie.getDescription(),
                movie.getRelease_year(),
                movie.getGenre(),
                movie.getDirector(),
                movie.getRating(),
                movie.getDuration(),
                movie.getBackgroundImage(),
                movie.getThumbnailImage(),
                movie.getLogo());
    }

    public MovieDTO getMovieById(Long id) {
         Movie movie = movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie with ID " + id + " not found"));
        return new MovieDTO(
                movie.getTitle(),
                movie.getDescription(),
                movie.getRelease_year(),
                movie.getGenre(),
                movie.getDirector(),
                movie.getRating(),
                movie.getDuration(),
                movie.getBackgroundImage(),
                movie.getThumbnailImage(),
                movie.getLogo());
    }

    public void deleteMovie(Long id) {
        if (!movieRepository.existsById(id)) {
            throw new RuntimeException("Movie with ID " + id + " not found");
        }
        movieRepository.deleteById(id);
    }
    
}
