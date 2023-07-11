package controller;

import dto.Question;
import exceptions.MoreQuestionThanAvalibalExceptoin;
import interfaces.ExaminerService;
import org.springframework.web.bind.annotation.*;
import services.ExaminerServiceImpl;

import java.util.Collection;
import java.util.Collections;


@RestController
    @RequestMapping("/exam/get")
    public class ExaminerController {
        public final ExaminerServiceImpl service;
        public ExaminerController(ExaminerServiceImpl service) {
            this.service = service;
        }
        @GetMapping("/{amount}")
        public Collection<Question> getQuestions(@PathVariable Integer amount){
           return  service.getQuestions(amount);
            }
        }



