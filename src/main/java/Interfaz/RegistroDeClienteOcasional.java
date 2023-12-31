package Interfaz;

import SQL.HikariJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroDeClienteOcasional extends javax.swing.JFrame {

    
    String tipoO;
    public RegistroDeClienteOcasional(String tipo) {
        this.tipoO = tipo;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombreClienteOcasional = new javax.swing.JTextField();
        fechaNacimientoClienteOcasional = new javax.swing.JTextField();
        telefonoClienteOcasional = new javax.swing.JTextField();
        correoClienteOcasional = new javax.swing.JTextField();
        registrarO = new javax.swing.JButton();
        cancelarO = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cedulaClienteOcasional = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        generoClienteOcasional = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        provinciaClienteOcasional = new javax.swing.JTextField();
        ciudadClienteOcasional = new javax.swing.JTextField();
        corregimientoClienteOcasional = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Cliente Ocasional");

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Cliente Ocasional");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(142, 142, 142))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Fecha de nacimiento:");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Teléfono:");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Correo:");

        nombreClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        nombreClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteOcasionalActionPerformed(evt);
            }
        });

        fechaNacimientoClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        fechaNacimientoClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        fechaNacimientoClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoClienteOcasionalActionPerformed(evt);
            }
        });

        telefonoClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        telefonoClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        telefonoClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoClienteOcasionalActionPerformed(evt);
            }
        });

        correoClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        correoClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        correoClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoClienteOcasionalActionPerformed(evt);
            }
        });

        registrarO.setBackground(new java.awt.Color(0, 153, 204));
        registrarO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        registrarO.setForeground(new java.awt.Color(255, 255, 255));
        registrarO.setText("Registrar");
        registrarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarOActionPerformed(evt);
            }
        });

        cancelarO.setBackground(new java.awt.Color(153, 0, 0));
        cancelarO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cancelarO.setForeground(new java.awt.Color(255, 255, 255));
        cancelarO.setText("Cancelar");
        cancelarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarOActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Cédula:");

        cedulaClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cedulaClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        cedulaClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteOcasionalActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("Género:");

        generoClienteOcasional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        generoClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoClienteOcasionalActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Provincia:");

        provinciaClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        provinciaClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        provinciaClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaClienteOcasionalActionPerformed(evt);
            }
        });

        ciudadClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ciudadClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        ciudadClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadClienteOcasionalActionPerformed(evt);
            }
        });

        corregimientoClienteOcasional.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        corregimientoClienteOcasional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        corregimientoClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corregimientoClienteOcasionalActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("Ciudad:");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 204));
        jLabel18.setText("Corregimiento:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(registrarO)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelarO)
                                    .addComponent(fechaNacimientoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(correoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cedulaClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefonoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(provinciaClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ciudadClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(corregimientoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nombreClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cedulaClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fechaNacimientoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(telefonoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(generoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(provinciaClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(correoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ciudadClienteOcasional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrarO)
                            .addComponent(cancelarO)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corregimientoClienteOcasional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteOcasionalActionPerformed

    }//GEN-LAST:event_nombreClienteOcasionalActionPerformed

    private void fechaNacimientoClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoClienteOcasionalActionPerformed

    private void telefonoClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoClienteOcasionalActionPerformed

    private void correoClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoClienteOcasionalActionPerformed

    private void registrarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarOActionPerformed

        String nombreCO = nombreClienteOcasional.getText();
        String cedulaCO = cedulaClienteOcasional.getText();
        String fechaNacimientoCO = fechaNacimientoClienteOcasional.getText();
        String telefonoCO = telefonoClienteOcasional.getText();
        String generoCO = (String) generoClienteOcasional.getSelectedItem();
        String provinciaCO = provinciaClienteOcasional.getText();
        String correoCO = correoClienteOcasional.getText();
        String ciudadCO = ciudadClienteOcasional.getText();
        String corregimientoCO = ciudadClienteOcasional.getText();
        

        try{
            Connection con = HikariJDBC.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO clientes(cedula, tipoCliente, nombre, fechaNacimiento, genero, correo, telefono, provincia, ciudad, corregimiento) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cedulaCO);
            ps.setString(2,tipoO);
            ps.setString(3,nombreCO);
            ps.setString(4,fechaNacimientoCO);
            ps.setString(5,generoCO);
            ps.setString(6, correoCO);
            ps.setString(7, telefonoCO);
            ps.setString(8, provinciaCO);
            ps.setString(9, ciudadCO);
            ps.setString(10, corregimientoCO);
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
            PantallaIngresoClientes pantallaIngreso = PantallaIngresoClientes.getInstance();

            //pantallaIngreso.cargarTabla();

            if (pantallaIngreso != null) {
                pantallaIngreso.cargarTabla();
            }

            ps.close();
            con.close();

            dispose();

        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_registrarOActionPerformed

    private void cancelarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarOActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarOActionPerformed

    private void cedulaClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaClienteOcasionalActionPerformed

    private void generoClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoClienteOcasionalActionPerformed
        String genero[] = {"M", "F"};

        for (String g : genero) {
            generoClienteOcasional.addItem(g);
        }
    }//GEN-LAST:event_generoClienteOcasionalActionPerformed

    private void provinciaClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaClienteOcasionalActionPerformed

    private void ciudadClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadClienteOcasionalActionPerformed

    private void corregimientoClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corregimientoClienteOcasionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corregimientoClienteOcasionalActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeClienteOcasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClienteOcasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClienteOcasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClienteOcasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RegistroDeClienteOcasional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarO;
    private javax.swing.JTextField cedulaClienteOcasional;
    private javax.swing.JTextField ciudadClienteOcasional;
    private javax.swing.JTextField corregimientoClienteOcasional;
    private javax.swing.JTextField correoClienteOcasional;
    private javax.swing.JTextField fechaNacimientoClienteOcasional;
    private javax.swing.JComboBox<String> generoClienteOcasional;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombreClienteOcasional;
    private javax.swing.JTextField provinciaClienteOcasional;
    private javax.swing.JButton registrarO;
    private javax.swing.JTextField telefonoClienteOcasional;
    // End of variables declaration//GEN-END:variables
}
