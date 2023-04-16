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

    @Column(name = "score")
    private int score;

    @Column(name = "evaluator")
    private String evaluator;

    @Column(name = "comments")
    private String comments;

    @ManyToOne()
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
}
