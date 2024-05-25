/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhorecup;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Emprestimo;
import modelo.Livro;

/**
 *
 * @author Gabriella
 */
public class FrameEmprestimos extends javax.swing.JFrame {
private DefaultTableModel modeloTabela;
private ArrayList<Livro> livros;
private ArrayList<Cliente> clientes;
private ArrayList<Emprestimo> emprestimos;
    /**
     * Creates new form FrameEmprestimos
     */
    public FrameEmprestimos() {
        initComponents();
        this.livros = livros;
        this.clientes = clientes;
        this.emprestimos = new ArrayList<>();
    }
    public void voltarPrincipal(){
        FramePrincipal principal = new FramePrincipal();
        principal.setLocationRelativeTo(this);
        principal.setVisible(true);
        this.dispose(); 
    }
    public void emprestimoRealizado(){
        String tituloLivro = tfTitulo.getText();
        String nomeCliente = tfNomeCliente.getText();
        int diaEmprestimo;
        String mesAnoEmprestimo = tfMesAno.getText();
        
        try {
            diaEmprestimo = Integer.parseInt(tfDiaEmprestimo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dia do Empréstimo deve ser um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tituloLivro.isEmpty() || nomeCliente.isEmpty() || tfDiaEmprestimo.getText().isEmpty() || mesAnoEmprestimo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Livro livroEmprestado = livros.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(tituloLivro))
                .findFirst()
                .orElse(null);

        if (livroEmprestado == null) {
            JOptionPane.showMessageDialog(this, "Livro não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (livroEmprestado.getExemplaresDisponiveis() == 0) {
            JOptionPane.showMessageDialog(this, "Não há exemplares disponíveis deste livro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente clienteEmprestimo = clientes.stream()
                .filter(cliente -> cliente.getNome().equalsIgnoreCase(nomeCliente))
                .findFirst()
                .orElse(null);

        if (clienteEmprestimo == null) {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Emprestimo emprestimo = new Emprestimo(livroEmprestado, clienteEmprestimo, diaEmprestimo);
        emprestimos.add(emprestimo);
        livroEmprestado.setExemplaresDisponiveis(livroEmprestado.getExemplaresDisponiveis() - 1);
        modeloTabela.addRow(new Object[]{tituloLivro, nomeCliente, diaEmprestimo, mesAnoEmprestimo});
        JOptionPane.showMessageDialog(this, "Empréstimo registrado com sucesso para o cliente " + nomeCliente + "!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDiaEmprestimo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMesAno = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmprestimos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Emprestimo de Livros");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("Titulo:");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Nome Cliente");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Dia do Emprestimo:");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel5.setText("Mês e Ano do Emprestimo:");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        tbEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbEmprestimos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDiaEmprestimo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btCancelar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(tfMesAno)
                                        .addComponent(tfNomeCliente)))
                                .addGap(0, 25, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDiaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMesAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        emprestimoRealizado();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        voltarPrincipal();
    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEmprestimos;
    private javax.swing.JTextField tfDiaEmprestimo;
    private javax.swing.JTextField tfMesAno;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
