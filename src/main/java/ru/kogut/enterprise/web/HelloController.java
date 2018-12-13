package ru.kogut.enterprise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String message(Model uiModel, @PathVariable(value = "name") String name) {

        uiModel.addAttribute("name", name);
        return "hello";

    }

    @RequestMapping(method = RequestMethod.GET)
    public String message(Model uiModel) {

        uiModel.addAttribute("name", "Unknown name");
        return "hello";

    }

}