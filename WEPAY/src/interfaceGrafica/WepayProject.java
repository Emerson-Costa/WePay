
package interfaceGrafica;

import classes.ArquivosSistema;
import classes.Sistema;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WepayProject extends javax.swing.JFrame {

public ArquivosSistema         arqu;
public Sistema                 s;
public CadastrarEmpregado      cadastrarEmpregado;
public ExibirEmpregados        exibirEmpregados;
public ExibirPontosCartao      exibirPontosCartao;
public RemoverEmpregado        removerEmpregado;
public Ponto                   ponto;
public LancarResultadoVendas   lancarResultadoVenda;
public EmitirFolhaPagamento    emitirFolhaPagamento;
public CadastrarTaxaDeServicos cadastrarTaxaServico;
public AlterarCadastroUsuario  alterarCadastroUsuario;

public WepayProject(){
    //this.setLocationRelativeTo(null);
    arqu                   = new ArquivosSistema();
    s                      = new Sistema();
    cadastrarEmpregado     = new CadastrarEmpregado();
    exibirEmpregados       = new ExibirEmpregados();
    exibirPontosCartao     = new ExibirPontosCartao();
    removerEmpregado       = new RemoverEmpregado();
    ponto                  = new Ponto();
    lancarResultadoVenda   = new LancarResultadoVendas();
    emitirFolhaPagamento   = new EmitirFolhaPagamento();
    cadastrarTaxaServico   = new CadastrarTaxaDeServicos();
    alterarCadastroUsuario = new AlterarCadastroUsuario();
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
        jSair = new javax.swing.JToggleButton();

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

        jListar.setText("LISTAR EMPREGADOS");
        jListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarActionPerformed(evt);
            }
        });

        jListarPonto.setText("LISTAR PONTO EMPREGADOS");
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

        jEmitirFolhaPagamentos.setText("EMITIR FOLHA DE PAGAMENTOS");
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

        jSair.setText("SAIR");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jSair)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
      jCadastrar.setSelected(false);
      cadastrarEmpregado.w = this;
      cadastrarEmpregado.setVisible(true);    
      setVisible(false);
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jInserirPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserirPontoActionPerformed
      jInserirPonto.setSelected(false);
      ponto.w = this;
      ponto.setVisible(true);
      setVisible(false);
    }//GEN-LAST:event_jInserirPontoActionPerformed

    private void jRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverActionPerformed
       jRemover.setSelected(false);
       removerEmpregado.w = this;
       removerEmpregado.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jRemoverActionPerformed

    private void jListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarActionPerformed
        jListar.setSelected(false);
        /*Neste trecho o arquivo é atualizado para as futuras correções*/
        arqu.DeletarArquivo("empregados");
        arqu.criarArquivo("empregados");
        /**************************************************************/
        try{
            arqu.escreverArquivo("empregados",s.imprimirEmpregado());
        } catch (IOException ex) {
            Logger.getLogger(WepayProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        exibirEmpregados.exibirDados();
        exibirEmpregados.w = this;
        exibirEmpregados.setVisible(true);
        setVisible(false);        
    }//GEN-LAST:event_jListarActionPerformed

    private void jListarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarPontoActionPerformed
        jListarPonto.setSelected(false);
        /*Neste trecho o arquivo é atualizado para as futuras correções*/
        arqu.DeletarArquivo("pontosEmpregados");
        arqu.criarArquivo("pontosEmpregados");
        /**************************************************************/
        try{
            arqu.escreverArquivo("pontosEmpregados",s.imprimirFolhaPonto());
        } catch (IOException ex) {
            Logger.getLogger(WepayProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        exibirPontosCartao.exibirDados();
        exibirPontosCartao.w = this;
        exibirPontosCartao.setVisible(true);
        setVisible(false);  
    }//GEN-LAST:event_jListarPontoActionPerformed

    private void jlLancarResultVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlLancarResultVendasActionPerformed
        jlLancarResultVendas.setSelected(false);
        lancarResultadoVenda.w = this;
        lancarResultadoVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jlLancarResultVendasActionPerformed

    private void jEmitirFolhaPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmitirFolhaPagamentosActionPerformed
        jEmitirFolhaPagamentos.setSelected(false);
        emitirFolhaPagamento.w = this;
        emitirFolhaPagamento.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jEmitirFolhaPagamentosActionPerformed

    private void jLancarTaxaServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLancarTaxaServActionPerformed
        jLancarTaxaServ.setSelected(false);
        cadastrarTaxaServico.w = this;
        cadastrarTaxaServico.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLancarTaxaServActionPerformed

    private void jAlterarCadEmpregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarCadEmpregadoActionPerformed
        jAlterarCadEmpregado.setSelected(false);
        alterarCadastroUsuario.w = this;
        alterarCadastroUsuario.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jAlterarCadEmpregadoActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        jSair.setSelected(false);
        arqu.DeletarArquivo("empregados");
        arqu.DeletarArquivo("pontosEmpregados");
        System.exit(0);
        
    }//GEN-LAST:event_jSairActionPerformed

    
    public static void main(String args[]) {
        ArquivosSistema arqu = new ArquivosSistema();
        arqu.criarArquivo("empregados");
        arqu.criarArquivo("pontosEmpregados");
        
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
    private javax.swing.JToggleButton jSair;
    private javax.swing.JToggleButton jlLancarResultVendas;
    // End of variables declaration//GEN-END:variables
}
