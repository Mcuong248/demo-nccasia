package com.ncc.manageemployee.repository;

import com.ncc.manageemployee.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Integer> {

}
