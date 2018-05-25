/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.telas;

import atena.usuario.Usuario;
import atena.usuario.UsuarioDAO;

/**
 *
 * @author Karlos Oliveira
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public MenuPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jlUsuario.setText(usuario.getLoginUsuario());
        //jlPermissao.setText(usuario.getTipoDeAcessoUsuario());
//        if (!usuario.getTipoDeAcessoUsuario().equalsIgnoreCase("administrador")) {
//            permissao();
//        }else{
//            menuDespesas.setVisible(false);
//        }

    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLogout = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jlNome3 = new javax.swing.JLabel();
        jlHome = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        subCadCurso = new javax.swing.JMenuItem();
        subCadProcessoSeletivo = new javax.swing.JMenuItem();
        subCadGabarito = new javax.swing.JMenuItem();
        subCadRespostas = new javax.swing.JMenuItem();
        subUsuario = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        subCadCurso1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 547));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 547));
        getContentPane().setLayout(null);

        btLogout.setFont(new java.awt.Font("Bebas Neue", 1, 32)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/logoff.png"))); // NOI18N
        btLogout.setText("Sair");
        btLogout.setToolTipText("Sair");
        btLogout.setContentAreaFilled(false);
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(810, 330, 90, 110);

        jlUsuario.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jlUsuario.setText("???");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(370, 400, 380, 40);

        jlNome3.setFont(new java.awt.Font("Bebas Neue", 0, 28)); // NOI18N
        jlNome3.setText("USUÁRIO:");
        getContentPane().add(jlNome3);
        jlNome3.setBounds(290, 400, 100, 40);

        jlHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/home2.png"))); // NOI18N
        jlHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));
        getContentPane().add(jlHome);
        jlHome.setBounds(0, 0, 900, 450);

        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu.setForeground(new java.awt.Color(51, 204, 0));
        jMenu.setBorderPainted(false);
        jMenu.setMaximumSize(new java.awt.Dimension(900, 200));
        jMenu.setMinimumSize(new java.awt.Dimension(900, 200));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_65x65.png"))); // NOI18N
        menuCadastros.setText("Cadastro");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuCadastros.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCadastros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subCadCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_15x15.png"))); // NOI18N
        subCadCurso.setText("Curso");
        subCadCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadCursoActionPerformed(evt);
            }
        });
        menuCadastros.add(subCadCurso);

        subCadProcessoSeletivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_15x15.png"))); // NOI18N
        subCadProcessoSeletivo.setText("Processo Seletivo");
        subCadProcessoSeletivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCadProcessoSeletivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadProcessoSeletivoActionPerformed(evt);
            }
        });
        menuCadastros.add(subCadProcessoSeletivo);

        subCadGabarito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_15x15.png"))); // NOI18N
        subCadGabarito.setText("Gabarito");
        subCadGabarito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCadGabarito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadGabaritoActionPerformed(evt);
            }
        });
        menuCadastros.add(subCadGabarito);

        subCadRespostas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_15x15.png"))); // NOI18N
        subCadRespostas.setText("Respostas");
        subCadRespostas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCadRespostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadRespostasActionPerformed(evt);
            }
        });
        menuCadastros.add(subCadRespostas);

        subUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_15x15.png"))); // NOI18N
        subUsuario.setText("Usuário");
        subUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuarioActionPerformed(evt);
            }
        });
        menuCadastros.add(subUsuario);

        jMenu.add(menuCadastros);

        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/relatorio.png"))); // NOI18N
        menuRelatorio.setText("Relatórios");
        menuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuRelatorio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });

        subCadCurso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atena/imagens/add_15x15.png"))); // NOI18N
        subCadCurso1.setText("Resultados");
        subCadCurso1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCadCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadCurso1ActionPerformed(evt);
            }
        });
        menuRelatorio.add(subCadCurso1);

        jMenu.add(menuRelatorio);

        setJMenuBar(jMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        TelaAutenticacao telaAutenticar = new TelaAutenticacao();
        telaAutenticar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void subCadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadCursoActionPerformed
        //CadastroCurso cadastroCurso = new CadastroCurso(null, rootPaneCheckingEnabled);
        CadastroCurso cadastroCurso = new CadastroCurso();
        cadastroCurso.setVisible(true);
    }//GEN-LAST:event_subCadCursoActionPerformed

    private void subUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuarioActionPerformed
        CadastroUsuario cadUsuario = new CadastroUsuario(null, rootPaneCheckingEnabled);
        cadUsuario.setVisible(true);
    }//GEN-LAST:event_subUsuarioActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        
    }//GEN-LAST:event_menuRelatorioActionPerformed

    private void subCadGabaritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadGabaritoActionPerformed
        CadastroGabarito cadastroGabarito = new CadastroGabarito(null, rootPaneCheckingEnabled);
        cadastroGabarito.setVisible(true);
    }//GEN-LAST:event_subCadGabaritoActionPerformed

    private void subCadRespostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadRespostasActionPerformed
        CadastroRespostas cadastroRespostas = new CadastroRespostas(null, rootPaneCheckingEnabled);
        cadastroRespostas.setVisible(true);
    }//GEN-LAST:event_subCadRespostasActionPerformed

    private void subCadProcessoSeletivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadProcessoSeletivoActionPerformed
        CadastroProcessoSeletivo cadastroProcessoSeletivo = new CadastroProcessoSeletivo(null, rootPaneCheckingEnabled);
        cadastroProcessoSeletivo.setVisible(true);
    }//GEN-LAST:event_subCadProcessoSeletivoActionPerformed

    private void subCadCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadCurso1ActionPerformed
        RelatorioGeral relatorioGeral = new RelatorioGeral(null, rootPaneCheckingEnabled);
        relatorioGeral.setVisible(true);
    }//GEN-LAST:event_subCadCurso1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem subCadCurso;
    private javax.swing.JMenuItem subCadCurso1;
    private javax.swing.JMenuItem subCadGabarito;
    private javax.swing.JMenuItem subCadProcessoSeletivo;
    private javax.swing.JMenuItem subCadRespostas;
    private javax.swing.JMenuItem subUsuario;
    // End of variables declaration//GEN-END:variables
}
