/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.telas;

import atena.processoseletivo.ProcessoSeletivo;
import atena.processoseletivo.ProcessoSeletivoDAO;
import atena.processoseletivo.ProcessoSeletivoTableModel;
import atena.usuario.Usuario;
import atena.usuario.UsuarioDAO;
import atena.usuario.UsuarioTableModel;
import atena.util.Util;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos Oliveira
 */
public class CadastroProcessoSeletivo extends javax.swing.JDialog {

    ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
    ProcessoSeletivoDAO processoSeletivoDAO = new ProcessoSeletivoDAO();

    /**
     * Creates new form TelaCadastroUsuario
     */
    public CadastroProcessoSeletivo(java.awt.Frame parent, boolean modal) {
        initComponents();
        getRootPane().setDefaultButton(btSalvar);

        btLimparActionPerformed(null);
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNomeUsuario = new javax.swing.JLabel();
        txtProcessoSeletivo = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLObrigatorioNome = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(580, 380));
        setMinimumSize(new java.awt.Dimension(580, 380));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(580, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario.setText("Processo Seletivo");
        getContentPane().add(jlNomeUsuario);
        jlNomeUsuario.setBounds(170, 150, 150, 20);

        txtProcessoSeletivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProcessoSeletivo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));
        txtProcessoSeletivo.setMaximumSize(new java.awt.Dimension(8, 200));
        txtProcessoSeletivo.setMinimumSize(new java.awt.Dimension(8, 200));
        txtProcessoSeletivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcessoSeletivoActionPerformed(evt);
            }
        });
        txtProcessoSeletivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProcessoSeletivoKeyPressed(evt);
            }
        });
        getContentPane().add(txtProcessoSeletivo);
        txtProcessoSeletivo.setBounds(170, 170, 240, 30);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/return.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(10, 300, 90, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/search.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(250, 300, 99, 70);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(360, 300, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/clean.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(150, 300, 80, 70);

        jLObrigatorioNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome.setText("*");
        getContentPane().add(jLObrigatorioNome);
        jLObrigatorioNome.setBounds(400, 160, 10, 10);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(480, 300, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/cad_proc_selet.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));
        jLabel6.setMaximumSize(new java.awt.Dimension(580, 380));
        jLabel6.setMinimumSize(new java.awt.Dimension(580, 380));
        jLabel6.setPreferredSize(new java.awt.Dimension(580, 380));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 580, 380);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<ProcessoSeletivo> lista;
        lista = (processoSeletivoDAO.listar());
        ProcessoSeletivoTableModel itm = new ProcessoSeletivoTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Processo Seletivo");
        if (objetoRetorno != null) {
            processoSeletivo = processoSeletivoDAO.consultarObjetoId("idProcessoSeletivo", objetoRetorno);
            txtProcessoSeletivo.setText(processoSeletivo.getProcessoSeletivo());
            btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        processoSeletivoDAO.excluir(processoSeletivo);
        btLimparActionPerformed(null);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        processoSeletivo = new ProcessoSeletivo();
        txtProcessoSeletivo.setEnabled(true);

    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (txtProcessoSeletivo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            processoSeletivo.setProcessoSeletivo(txtProcessoSeletivo.getText());
            processoSeletivoDAO.salvar(processoSeletivo);
            btLimparActionPerformed(null);

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtProcessoSeletivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcessoSeletivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcessoSeletivoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtProcessoSeletivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcessoSeletivoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtProcessoSeletivoKeyPressed

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
            java.util.logging.Logger.getLogger(CadastroProcessoSeletivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProcessoSeletivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProcessoSeletivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProcessoSeletivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroProcessoSeletivo dialog = new CadastroProcessoSeletivo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLObrigatorioNome;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JTextField txtProcessoSeletivo;
    // End of variables declaration//GEN-END:variables
}