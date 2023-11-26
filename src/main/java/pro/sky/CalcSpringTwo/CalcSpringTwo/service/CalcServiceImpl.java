package pro.sky.CalcSpringTwo.CalcSpringTwo.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer plusCalc(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minusCalc(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) throw new IllegalArgumentException("На ноль делить нельзя");
        return num1.doubleValue() / num2.doubleValue();
    }
}
