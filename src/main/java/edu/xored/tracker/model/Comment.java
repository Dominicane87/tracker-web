package edu.xored.tracker.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {

    private String author;
    private LocalDateTime createdDateTime;
    private String content;

    public Comment() {
        this("Anonymous", null);
    }

    public Comment(String author, String content) {
        this.author = author;
        this.createdDateTime = LocalDateTime.now();
        this.content = content;
    }

}
