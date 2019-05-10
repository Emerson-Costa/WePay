
package interfaceGrafica;

import javax.swing.JOptionPane;


public class LancarResultadoVendas extends javax.swing.JFrame {
    public WepayProject w;
   
    public LancarResultadoVendas() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLancarResultado = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jCodFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jValorProduto = new javax.swing.JTextField();
        jVoltar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jDia = new javax.swing.JTextField();
        jMes = new javax.swing.JTextField();
        jAno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLancarResultado.setText("Lancar Resultado");
        jLancarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLancarResultadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Data da venda");

        jLabel2.setText("Lancar Resultado Vendas");

        jLabel3.setText("Produto Vendido");

        jNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor Produto");

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cod Funcionario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLancarResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel2))
                            .addComponent(jVoltar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCodFuncionario))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLancarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jVoltar)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLancarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLancarResultadoActionPerformed
       boolean lancou;
       if(jDia.getText().equals("") || jMes.getText().equals("") || jAno.getText().equals("") || jNomeProduto.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Todos os campos devem estar preenchidos!");
           lancou = false;
       }else{
           int codEmpregado      = Integer.parseInt(jCodFuncionario.getText());
           int dia               = Integer.parseInt(jDia.getText());
           int mes               = Integer.parseInt(jMes.getText());
           int ano               = Integer.parseInt(jAno.getText());          
           String produtoVendido = jNomeProduto.getText();
           float valorProduto    = Float.parseFloat(jValorProduto.getText());
           
           if(codEmpregado != w.s.buscarEmpregado(codEmpregado)){
             JOptionPane.showMessageDialog(null,"Usuário não encontrado!");  
             lancou = false;
           }else{
             lancou = w.s.lancarResultadoVendas(codEmpregado, produtoVendido, valorProduto, dia, mes, ano);
             JOptionPane.showMessageDialog(null,"Resultado da Venda lancada no Sistema!");
             lancou = true;
           }
       }
       
       if(lancou){
         jCodFuncionario.setText("");
         jDia.setText("");
         jMes.setText("");
         jAno.setText("");
         jNomeProduto.setText("");
         jValorProduto.setText("");
         this.setVisible(false);
         w.setVisible(true);  
       }
       
    }//GEN-LAST:event_jLancarResultadoActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
       this.setVisible(false);
       w.setVisible(true);
    }//GEN-LAST:event_jVoltarActionPerformed

    private void jNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(LancarResultadoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LancarResultadoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LancarResultadoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LancarResultadoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LancarResultadoVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAno;
    private javax.swing.JTextField jCodFuncionario;
    private javax.swing.JTextField jDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jLancarResultado;
    private javax.swing.JTextField jMes;
    private javax.swing.JTextField jNomeProduto;
    private javax.swing.JTextField jValorProduto;
    private javax.swing.JToggleButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
