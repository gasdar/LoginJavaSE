package com.rolan.login.igu;

import com.rolan.login.logica.ControladoraLogica;
import com.rolan.login.logica.User;
import javax.swing.JOptionPane;

public class InterManageAdmin extends javax.swing.JFrame {

    private ControladoraLogica control = null;
    private User user = null;
    
    public InterManageAdmin(ControladoraLogica control, User user) {
        initComponents();
        this.control = control;
        this.user = user;
        txtUsername.setText(user.getUsername());
        this.updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnUpdateUsers = new javax.swing.JButton();
        btnSignOff = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

        btnCreateUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCreateUser.setText("Crear Usuario");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnEditUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEditUser.setText("Editar Usuario");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDeleteUser.setText("Eliminar Usuario");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnUpdateUsers.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnUpdateUsers.setText("Actualizar Sistema");
        btnUpdateUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUsersActionPerformed(evt);
            }
        });

        btnSignOff.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSignOff.setText("Cerrar Sesión");
        btnSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOffActionPerformed(evt);
            }
        });

        txtUsername.setEditable(false);
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setText("jTextField1");
        txtUsername.setBorder(null);

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblUsers);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername)
                    .addComponent(btnCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btnUpdateUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btnSignOff, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignOff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        if(InterfaceHelper.userIsActive(control, user)) {
            if(tblUsers.getRowCount() > 0) {
                if(tblUsers.getSelectedRow() != -1) {
                    User userEdit = control.findUserById(Integer.parseInt(String.valueOf(tblUsers.getValueAt(tblUsers.getSelectedRow(), 0))));
                    if(userEdit != null) {
                        InterfaceHelper.redirectEditUser(control, user, userEdit);
                        this.dispose();
                    } else {
                        InterfaceHelper.message("USUARIO NO ENCONTRADO", "El usuario no fue encontrado.", JOptionPane.WARNING_MESSAGE);
                        this.updateTable();
                    }
                } else {
                    InterfaceHelper.message("SIN SELECCIONAR", "Debe seleccionar un registro, para continuar el procedimiento.", JOptionPane.WARNING_MESSAGE);
                    this.updateTable();
                }
            } else {
                InterfaceHelper.message("SIN REGISTROS", "No se han encontrado registros para ser eliminados.", JOptionPane.WARNING_MESSAGE);
                this.updateTable();
            }
        } else {
            InterfaceHelper.userLostConnection(control, this);
        }
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        if(InterfaceHelper.userIsActive(control, user)) {
            // PRIMERO: VALIDAR SI EXISTEN DATOS EN LA TABLA PARA SER ELIMINADOS
            if(tblUsers.getRowCount() > 0) {
                // SEGUNDO: VALIDAR SI SE HA SELECCIONADO UNA FILA
                if(tblUsers.getSelectedRow() > -1) {
                    int userId = Integer.parseInt(tblUsers.getValueAt(tblUsers.getSelectedRow(), 0).toString());
                    String name = tblUsers.getValueAt(tblUsers.getSelectedRow(), 1).toString();
                    boolean isDeleted = control.deleteUser(userId, name);
                    if(isDeleted){
                        InterfaceHelper.message("USUARIO ELIMINADO", "El usuario ha sido eliminado correctamente!", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    InterfaceHelper.message("SIN SELECCIONAR", "Debe seleccionar un registro, para continuar el procedimiento.", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                InterfaceHelper.message("SIN REGISTROS", "No se han encontrado registros para ser eliminados.", JOptionPane.WARNING_MESSAGE);
            }
            this.updateTable();
        } else {
            InterfaceHelper.userLostConnection(control, this);
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnUpdateUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUsersActionPerformed
       // ESTA ACCIÓN NOS PERMITIRÁ CARGAR NUEVAMENTE A LOS USUARIOS EN LA TABLA
       if(InterfaceHelper.userIsActive(control, user)) {
            this.updateTable();
            InterfaceHelper.message("REGISTROS ACTUALIZADOS", "Los registros de la tabla se han actualizado!", JOptionPane.INFORMATION_MESSAGE);
       } else {
           InterfaceHelper.userLostConnection(control, this);
       }
    }//GEN-LAST:event_btnUpdateUsersActionPerformed

    private void btnSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOffActionPerformed
        InterfaceHelper.redirectLogin(control);
        this.dispose();
    }//GEN-LAST:event_btnSignOffActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        if(InterfaceHelper.userIsActive(control, user)) {
            InterfaceHelper.redirectCreateUser(control, user);
            this.dispose();
        } else {
            InterfaceHelper.userLostConnection(control, this);
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed
     
    private void updateTable() {              
       // FINALMENTE ASIGNAMOS EL MODELO A LA TABLA
       tblUsers.setModel(InterfaceHelper.tableCreate(control.findAllUsers()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnSignOff;
    private javax.swing.JButton btnUpdateUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
