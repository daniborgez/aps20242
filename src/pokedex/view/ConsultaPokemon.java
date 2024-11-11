/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokedex.view;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pokedex.controller.PokemonController;
import pokedex.model.Pokemon;

public class ConsultaPokemon extends javax.swing.JFrame {

    private TelaRegistrar telaRegistrar;

    public ConsultaPokemon() {
        initComponents();
    }
    public ConsultaPokemon(TelaRegistrar telaRegistrar){
        this.telaRegistrar = telaRegistrar; 
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultaPokemon = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldTituloPokemon = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaPokemon = new javax.swing.JTable();
        jLabelConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("POKEDEX CONSULTA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_janela(evt);
            }
        });

        jPanelConsultaPokemon.setBackground(new java.awt.Color(0, 51, 255));
        jPanelConsultaPokemon.setForeground(new java.awt.Color(0, 51, 204));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Informe o nome do pokemon:");

        jTextFieldTituloPokemon.setToolTipText("Informe o pokémon que deseja");

        jButtonConsultar.setBackground(new java.awt.Color(0, 0, 204));
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1490820806-11_82396.png"))); // NOI18N
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_pokemon(evt);
            }
        });

        jTableConsultaPokemon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome:", "Categoria:", "Descrição", "Habitat", "Cor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaPokemon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaPokemonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaPokemon);

        javax.swing.GroupLayout jPanelConsultaPokemonLayout = new javax.swing.GroupLayout(jPanelConsultaPokemon);
        jPanelConsultaPokemon.setLayout(jPanelConsultaPokemonLayout);
        jPanelConsultaPokemonLayout.setHorizontalGroup(
            jPanelConsultaPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaPokemonLayout.createSequentialGroup()
                .addGroup(jPanelConsultaPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaPokemonLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTituloPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultaPokemonLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelConsultaPokemonLayout.setVerticalGroup(
            jPanelConsultaPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaPokemonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelConsultaPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelConsultaPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTitulo)
                        .addComponent(jTextFieldTituloPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabelConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngegg03.png"))); // NOI18N
        jLabelConsulta.setText("CONSULTA POKÉMON:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabelConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelConsulta)
                .addGap(18, 18, 18)
                .addComponent(jPanelConsultaPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultar_pokemon(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_pokemon
        // TODO add your handling code here:
        String nome = jTextFieldTituloPokemon.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaPokemon.getModel(); //isntancia do modelo usado para add dados.
        tableModel.setRowCount(0); // comecar contagem de linhas como zero
        PokemonController pokemonController = new PokemonController();
        try {
            ArrayList<Pokemon>pokemons = pokemonController.listarPokemon(nome); //criado o arraylist
            pokemons.forEach((Pokemon pokemon)-> {
                tableModel.addRow(new Object[] {pokemon.getId_pokemon(),
                                                pokemon.getNome(),
                                                pokemon.getCategoria(),              //mapeando item por item para inserir na tabela
                                                pokemon.getDescricao(),              //criar objeto com inf de cada campo
                                                pokemon.getHabitat(),
                                                pokemon.getCor()});
                });
                jTableConsultaPokemon.setModel(tableModel); //setar o novo modelo 
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }//GEN-LAST:event_consultar_pokemon

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        // TODO add your handling code here:
        this.dispose();
        this.telaRegistrar.setVisible(true);
    }//GEN-LAST:event_fechar_janela

    private void jTableConsultaPokemonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaPokemonMouseClicked
       if(evt.getClickCount()==2){
        Integer id_Pokemon = (Integer) jTableConsultaPokemon.getModel().getValueAt(jTableConsultaPokemon.getSelectedRow(),0);
        String nome = (String) jTableConsultaPokemon.getModel().getValueAt(jTableConsultaPokemon.getSelectedRow(),1);
        String cateogria = (String) jTableConsultaPokemon.getModel().getValueAt(jTableConsultaPokemon.getSelectedRow(),2);
        String descricao = (String) jTableConsultaPokemon.getModel().getValueAt(jTableConsultaPokemon.getSelectedRow(),3);
        String habitat = (String) jTableConsultaPokemon.getModel().getValueAt(jTableConsultaPokemon.getSelectedRow(),4);
        String cor = (String) jTableConsultaPokemon.getModel().getValueAt(jTableConsultaPokemon.getSelectedRow(),5);
        
        this.telaRegistrar.buscarPokemon(id_Pokemon, nome, cateogria, descricao, habitat, cor);
        this.telaRegistrar.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jTableConsultaPokemonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsultaPokemon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaPokemon;
    private javax.swing.JTextField jTextFieldTituloPokemon;
    // End of variables declaration//GEN-END:variables
}
