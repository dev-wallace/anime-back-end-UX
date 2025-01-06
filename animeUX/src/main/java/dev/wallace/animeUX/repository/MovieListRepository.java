package dev.wallace.animeux.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wallace.animeux.model.MovieList;

public interface MovieListRepository extends JpaRepository<MovieList, Long> {
    

}
