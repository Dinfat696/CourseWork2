package com.example.coursework2.services;

import com.example.coursework2.interfaces.ExaminerService;
import com.example.coursework2.interfaces.QuestionService;
import com.example.coursework2.model.Question;
import com.example.coursework2.exceptions.NotEnoughQuestionsExcertion;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new NotEnoughQuestionsExcertion();
        }
        return Stream.generate(() -> questionService.getRandomQuestion())
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }
}
