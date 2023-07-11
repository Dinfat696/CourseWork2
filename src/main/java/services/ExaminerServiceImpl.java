package services;

import dto.Question;
import exceptions.MoreQuestionThanAvalibalExceptoin;
import interfaces.ExaminerService;
import interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final JavaQuestionServiceImpl service;
    public ExaminerServiceImpl(JavaQuestionServiceImpl service) {
        this.service = service;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> examQuestions=new HashSet<>(amount);
        if(amount > service.getAll().size()){
            throw new MoreQuestionThanAvalibalExceptoin();
        }
        while (examQuestions.size() < amount){
            examQuestions.add(service.getRandomQuestion());
        }
        return Collections.unmodifiableCollection(examQuestions);
    }

}
