package Interfaz;

import Clientes.Compras;
import SQL.HikariJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compra extends javax.swing.JFrame {

    double precios[] = {2.60, 2.74, 2.60, 2.25, 2.25, 2.00, 2.00};
    double precio = 0;
    int cantidad = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Compras> listaCompra = new ArrayList<Compras>();

    public Compra() {
        initComponents();
        cargarTabla();
        // Llama a calcularPrecio() después de inicializar el ComboBox y la tabla.
        //calcularPrecio();
    }

    public void cargarDatosDesdeDB() {
        try {
            Connection con = HikariJDBC.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT numeroDeCompra, productosComprados, costoTotal FROM compras");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String numeroCompra = rs.getString("numeroDeCompra");
                String productosComprados = rs.getString("productosComprados");
                String costoTotal = rs.getString("costoTotal");

                Object[] fila = {numeroCompra, productosComprados, costoTotal};
                modelo.addRow(fila);
            }

            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cancelar = new javax.swing.JButton();
    jLabel17 = new javax.swing.JLabel();
    botonRegistrar1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    numerodeCompra = new javax.swing.JLabel();
    cajaNumeroCompra = new javax.swing.JTextField();
    Cliente = new javax.swing.JLabel();
    cajaCliente = new javax.swing.JTextField();
    Producto = new javax.swing.JLabel();
    ProductosComboBox = new javax.swing.JComboBox<>();
    botonRegistrar = new javax.swing.JButton();
    Cancelar = new javax.swing.JButton();
    ITBMS = new javax.swing.JLabel();
    CostoTotal = new javax.swing.JLabel();
    Precio = new javax.swing.JLabel();
    precioUni = new javax.swing.JLabel();
    costototal = new javax.swing.JLabel();
    itbms = new javax.swing.JLabel();
    SpinnerCantidad = new javax.swing.JSpinner();
    cantidadComprada = new javax.swing.JLabel();
    EliminarDato = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaCompra = new javax.swing.JTable();

    cancelar.setBackground(new java.awt.Color(153, 0, 0));
    cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    cancelar.setForeground(new java.awt.Color(255, 255, 255));
    cancelar.setText("Cancelar");
    cancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cancelarActionPerformed(evt);
      }
    });

    jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(0, 153, 204));
    jLabel17.setText("ITBMS");

    botonRegistrar1.setBackground(new java.awt.Color(0, 153, 204));
    botonRegistrar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    botonRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
    botonRegistrar1.setText("Registrar");
    botonRegistrar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonRegistrar1ActionPerformed(evt);
      }
    });

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel2.setBackground(new java.awt.Color(0, 153, 255));
    jPanel2.setForeground(new java.awt.Color(255, 255, 255));

    jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Compras");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(252, 252, 252)
        .addComponent(jLabel3)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    numerodeCompra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    numerodeCompra.setForeground(new java.awt.Color(0, 153, 255));
    numerodeCompra.setText("Nº de Compra:");

    cajaNumeroCompra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    cajaNumeroCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
    cajaNumeroCompra.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cajaNumeroCompraActionPerformed(evt);
      }
    });

    Cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    Cliente.setForeground(new java.awt.Color(0, 153, 204));
    Cliente.setText("Cliente:");

    cajaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    cajaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
    cajaCliente.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cajaClienteActionPerformed(evt);
      }
    });

    Producto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    Producto.setForeground(new java.awt.Color(0, 153, 204));
    Producto.setText("Producto:");

    ProductosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FULA", "CHIVOPERRO", "TRES TRISTES TIGRES", "INDIA DORMIDA", "VERANERA", "MANGOSE", "GRAND CRU" }));
    ProductosComboBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ProductosComboBoxActionPerformed(evt);
      }
    });

    botonRegistrar.setBackground(new java.awt.Color(0, 153, 204));
    botonRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
    botonRegistrar.setText("Registrar");
    botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonRegistrarActionPerformed(evt);
      }
    });

    Cancelar.setBackground(new java.awt.Color(153, 0, 0));
    Cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    Cancelar.setForeground(new java.awt.Color(255, 255, 255));
    Cancelar.setText("Cancelar");
    Cancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CancelarActionPerformed(evt);
      }
    });

    ITBMS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    ITBMS.setForeground(new java.awt.Color(0, 153, 204));
    ITBMS.setText("ITBMS:");

    CostoTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    CostoTotal.setForeground(new java.awt.Color(0, 153, 204));
    CostoTotal.setText("Costo Total:");

    Precio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    Precio.setForeground(new java.awt.Color(0, 153, 204));
    Precio.setText("Precio:");

    precioUni.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    precioUni.setForeground(new java.awt.Color(0, 153, 204));
    precioUni.setText("$ 00.00");

    costototal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    costototal.setForeground(new java.awt.Color(0, 153, 204));
    costototal.setText("00.00");

    itbms.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    itbms.setForeground(new java.awt.Color(0, 153, 204));
    itbms.setText("00.00");

    SpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
    SpinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        SpinnerCantidadStateChanged(evt);
      }
    });

    cantidadComprada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    cantidadComprada.setForeground(new java.awt.Color(0, 153, 204));
    cantidadComprada.setText("Cantidad Comprada: ");

    EliminarDato.setBackground(new java.awt.Color(153, 0, 0));
    EliminarDato.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
    EliminarDato.setForeground(new java.awt.Color(255, 255, 255));
    EliminarDato.setText("Eliminar Dato");
    EliminarDato.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        EliminarDatoActionPerformed(evt);
      }
    });

    tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null}
      },
      new String [] {
        "Numero de Compra", "Producto Comprado", "Precio"
      }
    ));
    jScrollPane2.setViewportView(tablaCompra);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(34, 34, 34)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(Producto)
              .addGroup(layout.createSequentialGroup()
                .addComponent(cantidadComprada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(cajaNumeroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(ProductosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioUni))
              .addGroup(layout.createSequentialGroup()
                .addComponent(ITBMS)
                .addGap(18, 18, 18)
                .addComponent(itbms))
              .addGroup(layout.createSequentialGroup()
                .addComponent(CostoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costototal)))
            .addContainerGap(172, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(numerodeCompra)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(botonRegistrar)
                .addGap(112, 112, 112)
                .addComponent(EliminarDato)
                .addGap(29, 29, 29)
                .addComponent(Cancelar)))
            .addGap(0, 171, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(numerodeCompra)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cajaNumeroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(cajaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(Cliente))
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(Producto)
              .addComponent(Precio)
              .addComponent(precioUni))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ProductosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(ITBMS)
            .addComponent(itbms)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(CostoTotal)
              .addComponent(costototal)))
          .addGroup(layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cantidadComprada)
              .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(botonRegistrar)
          .addComponent(EliminarDato)
          .addComponent(Cancelar))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(33, 33, 33))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroCompraActionPerformed

    }//GEN-LAST:event_cajaNumeroCompraActionPerformed

    private void cajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaClienteActionPerformed

    }//GEN-LAST:event_cajaClienteActionPerformed

    private void ProductosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosComboBoxActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_ProductosComboBoxActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        String numeroCompra = cajaNumeroCompra.getText();
        String cliente = cajaCliente.getText();
        String productos = (String) ProductosComboBox.getSelectedItem();
        Double costoTotal = Double.valueOf(costototal.getText());
        Double ITBMS = Double.valueOf(itbms.getText());
        Double precios = Double.valueOf(precioUni.getText());

        try {
            Connection con = HikariJDBC.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO compras(numeroDeCompra, cliente, productosComprados, costoTotal, ITBMS, precio) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, numeroCompra);
            ps.setString(2, cliente);
            ps.setString(3, productos);
            ps.setDouble(4, costoTotal);
            ps.setDouble(5, ITBMS);
            ps.setDouble(6, precios);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");

            // Llama al método cargarTabla() para actualizar la tabla con los nuevos datos
            cargarTabla();

            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el registro: " + e.toString());
            JOptionPane.showMessageDialog(null, "Error al guardar el registro");
        }

        ///////////////////////
        /*ompras c = new Compras();
        c.setProducto(ProductosComboBox.getSelectedItem().toString());
        c.setPrecio(precio);
        listaCompra.add(c);
        actualizarTabla();
        borrarCompra();*/

    }//GEN-LAST:event_botonRegistrarActionPerformed
    public void borrarCompra() {
        precio = 0;
        cantidad = 0;

    }
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void SpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_SpinnerCantidadStateChanged

    private void EliminarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDatoActionPerformed
        int[] filasSeleccionadas = tablaCompra.getSelectedRows();

        if (filasSeleccionadas.length > 0) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar los registros seleccionados?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    Connection con = HikariJDBC.getConnection();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM compras WHERE numeroDeCompra = ?");

                    for (int fila : filasSeleccionadas) {
                        String idCliente = tablaCompra.getValueAt(fila, 0).toString();
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
    }//GEN-LAST:event_EliminarDatoActionPerformed

    private void botonRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrar1ActionPerformed

    public void calcularPrecio() {
        precio = precios[ProductosComboBox.getSelectedIndex()];
        cantidad = Integer.parseInt(SpinnerCantidad.getValue().toString());

        double subtotal = precio * cantidad;
        double ITBMS = subtotal * 0.07;
        double total = subtotal + ITBMS;

        precioUni.setText(aMoneda(subtotal));
        itbms.setText(aMoneda(ITBMS)); // Configurar el texto correcto para el ITBMS
        costototal.setText(aMoneda(total));
    }

    public String aMoneda(double precio) {
        return "" + Math.round(precio * 100.0) / 100.00;
    }

    public String aITBMS(double varITBMS) {

        return null;

    }

    public void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        double subtotal = 0;
        for (Compras c : listaCompra) {
            Object[] fila = new Object[3 + 1];
            fila[0] = c.getNumeroDeCompra();
            fila[1] = ProductosComboBox.getSelectedItem().toString();
            fila[2] = aMoneda(c.getPrecio());
            subtotal += c.getPrecio();
            modelo.addRow(fila);

        }
        double ITBMS = subtotal * 0.07;
        double total = subtotal + ITBMS;
        itbms.setText(aMoneda(ITBMS));
        costototal.setText(aMoneda(total));
        tablaCompra.setModel(modelo);
    }

    public void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tablaCompra.getModel();
    modelo.setRowCount(0);

    try {
        Connection con = HikariJDBC.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT numeroDeCompra, productosComprados, precio FROM compras");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String numeroCompra = rs.getString("numeroDeCompra");
            String productosComprados = rs.getString("productosComprados");
            String precio = rs.getString("precio");

            double valorNumerico = Double.parseDouble(precio);
            String precioFormateado = String.format("%.2f", valorNumerico);

            Object[] fila = {numeroCompra, productosComprados, precioFormateado};
            modelo.addRow(fila);
        }

        ps.close();
        con.close();
    } catch (SQLException e) {
        System.out.println(e.toString());
        JOptionPane.showMessageDialog(null, "Error al cargar los datos");
    }

    tablaCompra.setModel(modelo);

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Cancelar;
  private javax.swing.JLabel Cliente;
  private javax.swing.JLabel CostoTotal;
  private javax.swing.JButton EliminarDato;
  private javax.swing.JLabel ITBMS;
  private javax.swing.JLabel Precio;
  private javax.swing.JLabel Producto;
  private javax.swing.JComboBox<String> ProductosComboBox;
  private javax.swing.JSpinner SpinnerCantidad;
  private javax.swing.JButton botonRegistrar;
  private javax.swing.JButton botonRegistrar1;
  private javax.swing.JTextField cajaCliente;
  private javax.swing.JTextField cajaNumeroCompra;
  private javax.swing.JButton cancelar;
  private javax.swing.JLabel cantidadComprada;
  private javax.swing.JLabel costototal;
  private javax.swing.JLabel itbms;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel numerodeCompra;
  private javax.swing.JLabel precioUni;
  private javax.swing.JTable tablaCompra;
  // End of variables declaration//GEN-END:variables
}
