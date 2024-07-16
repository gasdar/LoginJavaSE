package com.rolan.login.persistencia;

import com.rolan.login.logica.Role;
import com.rolan.login.logica.User;
import com.rolan.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<User> findAllUsers() {
        return userJpa.findUserEntities();
    }
    public User findUserById(int userId) {
        return userJpa.findUser(userId);
    }
    public void createUser(User user) {
        userJpa.create(user);
    }
    public void deleteUser(int userId) {
        try {
            userJpa.destroy(userId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editUser(User user) {
        try {
            userJpa.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // MÉTODOS CRUD DE: ROLE JPA
    public List<Role> findAllRoles() {
        return roleJpa.findRoleEntities();
    }
    
}
