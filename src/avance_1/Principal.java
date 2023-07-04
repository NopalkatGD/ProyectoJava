package avance_1;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        Fisica panelFisica = new Fisica();
        //velocidad panelVelocidad = new Gasolina();
        CambiarPanel(panelFisica);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fisica = new javax.swing.JButton();
        Cursos = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();
        Gasolina = new javax.swing.JButton();
        Economia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avance_1 DEMG_P2Act4");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        Fisica.setText("Fisica");
        Fisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FisicaActionPerformed(evt);
            }
        });

        Cursos.setText("Cursos");
        Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursosActionPerformed(evt);
            }
        });

        Contenido.setBackground(new java.awt.Color(51, 51, 51));
        Contenido.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Gasolina.setText("Gasolina");
        Gasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GasolinaActionPerformed(evt);
            }
        });

        Economia.setText("Economia");
        Economia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EconomiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Fisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gasolina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cursos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Economia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fisica)
                    .addComponent(Gasolina)
                    .addComponent(Economia)
                    .addComponent(Cursos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarPanel(JPanel p){
        
        p.setSize(400,300);
        p.setLocation(0,0);
        
        
        Contenido.removeAll();;
        Contenido.add(p,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }
    
    private void FisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FisicaActionPerformed
        Fisica panelFisica = new Fisica();
        //velocidad panelVelocidad = new Gasolina();
        CambiarPanel(panelFisica);
    }//GEN-LAST:event_FisicaActionPerformed

    private void CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursosActionPerformed
        //dias panelDias = new Fisica();
        Cursos panelCursos = new Cursos();
        CambiarPanel(panelCursos);
    }//GEN-LAST:event_CursosActionPerformed

    private void GasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GasolinaActionPerformed
        Gasolina panelGasolina = new Gasolina();
        CambiarPanel(panelGasolina);
    }//GEN-LAST:event_GasolinaActionPerformed

    private void EconomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EconomiaActionPerformed
        Economia panelEconomia = new Economia();
        CambiarPanel(panelEconomia);
    }//GEN-LAST:event_EconomiaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton Cursos;
    private javax.swing.JButton Economia;
    private javax.swing.JButton Fisica;
    private javax.swing.JButton Gasolina;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
