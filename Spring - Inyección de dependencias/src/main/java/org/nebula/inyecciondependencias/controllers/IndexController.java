package org.nebula.inyecciondependencias.controllers;

import org.nebula.inyecciondependencias.models.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("myMoreComplexService")
    private IService myService;

    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("description", myService.operation());
        return "index";
    }

}
