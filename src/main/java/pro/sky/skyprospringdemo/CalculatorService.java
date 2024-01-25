package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;
@Service
public class CalculatorService implements CalculatorServiceInt  {
    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    public int plus(int number1, int number2) {
        return number1+number2;
    }
    public int minus(int number1, int number2) {
        return number1-number2;
    }
    public int multiply(int number1, int number2) {
        return number1*number2;
    }
    public int divide(int number1, int number2) {
        return number1/number2;
    }
}
