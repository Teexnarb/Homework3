package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;
@Service
public class Calculator {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int number1, int number2) {
        int i = number1 + number2;
        return  number1 +  "+" +number2 + "=" + i;
    }
    public String minus(int number1, int number2) {
        int i = number1 - number2;
        return  number1 +  "-" +number2 + "=" + i;
    }
    public String multiply(int number1,int number2) {
        int i = number1 * number2;
        return number1 + "*" + number2 + "=" + i;
    }
    public String divide(int number1, int number2) {
        int i = number1 / number2;
        return number1 + "/" + number2 + "=" + i;
    }
}
