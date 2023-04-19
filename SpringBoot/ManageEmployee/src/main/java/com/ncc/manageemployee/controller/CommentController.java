package com.ncc.manageemployee.controller;

import com.ncc.manageemployee.dto.CommentDto;
import com.ncc.manageemployee.model.Comment;
import com.ncc.manageemployee.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

//    @PostMapping
//    public ResponseEntity<Comment> creatNewComment (@RequestBody Comment comment){
//        return new ResponseEntity<>(commentService.save(comment), HttpStatus.OK);
//    }

    @GetMapping(value = "/comments")
    public List<CommentDto> getAllUser() {
        return commentService.getAllComment().stream().map(cmt ->
                new CommentDto().setId(cmt.getId())
                        .setComments(cmt.getComments())
                        .setEvaluator(cmt.getEvaluator())
                        .setScore(cmt.getScore())
        ).collect(Collectors.toList());
    }

//    @GetMapping("/comments/{id}")
//    public List<Project> getCommentId(@PathVariable("id") Integer id){
//        commentService.getAllComment(id);
//        return commentService.getAllComment();
//    }

    @PostMapping
    public ResponseEntity<Comment> creatNewComment (@RequestBody Comment comment){
        return new ResponseEntity<>(commentService.save(comment), HttpStatus.OK);
    }
}
