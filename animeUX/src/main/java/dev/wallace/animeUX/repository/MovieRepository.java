package dev.wallace.animeux.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wallace.animeux.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    

}
