package com.empresa.projeto.projeto_gerenciamento.controller;

import com.empresa.projeto.projeto_gerenciamento.exception.ProductNullException;
import java.util.Map;
import java.util.HashMap;

import com.empresa.projeto.projeto_gerenciamento.exception.ProductPriceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ProjectControllerAdvice extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> captureErrorNull(){
        Map<String,Object> body = new HashMap<String, Object>();
        body.put("message","Verifique os campos do produto");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<Object> captureErrorPrice(){
        Map<String,Object> body = new HashMap<String, Object>();
        body.put("message","Verifique o preço do produto");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
