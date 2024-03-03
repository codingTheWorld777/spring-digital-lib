package com.book.digitallib.lib;

import jakarta.persistence.*;

@Entity
@Table(name = "book", schema = "digital-library")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


}
