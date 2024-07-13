package com.rolan.login.logica;

import com.rolan.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    // El error: cannot find simbol, pasa cuando no se está encontrando
    // una instancia de la clase y se utiliza algún atributo no
    // inicializado, normalmente por falta de constructor que inicialece
    // los atributos necesarios.
    private ControladoraPersistencia controlPersis = null;
    
    public ControladoraLogica() {
        controlPersis = new ControladoraPersistencia();
    }

    // MÉTODOS RELACIONADOS CON: USER
    public User findUserByNameAndPassword(String username, String password) {
        List<User> users = controlPersis.findUsers();
        User user = null;
        if(!users.isEmpty()) {
            for(User u : users) {
                if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                    user = u;
                    break;
                }
            }
        }
        return user;
    }

    // VERIFICACIONES DE USUARIOS
    public boolean isUserAdmin(User u) {
        if(!u.getRoles().isEmpty()) {
            for(Role role : u.getRoles()) {
                if(role.getName().equals("ROLE_ADMIN")) {
                    return true;
                }
            }   
        }
        return false;
    }
    
}
