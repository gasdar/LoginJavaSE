package com.rolan.login.persistencia;

import com.rolan.login.logica.User;
import java.util.List;

public class ControladoraPersistencia {
    
    // ATRIBUTOS DE CLASES JPA QUE REALIZAN OPERACIONES CRUD
    private UserJpaController userJpa = null;
    private RoleJpaController roleJpa = null;
    
    // CONSTRUCTOR QUE COMUNICA LA PERSISTENCIA Y TODAS LAS SOLICITUDES JPAs
    public ControladoraPersistencia() {
        userJpa = new UserJpaController();
        roleJpa = new RoleJpaController();
    }
    
    // MÉTODOS CRUD DE: USER JPA
    public List<User> findUsers() {
        return userJpa.findUserEntities();
    }
    
}
