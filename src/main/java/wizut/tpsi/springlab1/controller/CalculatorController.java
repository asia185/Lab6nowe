package wizut.tpsi.springlab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wizut.tpsi.springlab1.model.CalculatorForm;

@Controller
public class CalculatorController {

    @RequestMapping("/add")
    public String addAction(Model model, CalculatorForm calculatorForm) {
        Integer a = calculatorForm.getA();
        Integer b = calculatorForm.getB();

        calculatorForm.setOp("+");
        model.addAttribute("calculator", calculatorForm);
        model.addAttribute("res", a + b);

        return "calculator";
    }

    @RequestMapping("/calculator")
    public String calcualtorAction(Model model, CalculatorForm calculatorForm) {
        String op = calculatorForm.getOp();

        Integer a = calculatorForm.getA();
        Integer b = calculatorForm.getB();

        model.addAttribute("calculator", calculatorForm);
        if (op.equals("+")) {
            model.addAttribute("res", a + b);
        } else if (op.equals("-")) {
            model.addAttribute("res", a - b);
        } else {
            model.addAttribute("res", a * b);
        }

        return "calculator";
    }
}
