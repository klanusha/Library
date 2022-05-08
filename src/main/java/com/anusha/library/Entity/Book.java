package com.anusha.library.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category_id;

    @Column(name = "published_date")
    private Date published_date;

    @Column(name = "price")
    private Float price;

}

