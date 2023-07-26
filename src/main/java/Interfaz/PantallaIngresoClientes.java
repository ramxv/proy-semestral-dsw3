package Interfaz;

//@author royel

import SQL.HikariJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaIngresoClientes extends javax.swing.JFrame {
       String tipo;
       
       PantallaDeModificacion ventanaModificacion;
       
       private static PantallaIngresoClientes instancia;

           
    public PantallaIngresoClientes(String tipo) {
        this.tipo = tipo;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nuevoRegistro = new javax.swing.JButton();
        eliminarRegistro = new javax.swing.JButton();
        modificarRegistro = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistroClientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sublimation");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));

        nuevoRegistro.setBackground(new java.awt.Color(0, 153, 255));
        nuevoRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nuevoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        nuevoRegistro.setText("Nuevo Registro");
        nuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroActionPerformed(evt);
            }
        });

        eliminarRegistro.setBackground(new java.awt.Color(0, 153, 255));
        eliminarRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        eliminarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        eliminarRegistro.setText("Eliminar Registro");
        eliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRegistroActionPerformed(evt);
            }
        });

        modificarRegistro.setBackground(new java.awt.Color(0, 153, 255));
        modificarRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        modificarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        modificarRegistro.setText("Modificar Registro");
        modificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRegistroActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(0, 204, 0));
        actualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizar)
                .addContainerGap(890, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoRegistro)
                    .addComponent(eliminarRegistro)
                    .addComponent(modificarRegistro)
                    .addComponent(actualizar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tablaRegistroClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÉDULA ", "TIPO CLIENTE", "NOMBRE", "FECHA DE NACIMIENTO", "GENERO ", "CORREO", "TELÉFONO", "PROVINCIA", "CIUDAD", "CORREGIMIENTO", "NUMERO MEMBRESIA", "CANTIDAD PROMEDIO GASTADA", "PRODUCTOS FRECUENTES", "DESCUENTO", "ASESOR ASIGNADO", "CANTIDAD CRÉDITO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRegistroClientes);
        if (tablaRegistroClientes.getColumnModel().getColumnCount() > 0) {
            tablaRegistroClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaRegistroClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaRegistroClientes.getColumnModel().getColumn(4).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(5).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(6).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(7).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(8).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(9).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(10).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(11).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(12).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(13).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(14).setResizable(false);
            tablaRegistroClientes.getColumnModel().getColumn(15).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabla de Clientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(530, 530, 530))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegistroActionPerformed
        
            if ("Cliente Ocasional".equals(tipo)) {
                
                RegistroDeClienteOcasional registroOcasional = new RegistroDeClienteOcasional(tipo);
                
                registroOcasional.setVisible(true);
                registroOcasional.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                
            }else if("Cliente Frecuente".equals(tipo)){
                
                RegistroDeClienteFrecuente registroFrecuente = new RegistroDeClienteFrecuente(tipo);
                registroFrecuente.setVisible(true);
                registroFrecuente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                
            }else if("Cliente VIP".equals(tipo)){
                
                RegistroDeClienteVIP registroVIP = new RegistroDeClienteVIP(tipo);
                registroVIP.setVisible(true);
                registroVIP.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                
            }
    }//GEN-LAST:event_nuevoRegistroActionPerformed

    private void eliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegistroActionPerformed
        int[] filasSeleccionadas = tablaRegistroClientes.getSelectedRows();

        if (filasSeleccionadas.length > 0) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar los registros seleccionados?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    Connection con = HikariJDBC.getConnection();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM clientes WHERE cedula = ?");

                    for (int fila : filasSeleccionadas) {
                        String idCliente = tablaRegistroClientes.getValueAt(fila, 0).toString();
                        ps.setString(1, idCliente);
                        ps.addBatch(); // Agrega la consulta a un lote (batch) para ejecución eficiente
                    }

                    int[] resultados = ps.executeBatch(); // Ejecuta el lote de consultas

                    // Verifica los resultados de cada consulta en el lote
                    for (int resultado : resultados) {
                        if (resultado == PreparedStatement.EXECUTE_FAILED) {
                            JOptionPane.showMessageDialog(this, "Error al eliminar registros");
                            return;
                        }
                    }

                    JOptionPane.showMessageDialog(this, "Registros eliminados exitosamente");
                    cargarTabla(); // Actualiza la tabla después de eliminar las tuplas
                } catch (SQLException e) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(this, "Error al eliminar registros");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros seleccionados para eliminar");
        }
    }//GEN-LAST:event_eliminarRegistroActionPerformed

    private String getTipoClienteSeleccionado() {
        int filaSeleccionada = tablaRegistroClientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            return tablaRegistroClientes.getValueAt(filaSeleccionada, 1).toString();
        }
        return null;
    }
    
    
    
    
    private void modificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRegistroActionPerformed

        String cedula, tipoCliente, nombre, fechaNacimiento, genero, correo, telefono, provincia,
                ciudad, corregimiento, numMembresia, cantidadPromedioGastada, productosFrecuentes,
                descuento, asesorAsignado, cantidadCredito;

        // Obtener el tipo de cliente seleccionado en la tabla
        String tipoClienteSeleccionado = getTipoClienteSeleccionado();

        // Verificar si hay una ventana de modificación abierta
        if (ventanaModificacion == null) {
            // Verificar si el tipo de cliente seleccionado coincide con el tipo de cliente de la ventana actual
            if (tipoClienteSeleccionado != null && tipoClienteSeleccionado.equals(tipo)) {
                // Si coinciden, proceder a abrir la ventana de modificación
                try {
                    int fila = tablaRegistroClientes.getSelectedRow();
                    int idc = Integer.parseInt(tablaRegistroClientes.getValueAt(fila, 0).toString());

                    PreparedStatement ps;
                    ResultSet rs;

                    Connection con = HikariJDBC.getConnection();
                    ps = con.prepareStatement("SELECT cedula, tipoCliente, nombre, fechaNacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, numMembresia, cantidadPromedioGastada, productosFrecuentes, descuento, asesorAsignado, cantidadCredito FROM clientes WHERE cedula = ?");
                    ps.setInt(1, idc);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        cedula = rs.getString(1);
                        tipoCliente = rs.getString(2);
                        nombre = rs.getString(3);
                        fechaNacimiento = rs.getString(4);
                        genero = rs.getString(5);
                        correo = rs.getString(6);
                        telefono = rs.getString(7);
                        provincia = rs.getString(8);
                        ciudad = rs.getString(9);
                        corregimiento = rs.getString(10);
                        numMembresia = rs.getString(11);
                        cantidadPromedioGastada = rs.getString(12);
                        productosFrecuentes = rs.getString(13);
                        descuento = rs.getString(14);
                        asesorAsignado = rs.getString(15);
                        cantidadCredito = rs.getString(16);

                        ventanaModificacion = new PantallaDeModificacion(
                                cedula, nombre, fechaNacimiento, genero, correo, telefono, provincia,
                                ciudad, corregimiento, numMembresia, cantidadPromedioGastada, productosFrecuentes,
                                descuento, asesorAsignado, cantidadCredito, tipo
                        );
                        ventanaModificacion.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        ventanaModificacion.setVisible(true);
                        ventanaModificacion.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                                ventanaModificacion = null;
                            }
                        });
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }

            } else {
                // Si los tipos de cliente no coinciden, mostrar mensaje de error
                JOptionPane.showMessageDialog(rootPane, "Para poder editar debe cambiar el tipo de cliente antes de mostrar la ventana de modificación.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ya hay una ventana de modificación abierta");
        }
    }//GEN-LAST:event_modificarRegistroActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        cargarTabla();
        JOptionPane.showMessageDialog(rootPane, "Registro actualizado");
    }//GEN-LAST:event_actualizarActionPerformed
    
    public static PantallaIngresoClientes getInstance() {
        if (instancia == null) {
            //instancia = new PantallaIngresoClientes();
        }
        return instancia;
    }
    
    
    public void cargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tablaRegistroClientes.getModel();
        modelo.setRowCount(0);
            
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
         int columnas;
        
        try {
            Connection con = HikariJDBC.getConnection();
            ps = con.prepareStatement("SELECT cedula, tipoCliente, nombre, fechaNacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, numMembresia, cantidadPromedioGastada, productosFrecuentes, descuento, asesorAsignado, cantidadCredito FROM clientes");
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData(); 
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object [] fila = new Object[columnas];
                
                for(int indice=0; indice<columnas; indice++){
                    fila[indice] = rs.getObject(indice + 1);
                }
                
                modelo.addRow(fila);
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
       
    }
    
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
            java.util.logging.Logger.getLogger(PantallaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PantallaIngresoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton eliminarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarRegistro;
    private javax.swing.JButton nuevoRegistro;
    private javax.swing.JTable tablaRegistroClientes;
    // End of variables declaration//GEN-END:variables
}
