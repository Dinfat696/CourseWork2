package com.example.coursework2.services;

import com.example.coursework2.exceptions.QuestionAlreadyException;
import com.example.coursework2.model.Question;
import com.example.coursework2.exceptions.NotEnoughQuestionsExcertion;
import com.example.coursework2.interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    public static final Random RANDOM = new Random();
    List<Question> questions = new ArrayList<>();

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        if (!questions.contains(newQuestion)) {
            questions.add(newQuestion);
            return newQuestion;
        }
        throw new QuestionAlreadyException();
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableList(questions);
    }


    @Override
    public Question getRandomQuestion() {
        return questions.get(RANDOM.nextInt(questions.size()));
    }
}