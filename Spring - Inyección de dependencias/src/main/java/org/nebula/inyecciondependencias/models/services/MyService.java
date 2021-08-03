package org.nebula.inyecciondependencias.models.services;

import org.springframework.stereotype.Service;

@Service("myService")
public class MyService implements IService {
    
    @Override
    public String operation() {
        return "Ejecutando algun proceso...";
    }

}
