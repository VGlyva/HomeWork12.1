package pro.sky.CalcSpringTwo.CalcSpringTwo.service;

public interface CalcService {
    String helloCalculator();

    Integer plusCalc(Integer num1, Integer num2);

    Integer minusCalc(Integer num1, Integer num2);

    Integer multiply(Integer num1, Integer num2);

    Double divide(Integer num1, Integer num2);
}
