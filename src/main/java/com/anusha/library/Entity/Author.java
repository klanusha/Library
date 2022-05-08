package com.anusha.library.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="author")
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}

