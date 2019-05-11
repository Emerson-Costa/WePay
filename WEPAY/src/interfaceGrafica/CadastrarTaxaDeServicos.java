
package interfaceGrafica;

import javax.swing.JOptionPane;

public class CadastrarTaxaDeServicos extends javax.swing.JFrame {
    public WepayProject w;
    
    public CadastrarTaxaDeServicos() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jPlanoSaude = new javax.swing.JCheckBox();
        jAuxilioCreche = new javax.swing.JCheckBox();
        jVoltar = new javax.swing.JToggleButton();
        jLancarTaxaServico = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("LANCAR TAXA DE SERVIÇO");

        jID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIDActionPerformed(evt);
            }
        });

        jPlanoSaude.setText("Plano de Saúde");
        jPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlanoSaudeActionPerformed(evt);
            }
        });

        jAuxilioCreche.setText("Auxílio Creche");

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        jLancarTaxaServico.setText("Lancar Taxa Servico");
        jLancarTaxaServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLancarTaxaServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jAuxilioCreche)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jVoltar)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPlanoSaude)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLancarTaxaServico)))
                            .addGap(61, 61, 61)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPlanoSaude))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLancarTaxaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAuxilioCreche)
                .addGap(35, 35, 35)
                .addComponent(jVoltar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDActionPerformed

    private void jPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlanoSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPlanoSaudeActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
      jID.setText("");
      jPlanoSaude.setSelected(false);
      jAuxilioCreche.setSelected(false);
      this.setVisible(false);
      w.setVisible(true);
    }//GEN-LAST:event_jVoltarActionPerformed

    private void jLancarTaxaServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLancarTaxaServicoActionPerformed
        
        boolean verificar; 
        if(jID.getText().equals("")  ){
          JOptionPane.showMessageDialog(null,"Informe a ID do empregado!");
          verificar = false;
        }else{
           int     idEmpregado   = Integer.parseInt(jID.getText());
           boolean planoDeSaude  = jPlanoSaude.isSelected();
           boolean auxilioCreche = jAuxilioCreche.isSelected();   
           
           if(w.s.buscarEmpregado(idEmpregado) == idEmpregado){
              verificar = w.s.lancarTaxaDeServicos(idEmpregado, planoDeSaude, auxilioCreche);  
              JOptionPane.showMessageDialog(null,"A Taxa de Servico foi lancada!");
           }else{
              JOptionPane.showMessageDialog(null,"Empregado não encontrado!");
              verificar = false;
           }
        }
          
        if(verificar){
         jID.setText("");
         jPlanoSaude.setSelected(false);
         jAuxilioCreche.setSelected(false);
         this.setVisible(false);
         w.setVisible(true);  
       }
    }//GEN-LAST:event_jLancarTaxaServicoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarTaxaDeServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTaxaDeServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTaxaDeServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTaxaDeServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTaxaDeServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jAuxilioCreche;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jLancarTaxaServico;
    private javax.swing.JCheckBox jPlanoSaude;
    private javax.swing.JToggleButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
