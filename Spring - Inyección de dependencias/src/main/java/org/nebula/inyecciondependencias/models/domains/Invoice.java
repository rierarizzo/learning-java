package org.nebula.inyecciondependencias.models.domains;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component
public class Invoice {
    @Value("${invoice.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    private List<ItemInvoice> items;
}
