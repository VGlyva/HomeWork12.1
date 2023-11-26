package pro.sky.CalcSpringTwo.CalcSpringTwo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CalcControllerHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public String divideByZero(IllegalArgumentException e,
                               HttpServletResponse response) {
        response.setStatus(400);
        return e.getMessage();
    }
}
