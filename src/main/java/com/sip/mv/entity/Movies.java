package com.sip.mv.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Getter
@Setter
@Document(collection = "movies_details")
public class Movies {
    @Id
    private int movies_id;
    private String movies_name;
    private String comments;
    private double rating;
    private String release_date;

    public Movies(int movies_id, String movies_name, String comments, double rating, String release_date) {
        this.movies_id = movies_id;
        this.movies_name = movies_name;
        this.comments = comments;
        this.rating = rating;
        this.release_date = release_date;
    }

}
