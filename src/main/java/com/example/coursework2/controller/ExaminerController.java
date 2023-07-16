package com.example.coursework2.controller;

import com.example.coursework2.model.Question;
import org.springframework.web.bind.annotation.*;
import com.example.coursework2.services.ExaminerServiceImpl;

import java.util.Collection;


@RestController
@RequestMapping("/exam")
public class ExaminerController {
    private final ExaminerServiceImpl examinerService;

    public ExaminerController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable Integer amount) {
        return examinerService.getQuestions(amount);
    }
}



