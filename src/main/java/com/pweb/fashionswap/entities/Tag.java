//package com.pweb.fashionswap.entities;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@Table(name = "Tags")
//public class Tag {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "tags_id")
//    private Long id;
//
//    private String name;
//
//    @ManyToMany(mappedBy = "tags")
//    private Set<Product> products = new HashSet<>();
//}