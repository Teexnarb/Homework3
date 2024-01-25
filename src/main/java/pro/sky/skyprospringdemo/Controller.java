package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculator")
public class Controller {
    private final CalculatorServiceInt calculatorService;
    public Controller(CalculatorServiceInt calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return  number1 +  "+" +number2 + "=" + calculatorService.plus(number1, number2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return  number1 +  "-" +number2 + "=" + calculatorService.minus(number1, number2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + "*" + number2 + "=" + calculatorService.multiply(number1, number2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 +  "/" +number2 + "=" + calculatorService.divide(number1, number2);
    }
}
