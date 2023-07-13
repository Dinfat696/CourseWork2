package com.example.coursework2.controller;

import com.example.coursework2.dto.Question;
import org.springframework.web.bind.annotation.*;
import com.example.coursework2.services.ExaminerServiceImpl;

import java.util.Collection;


@RestController
@RequestMapping("/exam/get")
public class ExaminerController {
    public final ExaminerServiceImpl service;

    public ExaminerController(ExaminerServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestions(@PathVariable Integer amount) {
        return service.getQuestions(amount);
    }
}



