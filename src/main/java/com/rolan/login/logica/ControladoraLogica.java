package com.rolan.login.logica;

import com.rolan.login.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladoraLogica {
    
    // El error: cannot find simbol, pasa cuando no se está encontrando
    // una instancia de la clase y se utiliza algún atributo no
    // inicializado, normalmente por falta de constructor que inicialece
    // los atributos necesarios.
    private ControladoraPersistencia controlPersis = null;
    
    public ControladoraLogica() {
        controlPersis = new ControladoraPersistencia();
    }

    // MÉTODOS RELACIONADOS DIRECTAMENTE CON: USER
    public List<User> findAllUsers() {
        return controlPersis.findAllUsers();
    }
    public User findUserById(int userId) {
        return controlPersis.findUserById(userId);
    }
    public User findUserByNameAndPassword(String username, String password) {
        List<User> users = this.findAllUsers();
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
        List<User> users = this.findAllUsers();
        List<User> usersRoleUser = new ArrayList<>();
        for(User user : users) {
            if(!isUserAdmin(user)) {
                usersRoleUser.add(user);
            }
        }
        return usersRoleUser;
    }
    public void createUser(String username, String password, String IsAdmin) {
        List<Role> userRoles = this.findRolesBySearchingIsAdmin(IsAdmin);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRoles(userRoles);
        controlPersis.createUser(user);
    }
    public boolean deleteUser(int userId, String name) {
        int option = JOptionPane.showConfirmDialog(null,
                "¿Desea eliminar el usuario " + name + "?",
                "CONFIRMAR ELIMINACIÓN",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        switch(option) {
            case 0 -> {
                controlPersis.deleteUser(userId);
                return true;
            }
            default -> {
                return false;
            }
        }
    }
    public User editUser(User userEdit, String username, String password, String isAdmin) {
        int option = JOptionPane.showConfirmDialog(null,
                "¿Esta seguro de editar el registro?",
                "CONFIRMAR EDITACIÓN",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        switch(option) {
            case 0 -> {
                List<Role> userRoles = this.findRolesBySearchingIsAdmin(isAdmin);
                userEdit.setUsername(username);
                userEdit.setPassword(password);
                userEdit.setRoles(userRoles);
                controlPersis.editUser(userEdit);
                User userEdited = this.findUserById(userEdit.getId());
                return userEdited;
            }
            default -> {
                return null;
            }
        }
    }
    
    // VERIFICACIONES DE USUARIO
    public boolean isUserAdmin(User u) {
        if(!u.getRoles().isEmpty()) {
            for(Role role : u.getRoles()) {
                if(role.getName().equalsIgnoreCase("role_admin")) {
                    return true;
                }
            }   
        }
        return false;
    }
    
    // MÉTODOS RELACIONADOS DIRECTAMENTE CON: ROLES
    public List<Role> findAllRoles() {
        return controlPersis.findAllRoles();
    }
    public List<Role> findRolesBySearchingIsAdmin(String IsAdmin) {
        List<Role> roles = this.findAllRoles();
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
