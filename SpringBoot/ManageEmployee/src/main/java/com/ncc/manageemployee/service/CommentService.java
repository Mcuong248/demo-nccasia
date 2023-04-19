package com.ncc.manageemployee.service;

import com.ncc.manageemployee.dto.CommentDto;
import com.ncc.manageemployee.model.Comment;
import com.ncc.manageemployee.model.Employee;
import com.ncc.manageemployee.model.Project;
import com.ncc.manageemployee.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;

    public List<Comment> getAllComment(){
        Iterable<Comment> commentIterable = commentRepo.findAll();
        List<Comment> comments = new ArrayList<>();
        commentIterable.iterator().forEachRemaining(comments::add);
        return comments;
    }
//    public List<Comment> getAllEmployee(){
//        return commentRepo.findAll();
//    }

    //muốn tạo mới thì cần có một method để lưu vào database
    public Comment save(Comment comment){
        return commentRepo.save(comment);
    }

    public void delete(Integer id){
        commentRepo.deleteById(id);
    }
}
