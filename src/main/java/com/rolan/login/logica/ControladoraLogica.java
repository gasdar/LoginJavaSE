package com.rolan.login.logica;

import com.rolan.login.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
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
    public List<User> findAllUsers() {
        return controlPersis.findUsers();
    }
    public User findUserByNameAndPassword(String username, String password) {
        List<User> users = findAllUsers();
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
    public List<User> findAllUsersWithoutAdmin() {
        List<User> users = findAllUsers();
        List<User> usersRoleUser = new ArrayList<>();
        for(User user : users) {
            if(!isUserAdmin(user)) {
                usersRoleUser.add(user);
            }
        }
        return usersRoleUser;
    }
    // VERIFICACIONES DE USUARIO
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

    public void createUser(String username, String password, String IsAdmin) {
        List<Role> userRoles = findRolBySearchingIsAdmin(IsAdmin);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRoles(userRoles);
        controlPersis.createUser(user);
    }
    
    public List<Role> findRolBySearchingIsAdmin(String IsAdmin) {
        List<Role> roles = controlPersis.findRoles();
        List<Role> userRoles = new ArrayList<>();
        for(Role role : roles) {
            if(role.getName().equalsIgnoreCase("role_admin") && IsAdmin.equalsIgnoreCase("no")) {
                continue;
            }
            userRoles.add(role);
        }
        return userRoles;
    }
    
}
