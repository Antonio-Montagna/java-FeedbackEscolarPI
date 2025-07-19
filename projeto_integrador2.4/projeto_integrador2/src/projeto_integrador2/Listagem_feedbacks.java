package projeto_integrador2;

import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Listagem_feedbacks extends javax.swing.JFrame {

    public Listagem_feedbacks() throws SQLException {
        initComponents();

        // Define as colunas da tabela
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Id", "Texto", "Anônimo", "Categoria", "Disciplina"}
        );
        tableFeedbacks.setModel(modelo);

        FeedbacksJDBC dao = new FeedbacksJDBC();
        List<Feedbacks> lista = dao.listarFeedbacks();
        montarTabelaFeedbacks(lista);

        // Define logo
        ImageIcon icon = new ImageIcon(getClass().getResource("/projeto_integrador2/imagem/logo.png"));
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), Image.SCALE_SMOOTH);
        jLabelLogo.setIcon(new ImageIcon(scaledImg));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        label_Cadastrar = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFeedbacks = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        label_Cadastrar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        label_Cadastrar.setText("LISTAGEM DE FEEDBACK");

        botaoVoltar.setBackground(new java.awt.Color(0, 102, 153));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        tableFeedbacks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableFeedbacks);

        botaoExcluir.setBackground(new java.awt.Color(0, 102, 153));
        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAtualizar.setBackground(new java.awt.Color(0, 102, 153));
        botaoAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        botaoAtualizar.setText("ATUALIZAR");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(label_Cadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar)
                        .addGap(143, 143, 143)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Cadastrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        Tela_principal tp = new Tela_principal();
        tp.setVisible(true);

        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int linhaSelecionada = tableFeedbacks.getSelectedRow();

        if (linhaSelecionada != -1) {
            int id = Integer.parseInt(tableFeedbacks.getValueAt(linhaSelecionada, 0).toString());

            int confirmacao = JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este feedback?", "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                try {
                    FeedbacksJDBC dao = new FeedbacksJDBC();
                    dao.excluir(id);
                    montarTabelaFeedbacks(dao.listarFeedbacks());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um feedback para excluir.");
        }


    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        int selectedRow = tableFeedbacks.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tableFeedbacks.getModel();
            int id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String texto = model.getValueAt(selectedRow, 1).toString();
            boolean anonimo = model.getValueAt(selectedRow, 2).toString().equalsIgnoreCase("Sim");
            String categoria = model.getValueAt(selectedRow, 3).toString();
            String disciplina = model.getValueAt(selectedRow, 4).toString();

            Feedbacks feedback = new Feedbacks();
            feedback.setId(id);
            feedback.setTexto(texto);
            feedback.setAnonimo(anonimo);
            feedback.setCategoria(categoria);
            feedback.setDisciplina(disciplina);

            new Tela_cadastro(feedback).setVisible(true);
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Listagem_feedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listagem_feedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listagem_feedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listagem_feedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Listagem_feedbacks().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Listagem_feedbacks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void montarTabelaFeedbacks(List<Feedbacks> lista) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tableFeedbacks.getModel();
        modelo.setRowCount(0); // Limpa as linhas da tabela

        FeedbacksJDBC jdbc = new FeedbacksJDBC();
        List<Feedbacks> list = jdbc.listarFeedbacks();

        for (Feedbacks f : lista) {
            String anonimoTexto = f.isAnonimo() ? "Sim" : "Não";
            modelo.addRow(new Object[]{
                f.getId(), // ID (inteiro)
                f.getTexto(), // Texto do feedback
                anonimoTexto, // "Sim" ou "Não"
                f.getCategoria(),
                f.getDisciplina()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Cadastrar;
    private javax.swing.JTable tableFeedbacks;
    // End of variables declaration//GEN-END:variables
}
