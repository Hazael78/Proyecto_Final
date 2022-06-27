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
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    
    List<Datos> listadatos = new ArrayList<Datos>();
    String[] titulo = new String[]{"ID","Nombre","Direccion","F Antiguedad","F Liquidacion"};
    DefaultTableModel mimodelo = new DefaultTableModel(null,titulo);
    String accion = "I";
    int valorID=0;
    public admin() {
        initComponents();
        CargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtan = new javax.swing.JTextField();
        txtli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 36, 178));
        jLabel5.setText("Fecha de antiguedad:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(15, 36, 178));
        jLabel6.setText("Fecha de liquidacion:");

        txtdireccion.setForeground(new java.awt.Color(0, 153, 153));

        txtnombre.setForeground(new java.awt.Color(0, 153, 153));

        txtan.setForeground(new java.awt.Color(0, 153, 153));

        txtli.setForeground(new java.awt.Color(0, 153, 153));

        tabladata.setBackground(new java.awt.Color(153, 255, 153));
        tabladata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Supervisor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 36, 178));
        jLabel2.setText("Nombre:");

        btneliminar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(204, 102, 0));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Nomina");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 36, 178));
        jLabel4.setText("Direccion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btneliminar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtdireccion))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtan, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtli))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Conexion conexion = new Conexion();
         Datos datos = new Datos();
         
         datos.setId(valorID);       
         
         if (conexion.borrar(valorID)) {
            JOptionPane.showMessageDialog(this, "Se elimino correctamente...");    
            mimodelo= (DefaultTableModel) tabladata.getModel();
            mimodelo.getDataVector().removeAllElements();
            CargarDatos();
            
        }else{
              JOptionPane.showMessageDialog(this, "Error al eliminar...");
          
    }//GEN-LAST:event_btneliminarActionPerformed

    
    }
    
 
    
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladata;
    private javax.swing.JTextField txtan;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtli;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
