package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Calculator calculator;
    public Controller(Calculator calculator){
        this.calculator = calculator;
    }
    @GetMapping(path = "/calculator")
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int i = number1 + number2;
        return  calculator.plus(number1,number2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int i = number1 - number2;
        return  calculator.minus(number1,number2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int i = number1 * number2;
        return calculator.multiply(number1,number2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int i = number1 / number2;
        return calculator.divide(number1, number2);
    }
}
