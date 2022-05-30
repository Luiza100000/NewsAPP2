package com.example.newsapp.Models;

import java.io.Serializable;

public class NewsHeadLines implements Serializable {
    String id = "";
    String title = "";
    String description = "";
    first_image first_image = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public com.example.newsapp.Models.first_image getFirst_image() {
        return first_image;
    }

    public void setFirst_image(com.example.newsapp.Models.first_image first_image) {
        this.first_image = first_image;
    }
}
