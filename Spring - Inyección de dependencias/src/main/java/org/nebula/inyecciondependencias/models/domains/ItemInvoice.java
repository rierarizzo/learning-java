package org.nebula.inyecciondependencias.models.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ItemInvoice {
    private Product product;
    private Integer amount;
}
