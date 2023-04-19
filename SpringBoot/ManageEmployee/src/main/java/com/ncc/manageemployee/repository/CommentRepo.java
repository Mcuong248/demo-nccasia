package com.ncc.manageemployee.repository;

import com.ncc.manageemployee.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {

    @Query("SELECT c.comments, c.evaluator, c.score, e.employeeId " +
            "FROM Comment c " +
            "INNER JOIN c.employee e ")
    public List<Comment> getAllComment();

}
