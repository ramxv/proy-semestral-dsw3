package Interfaz;

import SQL.HikariJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaIngresoProductos extends javax.swing.JFrame {
       
       ModificacionDeProducto ventanaModificacion;
       
       private static PantallaIngresoProductos instancia;

           
    public PantallaIngresoProductos() {
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
        tablaRegistroProductos = new javax.swing.JTable();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tablaRegistroProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÒDIGO PRODUCTO ", "NOMBRE", "PRECIO ESTANDAR", "PRECIO DESC."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRegistroProductos);
        if (tablaRegistroProductos.getColumnModel().getColumnCount() > 0) {
            tablaRegistroProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaRegistroProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistroProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistroProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaRegistroProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaRegistroProductos.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel1.setText("Tabla de Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        RegistroDeProductos prObj = new RegistroDeProductos();
        prObj.setVisible(true);
    }//GEN-LAST:event_nuevoRegistroActionPerformed

    private void eliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegistroActionPerformed
        int[] filasSeleccionadas = tablaRegistroProductos.getSelectedRows();

        if (filasSeleccionadas.length > 0) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar los registros seleccionados?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    Connection con = HikariJDBC.getConnection();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM productos WHERE codigoBarra = ?");

                    for (int fila : filasSeleccionadas) {
                        String idCliente = tablaRegistroProductos.getValueAt(fila, 0).toString();
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

    private void modificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRegistroActionPerformed

        String codigo, nombre;
        Double precioEst;
        Double precioDesc;
        
    if (ventanaModificacion == null) {
        try {
            int fila = tablaRegistroProductos.getSelectedRow();
            int idc = Integer.parseInt(tablaRegistroProductos.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = HikariJDBC.getConnection();
            ps = con.prepareStatement("SELECT codigoBarra, nombre, precioEstandar,precioDescuento FROM productos WHERE codigoBarra = ?");
            ps.setInt(1, idc);
            rs = ps.executeQuery();

            while (rs.next()) {
                codigo = rs.getString(1);
                nombre = rs.getString(2);
                precioEst = Double.valueOf(rs.getString(3));
                precioDesc = Double.valueOf(rs.getString(4));


                ventanaModificacion = new ModificacionDeProducto(codigo, nombre, precioEst, precioDesc);
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
        JOptionPane.showMessageDialog(rootPane, "Ya hay una ventana de modificación abierta");
    }

    }//GEN-LAST:event_modificarRegistroActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        cargarTabla();
        JOptionPane.showMessageDialog(rootPane, "Registro actualizado");
    }//GEN-LAST:event_actualizarActionPerformed
    
    public static PantallaIngresoProductos getInstance() {
        if (instancia == null) {
            //instancia = new PantallaIngresoClientes();
        }
        return instancia;
    }
    
    
    public void cargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tablaRegistroProductos.getModel();
        modelo.setRowCount(0);
            
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
         int columnas;
        
        try {
            Connection con = HikariJDBC.getConnection();
            ps = con.prepareStatement("SELECT codigoBarra, nombre, precioEstandar, precioDescuento FROM productos");
            
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
    private javax.swing.JTable tablaRegistroProductos;
    // End of variables declaration//GEN-END:variables
}
