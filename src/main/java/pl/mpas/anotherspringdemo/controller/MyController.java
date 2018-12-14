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

    @GetMapping("/car")
    public String myFavoriteCar(Model model) {

        model.addAttribute("brand", "Saab");
        model.addAttribute("model", "93");

        return "car";
    }
}
