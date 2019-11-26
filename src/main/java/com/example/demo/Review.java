package com.example.demo;

public class Review {
    private String app;
    private String translated_review;
    private String sentiment;
    private String sentiment_polarity;
    private String sentiment_subjectivity;
    
    public Review(String app, String translated_review, String sentiment, String sentiment_polarity, String sentiment_subjectivity) {
        this.app = app;
        this.translated_review = translated_review;
        this.sentiment = sentiment;
        this.sentiment_polarity = sentiment_polarity;
        this.sentiment_subjectivity = sentiment_subjectivity;
    }

    public String getApp() {
        return app;
    }

    public String getTranslated_review() {
        return translated_review;
    }

    public String getSentiment() {
        return sentiment;
    }

    public String getSentiment_polarity() {
        return sentiment_polarity;
    }

    public String getSentiment_subjectivity() {
        return sentiment_subjectivity;
    }

    
}
