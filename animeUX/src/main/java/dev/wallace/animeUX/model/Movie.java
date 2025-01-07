package dev.wallace.animeux.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name ="movies")
public class Movie {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

       
        @Column(nullable = false)
        @NotBlank(message = "O título não pode estar vazio.")
        private String title;
        @NotBlank(message = "A descricao não pode estar vazia.")
        @Column(nullable = false)
        private String description;

        @Column(nullable = false)
        @NotBlank(message = "A imagem não pode estar vazia.")
        private String backgroundImage;




        public String getBackgroundImage() {
                return backgroundImage;
        }
        public void setBackgroundImage(String backgroundImage) {
                this.backgroundImage = backgroundImage;
        }
        public void setRating(Double rating) {
                this.rating = rating;
        }
        public void setDuration(Double duration) {
                this.duration = duration;
        }
        public Long getId() {
                return id;
        }
        public void setId(Long id) {
                this.id = id;
        }
        public String getTitle() {
                return title;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public String getDescription() {
                return description;
        }
        public void setDescription(String description) {
                this.description = description;
        }
        public Integer getRelease_year() {
                return release_year;
        }
        public void setRelease_year(Integer release_year) {
                this.release_year = release_year;
        }
        public String getGenre() {
                return genre;
        }
        public void setGenre(String genre) {
                this.genre = genre;
        }
        public String getDirector() {
                return director;
        }
        public void setDirector(String director) {
                this.director = director;
        }
        public double getRating() {
                return rating;
        }
        public void setRating(double rating) {
                this.rating = rating;
        }
        public double getDuration() {
                return duration;
        }
        public void setDuration(double duration) {
                this.duration = duration;
        }
        @Column(nullable = false)
        private Integer release_year;

        @Column(nullable = false)
        private String genre;

        @Column(nullable = false)
        private String director;


        @Column(nullable = false)
        private Double rating;
        @Column(nullable = false)
        private Double duration;

        public Movie(Long id, @NotBlank(message = "O título não pode estar vazio.") String title,
        @NotBlank(message = "A descricao não pode estar vazia.") String description,
        @NotBlank(message = "A imagem não pode estar vazia.") String backgroundImage,
        Integer release_year, String genre, String director, Double rating, Double duration) {
                this.id = id;
                this.title = title;
                this.description = description;
                this.backgroundImage = backgroundImage;
                this.release_year = release_year;
                this.genre = genre;
                this.director = director;
                this.rating = rating;
                this.duration = duration;
        }

        public Movie() {
        }

}
