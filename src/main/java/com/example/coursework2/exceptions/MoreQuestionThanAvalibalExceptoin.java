package com.example.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MoreQuestionThanAvalibalExceptoin extends RuntimeException {
    public MoreQuestionThanAvalibalExceptoin() {
    }

    public MoreQuestionThanAvalibalExceptoin(String message) {
        super(message);
    }

    public MoreQuestionThanAvalibalExceptoin(String message, Throwable cause) {
        super(message, cause);
    }

    public MoreQuestionThanAvalibalExceptoin(Throwable cause) {
        super(cause);
    }

    public MoreQuestionThanAvalibalExceptoin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

