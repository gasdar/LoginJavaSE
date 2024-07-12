package com.rolan.login.persistencia;

import com.rolan.login.logica.User;
import java.util.ArrayList;

public class ControladoraPersistencia {
    
    // ATRIBUTOS DE CLASES JPA QUE REALIZAN OPERACIONES CRUD
    private UserJpaController userJpa = null;
    
    // CONSTRUCTOR QUE COMUNICA LA PERSISTENCIA Y TODAS LAS SOLICITUDES JPAs
    public ControladoraPersistencia() {
        userJpa = new UserJpaController();
    }
    
    // MÉTODOS DE: USER JPA
    /*public ArrayList<User> findUsers() {
        return (ArrayList) userJpa.findUserEntities();
    }*/
    
}
