package org.nebula.inyecciondependencias.models.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Product {
    private String name;
    private Double price;
}
