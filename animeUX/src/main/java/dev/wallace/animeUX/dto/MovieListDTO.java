package dev.wallace.animeux.dto;

public class MovieListDTO {
    
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieListDTO(String title) {
        this.title = title;
    }
    
    public MovieListDTO() {
    }
}
