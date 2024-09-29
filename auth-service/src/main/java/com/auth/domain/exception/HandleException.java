package com.auth.domain.exception;

import com.auth.domain.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class HandleException extends ResponseEntityExceptionHandler {
    @ExceptionHandler({NoSuchUserExistsException.class})
    public ResponseEntity<ResponseDTO> handleNoSuchUser(Exception e) {
        return ResponseEntity.status(ResponseDTO.Code.NOT_FOUND).body(ResponseDTO.builder().code(ResponseDTO.Code.NOT_FOUND).build());
    }
}
