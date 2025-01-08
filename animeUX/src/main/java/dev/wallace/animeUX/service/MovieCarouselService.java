package dev.wallace.animeux.service;

import org.springframework.stereotype.Service;

import dev.wallace.animeux.dto.MovieCarouselDTO;
import dev.wallace.animeux.model.MovieCarousel;
import dev.wallace.animeux.repository.MovieCarouselRepository;

@Service
public class MovieCarouselService {

    private final MovieCarouselRepository movieCarouselRepository;

    public MovieCarouselService(MovieCarouselRepository movieCarouselRepository) {
        this.movieCarouselRepository = movieCarouselRepository;
    }


    public MovieCarouselDTO  createMovieCarousel(MovieCarouselDTO movieCarouselDTO) {

       MovieCarousel movieCarousel = new MovieCarousel();

         movieCarousel.setTitle(movieCarouselDTO.getTitle());
        movieCarousel.setDescription(movieCarouselDTO.getDescription());
        movieCarousel.setThumbnail(movieCarouselDTO.getThumbnail());
        movieCarousel.setBackgroundImage(movieCarouselDTO.getBackgroundImage());
        movieCarousel.setLogo(movieCarouselDTO.getLogo());

        movieCarouselRepository.save(movieCarousel);

        return new MovieCarouselDTO(
        movieCarousel.getTitle(),
        movieCarousel.getDescription(),
        movieCarousel.getThumbnail(),
        movieCarousel.getBackgroundImage(),
        movieCarousel.getLogo());
        
    }

    public void deleteMovieCarousel(Long id) {

        if (!movieCarouselRepository.existsById(id)) {
            throw new RuntimeException("MovieCarousel with ID " + id + " not found");
            
        }

        movieCarouselRepository.deleteById(id);
    }

     

}
