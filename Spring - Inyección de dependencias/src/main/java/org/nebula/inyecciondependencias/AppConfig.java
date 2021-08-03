package org.nebula.inyecciondependencias;

import java.util.Arrays;
import java.util.List;

import org.nebula.inyecciondependencias.models.domains.ItemInvoice;
import org.nebula.inyecciondependencias.models.domains.Product;
import org.nebula.inyecciondependencias.models.services.IService;
import org.nebula.inyecciondependencias.models.services.MyMoreComplexService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean("myMoreComplexService")
    public IService registerMyMoreComplexService() {
        return new MyMoreComplexService();
    }

    @Bean
    public List<ItemInvoice> registerItems() {
        return Arrays.asList(
            new ItemInvoice(new Product("Guitarra Ibanez", 300.50), 2),
            new ItemInvoice(new Product("Laptop Lenovo", 700.75), 4)
        );
    }

}
