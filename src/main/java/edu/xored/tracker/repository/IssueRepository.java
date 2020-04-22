package edu.xored.tracker.repository;

import edu.xored.tracker.model.Comment;
import edu.xored.tracker.model.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue,String> {
    <S extends Issue> S replace(String hash, S issue);

    public Iterable<Issue> findAll(Issue.Status status);

    public void replaceAll();

    void postComment(Comment comment, String hash);
}
