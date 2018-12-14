package pl.mpas.anotherspringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping({"/", "/home"})
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/me")
    public String me(Model model) {

        model.addAttribute("name", "Mariusz");
        model.addAttribute("surname", "P.");

        return "me";
    }
}
