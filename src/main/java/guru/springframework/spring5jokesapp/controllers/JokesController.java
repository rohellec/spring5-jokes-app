package guru.springframework.spring5jokesapp.controllers;

import guru.springframework.spring5jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        String joke = jokesService.getRandomJoke();
        model.addAttribute("joke", joke);
        return "jokes/index";
    }
}
