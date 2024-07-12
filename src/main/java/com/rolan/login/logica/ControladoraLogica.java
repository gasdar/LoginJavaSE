package com.rolan.login.logica;

import com.rolan.login.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    private ControladoraPersistencia controlPersis = null;
    
    public ControladoraLogica() {
        controlPersis = new ControladoraPersistencia();
    }

    // MÉTODOS RELACIONADOS CON: USER
    public User findUserByNameAndPassword(String username, String password) {
        return null;
    }
    
}
