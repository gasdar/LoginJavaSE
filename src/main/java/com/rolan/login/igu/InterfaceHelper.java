package com.rolan.login.igu;

import com.rolan.login.logica.ControladoraLogica;
import com.rolan.login.logica.Role;
import com.rolan.login.logica.User;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfaceHelper {

    // ESTÁ CLASE CONTIENE MÉTODOS QUE LES PERMITE A LAS INTERFACES
    // COMPARTIR CÓDIGOS PARA FORMATOS Y MÁS
    public static void redirectLogin(ControladoraLogica controladoraLogica) {
        InterLogin interLogin = new InterLogin(controladoraLogica);
        interLogin.setVisible(true);
        interLogin.setLocationRelativeTo(null);
    }
    public static void redirectManageAdmin(ControladoraLogica control, User user) {
        InterManageAdmin ima = new InterManageAdmin(control, user);
        ima.setVisible(true);
        ima.setLocationRelativeTo(null);
    }
    public static void redirectManageUser(ControladoraLogica control, User user) {
        InterManageUser imu = new InterManageUser(control, user);
        imu.setVisible(true);
        imu.setLocationRelativeTo(null);
    }
    public static void redirectCreateUser(ControladoraLogica control, User user) {
        InterCreateUser interCreateUser = new InterCreateUser(control, user);
        interCreateUser.setVisible(true);
        interCreateUser.setLocationRelativeTo(null);
    }
    public static void redirectEditUser(ControladoraLogica control, User user, User userEdit) {
        InterEditUser interEditUser = new InterEditUser(control, user, userEdit);
        interEditUser.setVisible(true);
        interEditUser.setLocationRelativeTo(null);
    }

    public static DefaultTableModel tableCreate(List<User> users) {
        DefaultTableModel tableModel = tableHeader();
        if (!users.isEmpty()) {
            for (User user : users) {
                Object[] obj = {user.getId(), user.getUsername(), roleFormat(user)};
                tableModel.addRow(obj);
            }
        }
        return tableModel;
    }
    private static DefaultTableModel tableHeader() {
        // ESTA ACCIÓN NOS PERMITIRÁ CARGAR A LOS USUARIOS EN LA TABLA
        // PARA INGRESAR DATOS A LA TABLA 'SWING', HAY QUE CREAR UN MODELO DE TABLA
        DefaultTableModel tableModel = new DefaultTableModel() {
            // Esta sobreescritura del método es para que no se pueda editar la tabla
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // CREAR LOS TÍTULOS DE LA TABLA Y ASIGNARLO AL MODELO
        String[] titulos = {"Id", "Usuario", "Roles"};
        tableModel.setColumnIdentifiers(titulos);
        return tableModel;
    }

    // Entrega la cadena de caracteres de la password del usuario
    public static String userPassword(char[] password) {
        StringBuilder sb = new StringBuilder();
        for(char pass : password) {
            sb.append(pass);
        }
        return sb.toString();
    }
    public static boolean userIsActive(ControladoraLogica control, User user) {
        List<User> users = control.findAllUsers();
        for(User u : users) {
            // Prueba para verificar si el usuario aún sigue en el sistema.
            /*System.out.println("Usuario encontrado - Id: " + u.getId() + " - Nombre: " + u.getUsername());
            System.out.println("Usuario instancia - Id: " + user.getId() + " - Nombre: " + user.getUsername());
            System.out.println("*****************************************");*/
            if(u.getId() == user.getId()) {
                return true;
            }
        }
        return false;
    }
    public static void userLostConnection(ControladoraLogica control, InterManageUser interManageUser) {
        message("CONEXIÓN PERDIDA", "Lo sentimos, se ha perdido la conexión", JOptionPane.ERROR_MESSAGE);
        redirectLogin(control);
        interManageUser.dispose();
    }
    public static void userLostConnection(ControladoraLogica control, InterManageAdmin interManageAdmin) {
        message("CONEXIÓN PERDIDA", "Lo sentimos, se ha perdido la conexión", JOptionPane.ERROR_MESSAGE);
        redirectLogin(control);
        interManageAdmin.dispose();
    }
    public static void userLostConnection(ControladoraLogica control, InterCreateUser interCreateUser) {
        message("CONEXIÓN PERDIDA", "Lo sentimos, se ha perdido la conexión", JOptionPane.ERROR_MESSAGE);
        redirectLogin(control);
        interCreateUser.dispose();
    }
    public static void userLostConnection(ControladoraLogica control, InterEditUser interEditUser) {
        message("CONEXIÓN PERDIDA", "Lo sentimos, se ha perdido la conexión", JOptionPane.ERROR_MESSAGE);
        redirectLogin(control);
        interEditUser.dispose();
    }

    private static String roleFormat(User u) {
        StringBuilder sb = new StringBuilder();
        for (Role role : u.getRoles()) {
            sb.append(role.getName().substring(5).toLowerCase()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
    
    public static void message(String t, String m, int option){
        switch(option) {
            case JOptionPane.INFORMATION_MESSAGE -> JOptionPane.showMessageDialog(null, m, t, JOptionPane.INFORMATION_MESSAGE);
            case JOptionPane.WARNING_MESSAGE -> JOptionPane.showMessageDialog(null, m, t, JOptionPane.WARNING_MESSAGE);
            case JOptionPane.ERROR_MESSAGE -> JOptionPane.showMessageDialog(null, m, t, JOptionPane.ERROR_MESSAGE);
            default -> JOptionPane.showMessageDialog(null, m, t, JOptionPane.PLAIN_MESSAGE);
        }
    }

}
