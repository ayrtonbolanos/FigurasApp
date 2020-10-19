/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import static Logica.ArregloGlobal.ArregloSeleccion;
import Logica.*;

/**
 *
 * @author ayrto
 */
public class NuevoJugador extends javax.swing.JFrame {

    /**
     * Creates new form NuevoJugador
     */
    public NuevoJugador() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CdeT_ID = new javax.swing.JTextField();
        CdeT_Nombre = new javax.swing.JTextField();
        CdeT_Apellidos = new javax.swing.JTextField();
        CdeT_Edad = new javax.swing.JTextField();
        CdeT_Dorsal = new javax.swing.JTextField();
        CdeT_Demarcación = new javax.swing.JTextField();
        Btn_AñadirJugador = new javax.swing.JButton();
        MensajeJuega = new javax.swing.JLabel();
        MensajeEntrena = new javax.swing.JLabel();
        MensajeConcentra = new javax.swing.JLabel();
        MensajeViaja = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Edad");

        jLabel4.setText("Nombre");

        jLabel5.setText("Dorsal");

        jLabel6.setText("Demarcación");

        CdeT_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_IDActionPerformed(evt);
            }
        });

        CdeT_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_NombreActionPerformed(evt);
            }
        });

        CdeT_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_ApellidosActionPerformed(evt);
            }
        });

        CdeT_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_EdadActionPerformed(evt);
            }
        });

        CdeT_Dorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_DorsalActionPerformed(evt);
            }
        });

        CdeT_Demarcación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_DemarcaciónActionPerformed(evt);
            }
        });

        Btn_AñadirJugador.setText("Añadir Jugador");
        Btn_AñadirJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirJugadorActionPerformed(evt);
            }
        });

        Btn_Regresar.setText("Regresar");
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CdeT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CdeT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CdeT_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CdeT_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CdeT_Dorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CdeT_Demarcación, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_AñadirJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(MensajeJuega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeEntrena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeConcentra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeViaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CdeT_ID)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CdeT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CdeT_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CdeT_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CdeT_Dorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CdeT_Demarcación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addComponent(Btn_AñadirJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MensajeJuega, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeEntrena, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeConcentra, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeViaja, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CdeT_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdeT_IDActionPerformed

    private void CdeT_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdeT_NombreActionPerformed

    private void CdeT_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdeT_ApellidosActionPerformed

    private void CdeT_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdeT_EdadActionPerformed

    private void CdeT_DorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_DorsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdeT_DorsalActionPerformed

    private void CdeT_DemarcaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_DemarcaciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdeT_DemarcaciónActionPerformed

    private void Btn_AñadirJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirJugadorActionPerformed
        
        Jugador NvoJugador = new Jugador();
        int id = Integer.parseInt(CdeT_ID.getText());
        String Nombre = CdeT_Nombre.getText();
        String Apellidos = CdeT_Apellidos.getText();
        int Edad = Integer.parseInt(CdeT_Edad.getText());
        int dorsal = Integer.parseInt(CdeT_Dorsal.getText());
        String demarcacion = CdeT_Demarcación.getText();
        
        NvoJugador.setId(id);
        NvoJugador.setNombre(Nombre);
        NvoJugador.setApellidos(Apellidos);
        NvoJugador.setEdad(Edad);
        NvoJugador.setDorsal(dorsal);
        NvoJugador.setDemarcacion(demarcacion);

        MensajeJuega.setText((NvoJugador.jugarPartido()));
        MensajeEntrena.setText((NvoJugador.entrenar()));
        MensajeConcentra.setText((NvoJugador.Concentrarse()));
        MensajeViaja.setText((NvoJugador.Viaja()));


        ArregloSeleccion.add(NvoJugador);
    }//GEN-LAST:event_Btn_AñadirJugadorActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        Menú regMen= new Menú();
        regMen.setVisible(true); //hace la ventana visible
        regMen.pack();
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AñadirJugador;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTextField CdeT_Apellidos;
    private javax.swing.JTextField CdeT_Demarcación;
    private javax.swing.JTextField CdeT_Dorsal;
    private javax.swing.JTextField CdeT_Edad;
    private javax.swing.JTextField CdeT_ID;
    private javax.swing.JTextField CdeT_Nombre;
    private javax.swing.JLabel MensajeConcentra;
    private javax.swing.JLabel MensajeEntrena;
    private javax.swing.JLabel MensajeJuega;
    private javax.swing.JLabel MensajeViaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
