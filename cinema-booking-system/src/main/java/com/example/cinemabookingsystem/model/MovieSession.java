package com.example.cinemabookingsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("movie_sessions")
public class MovieSession {
    @Id
    private Integer id;

    @Column("movie_name") // SQL-дегі movie_name бағанымен байланыстырады
    private String movieName;

    @Column("start_time") // SQL-дегі start_time бағанымен байланыстырады
    private String startTime;

    private Integer price;

    // Getters and Setters (Міндетті түрде!)
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getMovieName() { return movieName; }
    public void setMovieName(String movieName) { this.movieName = movieName; }
    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }
    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }
}