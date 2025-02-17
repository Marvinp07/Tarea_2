/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea_2;

/**
 *
 * @author MARVIN
 */
import javax.swing.JOptionPane;

public class Inicio_de_Sesion extends javax.swing.JFrame {


    
    public Inicio_de_Sesion() {
        initComponents();
        txtPassOculto.setVisible(true);
        txtPassVisible.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtPassOculto = new javax.swing.JPasswordField();
        txtPassVisible = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(205, 205, 205));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(10, 144, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INICIO DE SESION");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 360, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 60));

        jPanel4.setBackground(new java.awt.Color(205, 205, 205));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 30));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_delete_30px.png"))); // NOI18N
        exit.setOpaque(true);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 40, 40));

        jLabel2.setBackground(new java.awt.Color(10, 144, 203));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_user_25px_2.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 40, 40));

        jLabel3.setBackground(new java.awt.Color(10, 144, 203));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_password_25px_1.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 40, 40));

        login.setBackground(new java.awt.Color(10, 144, 203));
        login.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("LOGIN");
        login.setOpaque(true);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 270, 40));

        jCheckBox1.setText("Mostrar Contraseña");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(242, 242, 242));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Usuario:");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(true);
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        txt_user.setBackground(new java.awt.Color(242, 242, 242));
        txt_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_user.setBorder(null);
        txt_user.setOpaque(true);
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel5.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, 40));

        jPanel6.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassOculto.setBackground(new java.awt.Color(242, 242, 242));
        txtPassOculto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassOculto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassOculto.setBorder(null);
        txtPassOculto.setOpaque(true);
        jPanel6.add(txtPassOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 150, 40));

        txtPassVisible.setBackground(new java.awt.Color(242, 242, 242));
        txtPassVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassVisible.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassVisible.setBorder(null);
        txtPassVisible.setOpaque(true);
        txtPassVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassVisibleActionPerformed(evt);
            }
        });
        jPanel6.add(txtPassVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 150, 40));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(242, 242, 242));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Contraseña:");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(true);
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
     int a = JOptionPane.YES_NO_OPTION;
     int resultado = JOptionPane.showConfirmDialog(this,"¿Desea Salir", "SALIR",a);
     if (resultado==0){
         System.exit(0);
     }
    }//GEN-LAST:event_exitMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
       String usuario, contraseña=null; 
       usuario=txt_user.getText();
       contraseña=txtPassOculto.getText();
       
       if(usuario.equals("Marvin") && contraseña.equals("202109303")){
           JOptionPane.showMessageDialog(this, "Login Completado...");
           Datos abrir = new Datos();
           abrir.setVisible(true);
           this.setVisible(false);
          
       }else{
           JOptionPane.showMessageDialog(this, "Datos erroneos");
           this.txtPassOculto.setText("");
           this.txtPassVisible.setText("");
       }
       
    }//GEN-LAST:event_loginMouseClicked

    private void txtPassVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassVisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassVisibleActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    
    if(jCheckBox1.isSelected()){
        txtPassVisible.setVisible(true);
        txtPassOculto.setVisible(false);
        txtPassVisible.setText(txtPassOculto.getText());
    }else{
        txtPassVisible.setVisible(false);
        txtPassOculto.setVisible(true);
        txtPassOculto.setText(txtPassVisible.getText());
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_de_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField txtPassOculto;
    private javax.swing.JTextField txtPassVisible;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
