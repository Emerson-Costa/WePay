
package interfaceGrafica;

import javax.swing.JOptionPane;


public class AlterarCadastroUsuario extends javax.swing.JFrame {
    public WepayProject w;
    boolean alterou = false;
    
    public AlterarCadastroUsuario() {
        this.setLocationRelativeTo(null);
        initComponents();
        jTipo.addItem("Assalariado");
        jTipo.addItem("Comissionado");
        jTipo.addItem("Concursado");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jALterar = new javax.swing.JButton();
        jNome = new javax.swing.JTextField();
        jTipo = new javax.swing.JComboBox();
        jEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCod = new javax.swing.JTextField();
        jBuscarEmpregado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jALterar.setText("Alterar Cadastro");
        jALterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jALterarActionPerformed(evt);
            }
        });

        jNome.setToolTipText("");
        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });

        jTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoActionPerformed(evt);
            }
        });

        jEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo");

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereco:");

        jLabel4.setText("ALTERAR CADASTRO EMPREGADO");

        jLabel5.setText("ID:");

        jBuscarEmpregado.setText("Buscar Empregado");
        jBuscarEmpregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarEmpregadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVoltar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jALterar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(22, 22, 22)
                            .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)))
                            .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBuscarEmpregado)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarEmpregado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jALterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jVoltar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jALterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jALterarActionPerformed
       
        if(jCod.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Informe o cod do empregado");
        }else{
           int cod         = Integer.parseInt(jCod.getText());  
           String nome     = jNome.getText();
           String endereco = jEndereco.getText();
           String tipo     = jTipo.getSelectedItem()+"";
           alterou = w.s.alterarCadastroEmpregado(cod, nome, endereco, tipo);
           JOptionPane.showMessageDialog(null,"Cadastro alterado com sucesso!");
        }
         
        
        if(alterou){
         jCod.setText("");
         jNome.setText("");
         jEndereco.setText("");
         jTipo.setSelectedIndex(0);
         this.setVisible(false);
         w.setVisible(true);  
       }        
       
    }//GEN-LAST:event_jALterarActionPerformed

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed

    }//GEN-LAST:event_jNomeActionPerformed

    private void jTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoActionPerformed

    }//GEN-LAST:event_jTipoActionPerformed

    private void jEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnderecoActionPerformed

    }//GEN-LAST:event_jEnderecoActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
        jCod.setText("");
        jNome.setText("");
        jEndereco.setText("");
        jTipo.setSelectedIndex(0);
        this.setVisible(false);
        w.setVisible(true);

    }//GEN-LAST:event_jVoltarActionPerformed

    private void jBuscarEmpregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarEmpregadoActionPerformed
       
       if(jCod.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Informe a ID do empregado!");  
       }else{
          int cod = Integer.parseInt(jCod.getText());
          if(w.s.buscarEmpregado(cod) == -1){
            JOptionPane.showMessageDialog(null,"Empregado nao cadastrado no sistema!");   
          }else{
              for(int i = 0; i < w.s.getEmpregado().size() ;i++){
                 if(w.s.getEmpregado().get(i).getId() == cod){
                    jNome.setText(w.s.getEmpregado().get(i).getNome());
                    jEndereco.setText(w.s.getEmpregado().get(i).getEndereco());
                 }  
              }
              int indice=0;
              jTipo.setSelectedIndex(indice);
              while( indice < 3 ){ 
                jTipo.setSelectedIndex(indice);
                String escolha = jTipo.getSelectedItem()+"";
                if(escolha.equals(w.s.getEmpregado().get(indice).getTipo())){
                   break;
                }
                indice++;
              }
              jTipo.setSelectedIndex(indice);
         }
      }  
    }//GEN-LAST:event_jBuscarEmpregadoActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jALterar;
    private javax.swing.JButton jBuscarEmpregado;
    private javax.swing.JTextField jCod;
    private javax.swing.JTextField jEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNome;
    private javax.swing.JComboBox jTipo;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
