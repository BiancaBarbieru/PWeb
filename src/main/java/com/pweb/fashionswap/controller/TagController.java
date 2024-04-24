//package com.pweb.fashionswap.controller;
//
//import com.pweb.fashionswap.entities.Tag;
//import com.pweb.fashionswap.repository.TagRepository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TagController {
//    private TagRepository tagRepository;
//    public TagController(TagRepository tagRepository) {
//        this.tagRepository = tagRepository;
//    }
//
//    @GetMapping("/tags/{id}")
//    public Tag getTag(@PathVariable Long id) {
//        return tagRepository.findById(id).orElse(null);
//    }
//}
