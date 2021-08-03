package org.nebula.inyecciondependencias.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("myComplexService")
public class MyComplexService implements IService {
    
    @Override
    public String operation() {
        return "Ejecutando algun proceso complicado...";
    }

}
