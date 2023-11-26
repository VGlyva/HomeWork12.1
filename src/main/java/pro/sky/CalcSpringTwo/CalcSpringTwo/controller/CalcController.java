package pro.sky.CalcSpringTwo.CalcSpringTwo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import pro.sky.CalcSpringTwo.CalcSpringTwo.service.CalcService;

@RequestMapping("/calculator")
@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }


    @GetMapping
    public String helloCalculator() {
        return calcService.helloCalculator();
    }

    @GetMapping("/plus")
    public String plusCalc(@RequestParam("num1") Integer num1,
                           @RequestParam("num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calcService.plusCalc(num1, num2);
    }

    @GetMapping("/minus")
    public String minusCalc(@RequestParam("num1") Integer num1,
                            @RequestParam("num2") Integer num2) {
        return num1 + " - " + num2 + " = " + calcService.minusCalc(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1,
                           @RequestParam("num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calcService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1,
                         @RequestParam("num2") Integer num2) {
        return num1 + " / " + num2 + " = " + calcService.divide(num1, num2);
    }

}
