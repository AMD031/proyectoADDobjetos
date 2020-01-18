/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Controlador;
import com.mycompany.coches.modelo.Coche;
import Util.Utilidades;
import com.mycompany.coches.modelo.Fabricante;
/**
 * @author Antonio Martínez Díaz
 */
public class FormularioCoche extends javax.swing.JPanel {

    /**
     * Creates new form FormularioCoche
     */
    
    private int id;
    private Coche coche;
    private Fabricante fabricante;
    public FormularioCoche(int id) {
        initComponents();
        this.id = id;
        this.coche =  Controlador.obtenerCocheVenta(id);
        if(coche !=null){
            this.fabricante = coche.getFabricante();
        }
        volcarDatosCoche();
    }

    private void volcarDatosCoche(){
  
      if(coche != null){
       fId.setText(Integer.toString(coche.getId()));
       fBastidor.setText(coche.getBastidor());
       fModelo.setText(coche.getModelo());
       fColor.setText(coche.getColor()); 
       
      }   
  
      if(this.fabricante!=null){
          fCif.setText(fabricante.getCif());
          fNombre.setText(fabricante.getNombre());
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

        fBastidor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Bastidor = new javax.swing.JLabel();
        fModelo = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        Color = new javax.swing.JLabel();
        fColor = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Modelo1 = new javax.swing.JLabel();
        Color1 = new javax.swing.JLabel();
        fNombre = new javax.swing.JTextField();
        fCif = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Coche:");

        Bastidor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor.setText("Bastidor");

        fModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fModeloActionPerformed(evt);
            }
        });

        Modelo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modelo.setText("Modelo");

        Color.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Color.setText("Color");

        fColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fColorActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Id");

        fId.setEditable(false);
        fId.setBackground(new java.awt.Color(204, 204, 204));
        fId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Editar fabricante coche:");

        Modelo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modelo1.setText("Cif");

        Color1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Color1.setText("Nombre");

        fNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNombreActionPerformed(evt);
            }
        });

        fCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bastidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(fBastidor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fColor)
                            .addComponent(fId)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(293, 293, 293)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modelo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fCif, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(fNombre))
                        .addGap(53, 53, 53))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fBastidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Color)
                    .addComponent(fColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modelo1)
                    .addComponent(fCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Color1)
                    .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fModeloActionPerformed

    private void fColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fColorActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Coche cocheEditado = new Coche();
        Fabricante fabricanteEditado = new Fabricante();
        cocheEditado.setModelo(fModelo.getText());
        cocheEditado.setColor(fColor.getText());
        cocheEditado.setBastidor(fBastidor.getText());
        System.out.println(cocheEditado+" "+this.id);
        System.out.println(fabricanteEditado+" "+this.id);
        
        fabricanteEditado.setCif(fCif.getText());
        fabricanteEditado.setNombre(fNombre.getText());
        
       cocheEditado.setFabricante(fabricanteEditado);
  
       
        Controlador.actualizarCocheVenta(cocheEditado, Utilidades.COCHE, this.id);   
    }//GEN-LAST:event_GuardarActionPerformed

    private void fIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fIdActionPerformed
 
    }//GEN-LAST:event_fIdActionPerformed

    private void fNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNombreActionPerformed

    private void fCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fCifActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bastidor;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Color1;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Modelo1;
    private javax.swing.JTextField fBastidor;
    private javax.swing.JTextField fCif;
    private javax.swing.JTextField fColor;
    private javax.swing.JTextField fId;
    private javax.swing.JTextField fModelo;
    private javax.swing.JTextField fNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
