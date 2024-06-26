/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhorecup;

/**
 *
 * @author Gabriella
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
         setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        miCadastroLivro = new javax.swing.JMenuItem();
        miCadastroClientes = new javax.swing.JMenuItem();
        miEmprestimoLivros = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(102, 0, 0));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Bem Vindo a Biblioteca Olimpus");

        lbSubtitulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("Selecione o que deseja para continuarmos");

        jMenu3.setText("Entrar");
        jMenu3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        miCadastroLivro.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        miCadastroLivro.setText("Cadastro Livros");
        miCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroLivroActionPerformed(evt);
            }
        });
        jMenu3.add(miCadastroLivro);

        miCadastroClientes.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        miCadastroClientes.setText("Cadastro Clientes");
        miCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroClientesActionPerformed(evt);
            }
        });
        jMenu3.add(miCadastroClientes);

        miEmprestimoLivros.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        miEmprestimoLivros.setText("Emprestimo Livros");
        miEmprestimoLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmprestimoLivrosActionPerformed(evt);
            }
        });
        jMenu3.add(miEmprestimoLivros);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenu4.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lbSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbSubtitulo)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroLivroActionPerformed
        FrameCadastroLivros cadLivros = new FrameCadastroLivros();
        cadLivros.setLocationRelativeTo(this);
        cadLivros.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_miCadastroLivroActionPerformed

    private void miCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroClientesActionPerformed
        FrameCadastroCliente cadCliente = new FrameCadastroCliente();
        cadCliente.setLocationRelativeTo(this);
        cadCliente.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_miCadastroClientesActionPerformed

    private void miEmprestimoLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmprestimoLivrosActionPerformed
        FrameEmprestimos emprestimo = new FrameEmprestimos();
        emprestimo.setLocationRelativeTo(this);
        emprestimo.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_miEmprestimoLivrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuItem miCadastroClientes;
    private javax.swing.JMenuItem miCadastroLivro;
    private javax.swing.JMenuItem miEmprestimoLivros;
    // End of variables declaration//GEN-END:variables
}
