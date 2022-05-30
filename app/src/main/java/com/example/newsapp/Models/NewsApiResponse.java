package com.example.newsapp.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    int count;
    List<NewsHeadLines> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<NewsHeadLines> getResults() {
        return results;
    }

    public void setResults(List<NewsHeadLines> results) {
        this.results = results;
    }
}
