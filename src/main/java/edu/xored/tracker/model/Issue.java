package edu.xored.tracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
public class Issue {

    private String hash;
    private String summary;
    private String description;
    private User author;
    private Status status;
    private LocalDateTime createdDateTime;

    @JsonIgnore
    private List<Comment> comments = new ArrayList<>();

    public Issue() {
    }

    public Issue(String hash, String summary, String description, Status status) {
        this.hash = hash;
        this.summary = summary;
        this.description = description;
        this.status = status;
        this.createdDateTime = LocalDateTime.now();
    }

    public List<Comment> getComments() {
        return Collections.unmodifiableList(comments);
    }

    public void addComment(Comment comment) {
        if (comment != null) {
            comments.add(comment);
        }
    }

    public void addComments(Collection<Comment> comments) {
        if (comments != null) {
            this.comments.addAll(comments);
        }
    }

    public Issue updateIssue(Issue other) {
        if (other.getSummary() != null) {
            setSummary(other.getSummary());
        }
        if (other.getDescription() != null) {
            setDescription(other.getDescription());
        }
        if (other.getAuthor() != null) {
            setAuthor(other.getAuthor());
        }
        if (other.getStatus() != null) {
            setStatus(other.getStatus());
        }
        if (other.getCreatedDateTime() != null) {
            setCreatedDateTime(other.getCreatedDateTime());
        }
        if (other.getComments() != null) {
            addComments(other.getComments());
        }
        return this;
    }

    public enum Status {
        OPEN, RESOLVED;
    }
}
