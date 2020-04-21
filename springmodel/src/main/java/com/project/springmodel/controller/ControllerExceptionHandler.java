package com.project.springmodel.controller;

import com.project.springmodel.transversal.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.UUID;

@ControllerAdvice
public class ControllerExceptionHandler {
    private static final Logger logger = LogManager.getLogger(ControllerExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    Response<Object> ExceptionHandler(Exception e) {
        String idFailure = UUID.randomUUID().toString();

        System.setProperty("idRequest", idFailure);

        Response<Object> response = new Response<>();

        response.setMessage("Errorcito");
        response.setIsWarning(false);
        response.setIsSuccess(false);

        logger.fatal(e.getMessage(), e);

        return response;
    }
}
