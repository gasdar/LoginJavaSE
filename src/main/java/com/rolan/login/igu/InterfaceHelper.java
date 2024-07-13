package com.rolan.login.igu;

import com.rolan.login.logica.ControladoraLogica;
import com.rolan.login.logica.Role;
import com.rolan.login.logica.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InterfaceHelper {
    
    // ESTÁ CLASE CONTIENE MÉTODOS QUE LES PERMITE A LAS INTERFACES
    // COMPARTIR CÓDIGOS PARA FORMATOS Y MÁS
    
    public static void redirectLogin(ControladoraLogica controladoraLogica) {
        InterLogin interLogin = new InterLogin(controladoraLogica);
        interLogin.setVisible(true);
        interLogin.setLocationRelativeTo(null);
    }
    
    public static DefaultTableModel createTable(List<User> users) {
       DefaultTableModel tableModel = headerTable();
       if(!users.isEmpty()) {
            for(User user : users) {
               Object[] obj = {user.getId(), user.getUsername(), roleFormat(user)};
               tableModel.addRow(obj);
            }
       }
       return tableModel;
    }
    
    private static DefaultTableModel headerTable() {
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
    
    private static String roleFormat(User u) {
        StringBuilder sb = new StringBuilder();
        for(Role role : u.getRoles()) {
            sb.append(role.getName().substring(5).toLowerCase()).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }
    
}
