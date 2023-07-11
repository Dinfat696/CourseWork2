package services;

import dto.Question;
import exceptions.MoreQuestionThanAvalibalExceptoin;
import interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private List<Question> questions = new ArrayList<>();
    @Override
    public Question add(String question, String answer){
        Question newQuestion = new Question(question, answer);
        if(!questions.contains(newQuestion)){
            questions.add(newQuestion);
            return newQuestion;
        }
        throw new MoreQuestionThanAvalibalExceptoin();
    }
    @Override
    public Question remove(Question question){
            if(questions.remove(question)) {
                return question;
            }
            return null;
    }
    @Override
    public Collection<Question> getAll(){
        return Collections.unmodifiableList(questions);
    }

    @Override
    public Question getRandomQuestion(){
        int size=questions.size();
        if(size>0){
            int randomIndex=new Random().nextInt(size);
            return questions.get(randomIndex);
        }
        return null;
    }
}