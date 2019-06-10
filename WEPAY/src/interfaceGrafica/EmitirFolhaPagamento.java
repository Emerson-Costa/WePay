
package interfaceGrafica;

import javax.swing.JOptionPane;


public class EmitirFolhaPagamento extends javax.swing.JFrame {
    public WepayProject w;
   
    public EmitirFolhaPagamento() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEmitir = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jDia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMes = new javax.swing.JTextField();
        jAno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSalario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCod = new javax.swing.JTextField();
        jVoltar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEmitir.setText("Emitir ");
        jEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmitirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Emitir Folha de Pagamento");

        jLabel5.setText("/");

        jLabel1.setText("DATA");

        jLabel6.setText("/");

        jMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMesActionPerformed(evt);
            }
        });

        jAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnoActionPerformed(evt);
            }
        });

        jLabel2.setText("SALARIO");

        jLabel3.setText("CODIGO FUNCIONARIO");

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jEmitir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addComponent(jCod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(jAno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jEmitir)
                .addGap(3, 3, 3)
                .addComponent(jVoltar)
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmitirActionPerformed
        jEmitir.setSelected(false);
        boolean emitiu = false;
        if(jCod.getText().equals("")|| jDia.getText().equals("") || jMes.getText().equals("") || 
           jAno.getText().equals("") || jSalario.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Todos os campos devem estar preenchidos!");
        }else{
           int codEmpregado   = Integer.parseInt(jCod.getText());
           int dia            = Integer.parseInt(jDia.getText());
           int mes            = Integer.parseInt(jMes.getText());
           int ano            = Integer.parseInt(jAno.getText());
           float salarioBruto = Float.parseFloat(jSalario.getText());
            
           if(w.s.buscarEmpregado(codEmpregado) == -1 ){
               JOptionPane.showMessageDialog(null,"Empregado não encontrado!");
           }else{
               emitiu = w.s.emitirFolhaDePagamento(codEmpregado, dia, mes, ano, salarioBruto);
               JOptionPane.showMessageDialog(null,"A folha de Pagamento foi lancada!");  
               System.out.println("\n\n\n\n\n\nFOLHA DE PAGAMENTO\n\n"+w.s.getFolhaDePagamentos());
           }
           
           if(emitiu){
             jCod.setText("");
             jDia.setText("");
             jMes.setText("");
             jAno.setText("");
             jSalario.setText("");
             this.setVisible(false);
             w.setVisible(true);  
           }
        }
       
                
             
    }//GEN-LAST:event_jEmitirActionPerformed

    private void jMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMesActionPerformed

    private void jAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnoActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
      jVoltar.setSelected(false);
      jCod.setText("");
      jDia.setText("");
      jMes.setText("");
      jAno.setText("");
      jSalario.setText("");
      this.setVisible(false);
      w.setVisible(true);
    }//GEN-LAST:event_jVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(EmitirFolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmitirFolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmitirFolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmitirFolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmitirFolhaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAno;
    private javax.swing.JTextField jCod;
    private javax.swing.JTextField jDia;
    private javax.swing.JToggleButton jEmitir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jMes;
    private javax.swing.JTextField jSalario;
    private javax.swing.JToggleButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
