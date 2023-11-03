package com.example.bootcampminiproject.model;

import jakarta.persistence.*;
import lombok.*;

//import javax.persistence.Entity;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String title;

    private String author;

}

