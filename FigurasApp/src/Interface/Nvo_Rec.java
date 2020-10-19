package Interface;

import Logic.*;
import static Logic.Global.ArregloFiguras;
import javax.swing.JOptionPane;

/* @author ayrto */

public class Nvo_Rec extends javax.swing.JFrame {

    public Nvo_Rec() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        MensajeArea = new javax.swing.JLabel();
        MensajePerimetro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JButton();
        Title_NvoTri = new javax.swing.JLabel();
        Eti_Base = new javax.swing.JLabel();
        Eti_Altura = new javax.swing.JLabel();
        CdeT_Base = new javax.swing.JTextField();
        CdeT_Altura = new javax.swing.JTextField();
        Bt_Agregar = new javax.swing.JButton();
        MensajeConfir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MensajeArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        MensajePerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("La Area es de:");

        jLabel2.setText("La Perímetro es de:");

        Btn_Regresar.setText("Regresar");
        Btn_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_RegresarMouseClicked(evt);
            }
        });
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        Title_NvoTri.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Title_NvoTri.setText("Nuevo Rectángulo");

        Eti_Base.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eti_Base.setText("Base:");

        Eti_Altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eti_Altura.setText("Altura:");

        CdeT_Base.setForeground(new java.awt.Color(0, 0, 0));
        CdeT_Base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_BaseBaseActionPerformed(evt);
            }
        });

        CdeT_Altura.setForeground(new java.awt.Color(0, 0, 0));
        CdeT_Altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdeT_AlturaAlturaActionPerformed(evt);
            }
        });

        Bt_Agregar.setText("Agregar");
        Bt_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AgregarAgregarActionPerformed(evt);
            }
        });

        MensajeConfir.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(MensajeConfir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bt_Agregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Btn_Regresar)
                .addGap(439, 439, 439))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title_NvoTri, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Eti_Altura)
                                    .addComponent(Eti_Base))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CdeT_Altura)
                                    .addComponent(CdeT_Base, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MensajePerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MensajeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Title_NvoTri)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eti_Base)
                    .addComponent(CdeT_Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CdeT_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eti_Altura))
                .addGap(38, 38, 38)
                .addComponent(Bt_Agregar)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MensajeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MensajePerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(MensajeConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Btn_Regresar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseClicked
        Menu regMen= new Menu();
        regMen.setVisible(true); //hace la ventana visible
        regMen.pack();
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarMouseClicked

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed

    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void CdeT_BaseBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_BaseBaseActionPerformed

    }//GEN-LAST:event_CdeT_BaseBaseActionPerformed

    private void CdeT_AlturaAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdeT_AlturaAlturaActionPerformed

    }//GEN-LAST:event_CdeT_AlturaAlturaActionPerformed

    private void Bt_AgregarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AgregarAgregarActionPerformed
        Rectangulo NvoRectangulo = new Rectangulo();
        int base = Integer.parseInt(CdeT_Base.getText());
        int altura = Integer.parseInt(CdeT_Altura.getText());
        String nombre = "Rectángulo";
        
        NvoRectangulo.Area(base, altura);
        NvoRectangulo.Perimetro(base, altura);
        NvoRectangulo.setNombre(nombre);
        NvoRectangulo.setBase(base);
        NvoRectangulo.setAltura(altura);

        MensajeArea.setText(String.valueOf(NvoRectangulo.getArea()));
        MensajePerimetro.setText(String.valueOf(NvoRectangulo.getPerimetro()));
        MensajeConfir.setText("La figura se ha guardado correctamente.");

        ArregloFiguras.add(NvoRectangulo);
    }//GEN-LAST:event_Bt_AgregarAgregarActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nvo_Rec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Agregar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTextField CdeT_Altura;
    private javax.swing.JTextField CdeT_Base;
    private javax.swing.JLabel Eti_Altura;
    private javax.swing.JLabel Eti_Base;
    private javax.swing.JLabel MensajeArea;
    private javax.swing.JLabel MensajeConfir;
    private javax.swing.JLabel MensajePerimetro;
    private javax.swing.JLabel Title_NvoTri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
