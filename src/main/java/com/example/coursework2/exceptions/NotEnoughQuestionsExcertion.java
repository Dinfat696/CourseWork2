package com.example.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotEnoughQuestionsExcertion extends RuntimeException {
    public NotEnoughQuestionsExcertion() {
    }

    public NotEnoughQuestionsExcertion(String message) {
        super(message);
    }

    public NotEnoughQuestionsExcertion(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughQuestionsExcertion(Throwable cause) {
        super(cause);
    }

    public NotEnoughQuestionsExcertion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

