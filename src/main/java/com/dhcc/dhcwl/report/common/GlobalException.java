package com.dhcc.dhcwl.report.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler({NullPointerException.class})
    public Result exception(NullPointerException exception) {
        if (exception.getStackTrace() == null) {
            return Result.failure(exception.getMessage());
        }
        if (exception.getStackTrace()[0] instanceof StackTraceElement) {
            List<StackTraceElement> list = new ArrayList<>();
            for (int i = 0; i < exception.getStackTrace().length; i++) {
                list.add(exception.getStackTrace()[i]);
            }
            return Result.failure(list);
        }
        return Result.failure(exception.getStackTrace()[0].toString());

    }

    @ExceptionHandler({IndexOutOfBoundsException.class})
    public Result exception(IndexOutOfBoundsException exception) {
        if (exception.getStackTrace() == null) {
            return Result.failure(exception.getMessage());
        }
        if (exception.getStackTrace()[0] instanceof StackTraceElement) {
            List<StackTraceElement> list = new ArrayList<>();
            for (int i = 0; i < exception.getStackTrace().length; i++) {
                list.add(exception.getStackTrace()[i]);
            }
            return Result.failure(list);
        }
        return Result.failure(exception.getStackTrace()[0].toString());


    }

    @ExceptionHandler({ArithmeticException.class})
    public Result exception(ArithmeticException exception) {
        if (exception.getStackTrace() == null) {
            return Result.failure(exception.getMessage());
        }
        if (exception.getStackTrace()[0] instanceof StackTraceElement) {
            List<StackTraceElement> list = new ArrayList<>();
            for (int i = 0; i < exception.getStackTrace().length; i++) {
                list.add(exception.getStackTrace()[i]);
            }
            return Result.failure(list);
        }
        return Result.failure(exception.getStackTrace()[0].toString());

    }


}
