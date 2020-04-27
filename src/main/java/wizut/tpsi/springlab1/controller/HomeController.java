package wizut.tpsi.springlab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wizut.tpsi.springlab1.model.PersonForm;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeAction(Model model) {
        return "home";
    }

    @RequestMapping("/hello")
    public String helloAction(Model model, String firstName, Integer age) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("age", age);
        return "hello";
    }

    @RequestMapping("/addPerson")
    public String addPersonAction(Model model, PersonForm personForm) {
        model.addAttribute("person", personForm);
        return "person";
    }
}
