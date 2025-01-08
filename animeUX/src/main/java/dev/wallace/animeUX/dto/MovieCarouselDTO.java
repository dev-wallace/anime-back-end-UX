package dev.wallace.animeux.dto;

public class MovieCarouselDTO {
    private String title;
    private String description;
    private String thumbnail;
    private String backgroundImage;
    private String logo;

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
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getBackgroundImage() {
        return backgroundImage;
    }
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public MovieCarouselDTO(String title, String description, String thumbnail, String backgroundImage, String logo) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.backgroundImage = backgroundImage;
        this.logo = logo;
    }

    public MovieCarouselDTO() {
    }
    

}
