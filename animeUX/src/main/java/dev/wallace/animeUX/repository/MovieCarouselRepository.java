package dev.wallace.animeux.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wallace.animeux.model.MovieCarousel;

public interface MovieCarouselRepository extends JpaRepository<MovieCarousel, Long> {
    

}
