
package interfaceGrafica;

import classes.Sistema;


public class WepayProject extends javax.swing.JFrame {


Sistema s = new Sistema();
CadastrarEmpregado cadastrarEmpregado = new CadastrarEmpregado();
RemoverEmpregado removerEmpregado = new RemoverEmpregado();
Ponto ponto = new Ponto();

public WepayProject() {
   initComponents();
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCadastrar = new javax.swing.JToggleButton();
        jInserirPonto = new javax.swing.JToggleButton();
        jRemover = new javax.swing.JToggleButton();
        jListar = new javax.swing.JToggleButton();
        jListarPonto = new javax.swing.JToggleButton();
        jlLancarResultVendas = new javax.swing.JToggleButton();
        jEmitirFolhaPagamentos = new javax.swing.JToggleButton();
        jLancarTaxaServ = new javax.swing.JToggleButton();
        jAlterarCadEmpregado = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("WEPAY PROJECT");

        jCadastrar.setText("CADASTRAR");
        jCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });

        jInserirPonto.setText("INSERIR PONTO");
        jInserirPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInserirPontoActionPerformed(evt);
            }
        });

        jRemover.setText("REMOVER");
        jRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoverActionPerformed(evt);
            }
        });

        jListar.setText("LISTAR FUNCIONÁRIOS");
        jListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarActionPerformed(evt);
            }
        });

        jListarPonto.setText("LISTAR PONTOS FUNCIONARIOS");
        jListarPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarPontoActionPerformed(evt);
            }
        });

        jlLancarResultVendas.setText("LANCAR RESULTADO DA VENDAS");
        jlLancarResultVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlLancarResultVendasActionPerformed(evt);
            }
        });

        jEmitirFolhaPagamentos.setText("EMITIR FOLHA DE PAGAMAENTOS");
        jEmitirFolhaPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmitirFolhaPagamentosActionPerformed(evt);
            }
        });

        jLancarTaxaServ.setText("LANCAR TAXA DE SERVICOS");
        jLancarTaxaServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLancarTaxaServActionPerformed(evt);
            }
        });

        jAlterarCadEmpregado.setText("ALTERAR CADASTO");
        jAlterarCadEmpregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarCadEmpregadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInserirPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jListarPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlLancarResultVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEmitirFolhaPagamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jLancarTaxaServ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAlterarCadEmpregado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAlterarCadEmpregado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInserirPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jListarPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlLancarResultVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmitirFolhaPagamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLancarTaxaServ)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
      cadastrarEmpregado.w = this;
      cadastrarEmpregado.setVisible(true);
      setVisible(false);
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jInserirPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserirPontoActionPerformed
      ponto.w = this;
      ponto.setVisible(true);
      setVisible(false);
    }//GEN-LAST:event_jInserirPontoActionPerformed

    private void jRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverActionPerformed
       removerEmpregado.w = this;
       removerEmpregado.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jRemoverActionPerformed

    private void jListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarActionPerformed
      
        System.out.println("EMPREGADOS CADASTRADOS");
        System.out.println( s.imprimirFuncionarios());
      
    }//GEN-LAST:event_jListarActionPerformed

    private void jListarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarPontoActionPerformed
   
        System.out.println("FOLHA PONTO DOS EMPREGADOS");
        System.out.println(s.imprimirFolhaPonto());
        
    }//GEN-LAST:event_jListarPontoActionPerformed

    private void jlLancarResultVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlLancarResultVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlLancarResultVendasActionPerformed

    private void jEmitirFolhaPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmitirFolhaPagamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmitirFolhaPagamentosActionPerformed

    private void jLancarTaxaServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLancarTaxaServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLancarTaxaServActionPerformed

    private void jAlterarCadEmpregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarCadEmpregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlterarCadEmpregadoActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WepayProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jAlterarCadEmpregado;
    private javax.swing.JToggleButton jCadastrar;
    private javax.swing.JToggleButton jEmitirFolhaPagamentos;
    private javax.swing.JToggleButton jInserirPonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jLancarTaxaServ;
    private javax.swing.JToggleButton jListar;
    private javax.swing.JToggleButton jListarPonto;
    private javax.swing.JToggleButton jRemover;
    private javax.swing.JToggleButton jlLancarResultVendas;
    // End of variables declaration//GEN-END:variables
}
