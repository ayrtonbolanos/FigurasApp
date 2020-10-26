package Interfaz;

import Logic.*;
import static Datos.Global.ArregloFiguras;

/* @author ayrto */

public class Nvo_Tri extends javax.swing.JFrame {

    public Nvo_Tri() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title_NvoTri = new javax.swing.JLabel();
        Eti_Base = new javax.swing.JLabel();
        Eti_Altura = new javax.swing.JLabel();
        CdeT_Base = new javax.swing.JTextField();
        CdeT_Altura = new javax.swing.JTextField();
        Bt_Agregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        MensajeArea = new javax.swing.JLabel();
        MensajePerimetro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JButton();
        MensajeConfir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title_NvoTri.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Title_NvoTri.setText("Nuevo Triángulo");

        Eti_Base.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eti_Base.setText("Base:");

        Eti_Altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eti_Altura.setText("Altura:");

        CdeT_Base.setForeground(new java.awt.Color(0, 0, 0));
        CdeT_Base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseActionPerformed(evt);
            }
        });

        CdeT_Altura.setForeground(new java.awt.Color(0, 0, 0));
        CdeT_Altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlturaActionPerformed(evt);
            }
        });

        Bt_Agregar.setText("Agregar");
        Bt_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

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

        MensajeConfir.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Btn_Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(MensajeConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_Agregar))
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(MensajeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MensajePerimetro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Eti_Altura)
                            .addComponent(Eti_Base))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CdeT_Altura)
                            .addComponent(CdeT_Base, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title_NvoTri, javax.swing.GroupLayout.Alignment.CENTER))
                .addGap(177, 177, 177))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MensajeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MensajePerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(MensajeConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Btn_Regresar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseActionPerformed
        
    }//GEN-LAST:event_BaseActionPerformed

    private void AlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlturaActionPerformed
        
    }//GEN-LAST:event_AlturaActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Triangulo NvoTriangulo = new Triangulo();
        int base = Integer.parseInt(CdeT_Base.getText());
        int altura = Integer.parseInt(CdeT_Altura.getText());
        String nombre = "Triángulo";
        

        NvoTriangulo.Area(base, altura);
        NvoTriangulo.Perimetro(base, altura);
        NvoTriangulo.setNombre(nombre);
        NvoTriangulo.setBase(base);
        NvoTriangulo.setAltura(altura);
        
                
        MensajeArea.setText(String.valueOf(NvoTriangulo.getArea()));
        MensajePerimetro.setText(String.valueOf(NvoTriangulo.getPerimetro()));
        MensajeConfir.setText("La figura se ha guardado correctamente.");
        
        ArregloFiguras.add(NvoTriangulo);
    }//GEN-LAST:event_AgregarActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Btn_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseClicked
        Menu regMen= new Menu();
        regMen.setVisible(true); //hace la ventana visible
        regMen.pack();
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nvo_Tri().setVisible(true);
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
