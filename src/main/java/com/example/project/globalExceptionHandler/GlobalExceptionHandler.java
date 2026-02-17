package com.example.project.globalExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            NullPointerException.class
    })
    public ResponseEntity<Map<String,Object>> handleValidationErrors(MethodArgumentNotValidException ex){
        logger.info("Exception : {} ",ex.getClass().getName());

        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach( error -> errors.put(error.getField(),error.getDefaultMessage())
        );

        Object enteredData = ex.getBindingResult().getTarget();

        Map<String,Object> response = new HashMap<>();
        response.put("errors",errors);
        response.put("data",enteredData);

        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,String>> handleResourceNotFoundExceptions(ResourceNotFoundException e){
        Map<String,String> error = new HashMap<>();
        logger.info("Exception : {} ",e.getClass().getName());
        error.put("error",e.getMessage());
        return ResponseEntity.notFound().build();

    }


}
