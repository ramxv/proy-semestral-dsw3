package Interfaz;

//@author royel

import SQL.HikariJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroDeClienteVIP extends javax.swing.JFrame{
        
    String tipoV;
    
    public RegistroDeClienteVIP(String tipo) {
        this.tipoV = tipo;
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreClienteVIP = new javax.swing.JTextField();
        fechaNacimientoClienteVIP = new javax.swing.JTextField();
        telefonoClienteVIP = new javax.swing.JTextField();
        correoClienteVIP = new javax.swing.JTextField();
        registrarV = new javax.swing.JButton();
        cancelarV = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cedulaClienteVIP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        generoClienteVIP = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        provinciaClienteVIP = new javax.swing.JTextField();
        ciudadClienteVIP = new javax.swing.JTextField();
        corregimientoClienteVIP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numeroMembresiaVIP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        productoDescuentoVIP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        promedioGastadoVIP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        asesorAsignadoVIP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        productoFrecuentesVIP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cantidadCreditoVIP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Cliente");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Nombre:");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Fecha de nacimiento:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Correo:");

        nombreClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        nombreClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteVIPActionPerformed(evt);
            }
        });

        fechaNacimientoClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        fechaNacimientoClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        fechaNacimientoClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoClienteVIPActionPerformed(evt);
            }
        });

        telefonoClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        telefonoClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        telefonoClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoClienteVIPActionPerformed(evt);
            }
        });

        correoClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        correoClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        correoClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoClienteVIPActionPerformed(evt);
            }
        });

        registrarV.setBackground(new java.awt.Color(0, 153, 204));
        registrarV.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        registrarV.setForeground(new java.awt.Color(255, 255, 255));
        registrarV.setText("Registrar");
        registrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVActionPerformed(evt);
            }
        });

        cancelarV.setBackground(new java.awt.Color(153, 0, 0));
        cancelarV.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cancelarV.setForeground(new java.awt.Color(255, 255, 255));
        cancelarV.setText("Cancelar");
        cancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Cédula:");

        cedulaClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cedulaClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        cedulaClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteVIPActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Género:");

        generoClienteVIP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        generoClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoClienteVIPActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Provincia:");

        provinciaClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        provinciaClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        provinciaClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaClienteVIPActionPerformed(evt);
            }
        });

        ciudadClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ciudadClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        ciudadClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadClienteVIPActionPerformed(evt);
            }
        });

        corregimientoClienteVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        corregimientoClienteVIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        corregimientoClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corregimientoClienteVIPActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Ciudad:");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Corregimiento:");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("Número de Membresía:");

        numeroMembresiaVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        numeroMembresiaVIP.setForeground(new java.awt.Color(0, 0, 0));
        numeroMembresiaVIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Producto Descuento:");

        productoDescuentoVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        productoDescuentoVIP.setForeground(new java.awt.Color(0, 0, 0));
        productoDescuentoVIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Promedio Gastado:");

        promedioGastadoVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        promedioGastadoVIP.setForeground(new java.awt.Color(0, 0, 0));
        promedioGastadoVIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Asesor Asignado:");

        asesorAsignadoVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        asesorAsignadoVIP.setForeground(new java.awt.Color(0, 0, 0));
        asesorAsignadoVIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("Productos Frecuentes:");

        productoFrecuentesVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        productoFrecuentesVIP.setForeground(new java.awt.Color(0, 0, 0));
        productoFrecuentesVIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 255));
        jLabel16.setText("Cantidad Crédito:");

        cantidadCreditoVIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cantidadCreditoVIP.setForeground(new java.awt.Color(0, 0, 0));
        cantidadCreditoVIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registrarV)
                                .addGap(34, 34, 34)
                                .addComponent(cancelarV))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productoDescuentoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(promedioGastadoVIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaNacimientoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(correoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(corregimientoClienteVIP))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(ciudadClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(telefonoClienteVIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cedulaClienteVIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(provinciaClienteVIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(numeroMembresiaVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(productoFrecuentesVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cantidadCreditoVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(asesorAsignadoVIP))))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cedulaClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fechaNacimientoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(telefonoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(generoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(provinciaClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(correoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ciudadClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(corregimientoClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(numeroMembresiaVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(productoDescuentoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(asesorAsignadoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(promedioGastadoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(cantidadCreditoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrarV)
                            .addComponent(cancelarV))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(productoFrecuentesVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Cliente VIP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void corregimientoClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corregimientoClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corregimientoClienteVIPActionPerformed

    private void ciudadClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadClienteVIPActionPerformed

    private void provinciaClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaClienteVIPActionPerformed

    private void generoClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoClienteVIPActionPerformed
        String genero[] = {"M", "F"};

        for (String g : genero) {
            generoClienteVIP.addItem(g);
        }
    }//GEN-LAST:event_generoClienteVIPActionPerformed

    private void cedulaClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaClienteVIPActionPerformed

    private void cancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarVActionPerformed

    private void registrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVActionPerformed
        String nombreCV = nombreClienteVIP.getText();
        String cedulaCV = cedulaClienteVIP.getText();
        String fechaNacimientoCV = fechaNacimientoClienteVIP.getText();
        String telefonoCV = telefonoClienteVIP.getText();
        String generoCV = (String) generoClienteVIP.getSelectedItem();
        String provinciaCV = provinciaClienteVIP.getText();
        String correoCV = correoClienteVIP.getText();
        String ciudadCV = ciudadClienteVIP.getText();
        String corregimientoCV = ciudadClienteVIP.getText();

        //datos nuevos para frecuentes
        String numeroMembresiaCV = numeroMembresiaVIP.getText();
        String productoFrecuentesCV = productoFrecuentesVIP.getText();
        Double productoDescuentoCV = Double.valueOf(productoDescuentoVIP.getText());
        String asesorAsignadoCV = asesorAsignadoVIP.getText();
        Double promedioGastadoCV = Double.valueOf(promedioGastadoVIP.getText());
        Double cantidadCreditoCV = Double.valueOf(cantidadCreditoVIP.getText());

        try {
            Connection con = HikariJDBC.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO clientes(cedula, tipoCliente, nombre, fechaNacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, numMembresia, cantidadPromedioGastada, productosFrecuentes, descuento, asesorAsignado, cantidadCredito) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cedulaCV);
            ps.setString(2, tipoV);
            ps.setString(3, nombreCV);
            ps.setString(4, fechaNacimientoCV);
            ps.setString(5, generoCV);
            ps.setString(6, correoCV);
            ps.setString(7, telefonoCV);
            ps.setString(8, provinciaCV);
            ps.setString(9, ciudadCV);
            ps.setString(10, corregimientoCV);
            ps.setString(11, numeroMembresiaCV);
            ps.setDouble(12, promedioGastadoCV);
            ps.setString(13, productoFrecuentesCV);
            ps.setDouble(14, productoDescuentoCV);
            ps.setString(15, asesorAsignadoCV);
            ps.setDouble(16, cantidadCreditoCV);

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

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_registrarVActionPerformed

    private void correoClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoClienteVIPActionPerformed

    private void telefonoClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoClienteVIPActionPerformed

    private void fechaNacimientoClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoClienteVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoClienteVIPActionPerformed

    private void nombreClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteVIPActionPerformed

    }//GEN-LAST:event_nombreClienteVIPActionPerformed
           
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
            java.util.logging.Logger.getLogger(RegistroDeClienteVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClienteVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClienteVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClienteVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RegistroDeCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asesorAsignadoVIP;
    private javax.swing.JButton cancelarV;
    private javax.swing.JTextField cantidadCreditoVIP;
    private javax.swing.JTextField cedulaClienteVIP;
    private javax.swing.JTextField ciudadClienteVIP;
    private javax.swing.JTextField corregimientoClienteVIP;
    private javax.swing.JTextField correoClienteVIP;
    private javax.swing.JTextField fechaNacimientoClienteVIP;
    private javax.swing.JComboBox<String> generoClienteVIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreClienteVIP;
    private javax.swing.JTextField numeroMembresiaVIP;
    private javax.swing.JTextField productoDescuentoVIP;
    private javax.swing.JTextField productoFrecuentesVIP;
    private javax.swing.JTextField promedioGastadoVIP;
    private javax.swing.JTextField provinciaClienteVIP;
    private javax.swing.JButton registrarV;
    private javax.swing.JTextField telefonoClienteVIP;
    // End of variables declaration//GEN-END:variables

}
