/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import ConexionDAO.Conexion;
import DTO.Datos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hazae
 */
public class usuario extends javax.swing.JFrame {

    /**
     * Creates new form usuario
     */
    
    List<Datos> listadatos = new ArrayList<Datos>();
    String[] titulo = new String[]{"ID","Nombre","Direccion","F Antiguedad","F Liquidacion"};
    DefaultTableModel mimodelo = new DefaultTableModel(null,titulo);
    String accion = "I";
    int valorID=0;
    
    public usuario() {
        initComponents();
        CargarDatos();
    }

     private void CargarDatos(){
       //Para limpiar el modelo
       mimodelo = new DefaultTableModel(null,titulo);
       //Para recargar la tabla cada vez que se modifique algo
       Conexion conexion = new Conexion();
        if (conexion.consultartodos()){
            listadatos = conexion.getListDatos();
            for(Datos datos : listadatos){
               mimodelo.addRow(new Object[]{String.valueOf(datos.getId()),datos.getNombre(),datos.getDireccion(),datos.getFechaa(),datos.getFechal()});
            }
            tabladata.setModel(mimodelo);
        } else {
            JOptionPane.showMessageDialog(this, "No se pueden cargar los datos....");
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtan = new javax.swing.JTextField();
        txtli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladata = new javax.swing.JTable();
        btncap = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 118, 118));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Nomina");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(3, 118, 118));
        jLabel4.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(3, 118, 118));
        jLabel5.setText("Fecha de antiguedad:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(3, 118, 118));
        jLabel6.setText("Fecha de liquidacion:");

        txtdireccion.setBackground(new java.awt.Color(240, 240, 240));
        txtdireccion.setForeground(new java.awt.Color(204, 102, 0));

        txtnombre.setBackground(new java.awt.Color(240, 240, 240));
        txtnombre.setForeground(new java.awt.Color(204, 102, 0));

        txtan.setBackground(new java.awt.Color(240, 240, 240));
        txtan.setForeground(new java.awt.Color(204, 102, 0));

        txtli.setBackground(new java.awt.Color(240, 240, 240));
        txtli.setForeground(new java.awt.Color(204, 102, 0));

        tabladata.setBackground(new java.awt.Color(102, 255, 102));
        tabladata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        tabladata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabladata);

        btncap.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btncap.setForeground(new java.awt.Color(184, 84, 12));
        btncap.setText("Capturar");
        btncap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapActionPerformed(evt);
            }
        });

        btnmod.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnmod.setForeground(new java.awt.Color(184, 84, 12));
        btnmod.setText("Modificar");
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccion)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtli, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtan))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncap)
                        .addGap(160, 160, 160)
                        .addComponent(btnmod)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncap)
                    .addComponent(btnmod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapActionPerformed
        // TODO add your handling code here:
        Conexion conexion = new Conexion();
        Datos datos = new Datos();
        datos.setNombre(txtnombre.getText());
        datos.setDireccion(txtdireccion.getText());
        datos.setFechaa(txtan.getText());
        datos.setFechal(txtli.getText());
        if (accion.equals("I")){
        if(conexion.insertar(datos)){
            JOptionPane.showMessageDialog(this, "Se grabo correctamente...");
        }else{
            JOptionPane.showMessageDialog(this, "Error al grabar...");
        }
        }else if (accion.equals("A")) {
            datos.setId(valorID);
            if(conexion.actualizar(datos)){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
            }
    }                                         
        CargarDatos();
    }//GEN-LAST:event_btncapActionPerformed

    private void tabladataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladataMousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Se preciono algun lugar de la tabla","Seleccion",JOptionPane.INFORMATION_MESSAGE);
        int columna = tabladata.getSelectedColumn();
        int fila = tabladata.getSelectedRow();
        String cadena = tabladata.getValueAt(fila, columna).toString();
        JOptionPane.showMessageDialog(null, "Columna -> " + columna + "\n fila -> " + fila + "\n informacion en la celda -> " + cadena,"Posicion seleccionada ",JOptionPane.INFORMATION_MESSAGE);
        txtnombre.setText(tabladata.getValueAt(fila, 1).toString());
        txtdireccion.setText(tabladata.getValueAt(fila, 2).toString());
        txtan.setText(tabladata.getValueAt(fila, 3).toString());
        txtli.setText(tabladata.getValueAt(fila, 4).toString());
        valorID = Integer.valueOf(tabladata.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tabladataMousePressed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
        // TODO add your handling code here:
        Conexion conexion = new Conexion();
         Datos datos = new Datos();
         
         datos.setId(valorID);
         datos.setNombre(txtnombre.getText());
         datos.setDireccion(txtdireccion.getText());
         datos.setFechaa(txtan.getText());
         datos.setFechal(txtli.getText());      
         
         if (conexion.actualizar(datos)) {
              JOptionPane.showMessageDialog(this, "Se actualizo correctamente...");    
            mimodelo= (DefaultTableModel) tabladata.getModel();
            mimodelo.getDataVector().removeAllElements();
            CargarDatos();
        }else{
              JOptionPane.showMessageDialog(this, "Error al actualizar...");           
         }
    }//GEN-LAST:event_btnmodActionPerformed

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncap;
    private javax.swing.JButton btnmod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladata;
    private javax.swing.JTextField txtan;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtli;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}