
package pokedex.view;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarraPrincipal = new javax.swing.JMenuBar();
        jMenuPokedex = new javax.swing.JMenu();
        jPokemon = new javax.swing.JMenu();
        jMenuRegistrar = new javax.swing.JMenu();
        jMenuCategoria = new javax.swing.JMenu();
        jSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POKEDEX");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uma-nova-jornada-pokemon-7722700-15012017233901.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        jMenuPokedex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pokemon-Symbol-logo01.png"))); // NOI18N
        jMenuPokedex.setText("Pokedex");
        jMenuBarraPrincipal.add(jMenuPokedex);

        jPokemon.setText("Pokémon");

        jMenuRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18898701.png"))); // NOI18N
        jMenuRegistrar.setText("Registrar");
        jMenuRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRegistrarMouseClicked(evt);
            }
        });
        jMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_Registrar(evt);
            }
        });
        jPokemon.add(jMenuRegistrar);

        jMenuCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/00f634b49c02e8ecae1aa6825b122cfa01.png"))); // NOI18N
        jMenuCategoria.setText("Por categoria");
        jMenuCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicarCategoria(evt);
            }
        });
        jMenuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCategoria(evt);
            }
        });
        jPokemon.add(jMenuCategoria);

        jMenuBarraPrincipal.add(jPokemon);

        jSair.setText("Sair");
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jMenuBarraPrincipal.add(jSair);

        setJMenuBar(jMenuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRegistrarMouseClicked
        // TODO add your handling code here:
        TelaRegistrar telaRegistrar = new TelaRegistrar(); 
       telaRegistrar.setVisible(true); 
        
    }//GEN-LAST:event_jMenuRegistrarMouseClicked

    private void entrar_Registrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_Registrar
      
    }//GEN-LAST:event_entrar_Registrar

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSairActionPerformed

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSairMouseClicked

    private void abrirCategoria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCategoria
    
    }//GEN-LAST:event_abrirCategoria

    private void clicarCategoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicarCategoria

        ConsultaCategoria consultaCategoria  = new ConsultaCategoria(this);
        this.setVisible(false);
        consultaCategoria.setVisible(true); 
    }//GEN-LAST:event_clicarCategoria

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarraPrincipal;
    private javax.swing.JMenu jMenuCategoria;
    private javax.swing.JMenu jMenuPokedex;
    private javax.swing.JMenu jMenuRegistrar;
    private javax.swing.JPanel jPanelTelaPrincipal;
    private javax.swing.JMenu jPokemon;
    private javax.swing.JMenu jSair;
    // End of variables declaration//GEN-END:variables
}
