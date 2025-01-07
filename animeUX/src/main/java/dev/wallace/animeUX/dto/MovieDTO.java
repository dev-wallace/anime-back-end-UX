package dev.wallace.animeux.dto;


public class MovieDTO {


    private String title;
    private String description;
    private Integer release_year;
    private String genre;
    private String director;
    private Double rating;
    private Double duration;

  
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
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public Double getDuration() {
        return duration;
    }
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    private String backgroundImage;
    
    private String thumbnailImage;

    
    public String getThumbnailImage() {
        return thumbnailImage;
    }
    
    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public MovieDTO(String title, String description, Integer release_year, String genre, String director,
            Double rating, Double duration, String backgroundImage, String thumbnailImage) {
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.genre = genre;
        this.director = director;
        this.rating = rating;
        this.duration = duration;
        this.backgroundImage = backgroundImage;
        this.thumbnailImage = thumbnailImage;
    }
    public MovieDTO(){

    }

}
