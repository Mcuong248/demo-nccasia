package com.ncc.manageemployee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "comments")
    private String comments;


    @Column(name = "evaluator")
    private String evaluator;

    @Column(name = "score")
    private int score;

    @ManyToOne()
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
}
