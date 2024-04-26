package ga.esiitech.schoolapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class ViewController {

    @GetMapping("/ecoles")
    public String ecole() {
        return "ecole";
    }
 }
