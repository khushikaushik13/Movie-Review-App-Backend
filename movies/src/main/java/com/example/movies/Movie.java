package com.example.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    public void setReviewIds(List<Review> reviewIds) {
        this.reviewIds = reviewIds;
    }

    public List<Review> getReviewIds() {
        return reviewIds;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getPoster() {
        return poster;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getImdbId() {
        return imdbId;
    }

    public ObjectId getId() {
        return id;
    }

    @DocumentReference
    private List<Review> reviewIds;

}
