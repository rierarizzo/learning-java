package org.nebula.inyecciondependencias.controllers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.nebula.inyecciondependencias.models.domains.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/invoice")
@RequestScope
public class InvoiceController {

    @Autowired
    private Invoice invoice;
    
    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("title", "Ejemplo de factura | Inyeccion de dependencias con Spring Boot");
        model.addAttribute("invoice", invoice);
        return "invoice/view";
    }

    /* Ciclo de vida de un componente */

    @PostConstruct
    public void init() {
        log.info("Component Invoice initialized.");
    }

    @PreDestroy
    public void destroy() {
        log.info("Component Invoice destroyed.");
    }
    
}
