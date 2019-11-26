
package com.example.demo;

public class AppData {
    private String app;
    private String category;
    private String rating;
    private int review;
    private String size;
    private String installs;
    private String type;
    private String price;
    private String content_rating;
    private String genres;
    private String last_update;
    private String current_ver;
    private String android_ver;

    public AppData(String app, String category, String rating, int review, String size, String installs, String type, String price, String content_rating, String genres, String last_update, String current_ver, String android_ver) {
        this.app = app;
        this.category = category;
        this.rating = rating;
        this.review = review;
        this.size = size;
        this.installs = installs;
        this.type = type;
        this.price = price;
        this.content_rating = content_rating;
        this.genres = genres;
        this.last_update = last_update;
        this.current_ver = current_ver;
        this.android_ver = android_ver;
    }

    public String getApp() {
        return app;
    }

    public String getCategory() {
        return category;
    }

    public String getRating() {
        return rating;
    }

    public int getReview() {
        return review;
    }

    public String getSize() {
        return size;
    }

    public String getInstalls() {
        return installs;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public String getContent_rating() {
        return content_rating;
    }

    public String getGenres() {
        return genres;
    }

    public String getLast_update() {
        return last_update;
    }

    public String getCurrent_ver() {
        return current_ver;
    }

    public String getAndroid_ver() {
        return android_ver;
    }
    
}
