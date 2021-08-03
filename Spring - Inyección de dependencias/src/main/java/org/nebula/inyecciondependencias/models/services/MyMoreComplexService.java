package org.nebula.inyecciondependencias.models.services;

public class MyMoreComplexService implements IService {
    
    @Override
    public String operation() {
        return "Ejecutando algun proceso mucho mas complicado...";
    }

}
