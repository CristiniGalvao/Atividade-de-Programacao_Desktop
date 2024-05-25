/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhorecup;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author Gabriella
 */
public class FrameCadastroCliente extends javax.swing.JFrame {
private DefaultTableModel modeloTabela;
private ArrayList<Cliente> clientes = new ArrayList<>();

    public FrameCadastroCliente() {
        initComponents();
        setLocationRelativeTo(this);
        modeloTabela = new DefaultTableModel(new String[]{"Nome", "Sobrenome", "Data Aniversario", "Endereço", "Numero para Contato"}, 0);
        tbClientes.setModel(modeloTabela);
    }
     public void cadastrarCliente(){
        String nome = tfNome.getText();
        String sobrenome = tfSobrenome.getText();
        String dtAniversario = tfDtAniversario.getText();
        String endereco = tfEndereco.getText();
        String numContato = tfNumContato.getText();
        if (nome.isEmpty() || sobrenome.isEmpty() || dtAniversario.isEmpty() || endereco.isEmpty() || numContato.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!dtAniversario.matches("[0-9/]+")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira apenas números na data de aniversário.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!numContato.matches("[0-9/]+")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira apenas números no Numero para Contato.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        modeloTabela.addRow(new Object[]{nome, sobrenome, dtAniversario, endereco, numContato});
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
            tfNome.setText("");
            tfSobrenome.setText("");
            tfDtAniversario.setText("");
            tfEndereco.setText("");
            tfNumContato.setText("");
            
        clientes.add(new Cliente(nome, sobrenome, dtAniversario, endereco, numContato));
    }
    public void voltarPrincipal(){
        FramePrincipal principal = new FramePrincipal();
        principal.setLocationRelativeTo(this);
        principal.setVisible(true);
        this.dispose(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbSobrenome = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbNumContato = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tfDtAniversario = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        tfNumContato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Clientes");

        lbNome.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbSobrenome.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lbSobrenome.setText("Sobrenome:");

        lbIdade.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lbIdade.setText("Data Aniversario:");

        lbEndereco.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        lbEndereco.setText("Endereço:");

        lbNumContato.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lbNumContato.setText("Numero de Contato:");

        tfNome.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfSobrenome.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N

        tfEndereco.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N

        btCadastrar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        tfDtAniversario.setText("DD/MM/AAAA");
        tfDtAniversario.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tfDtAniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDtAniversarioActionPerformed(evt);
            }
        });

        tbClientes.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tfNumContato.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbIdade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDtAniversario, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbSobrenome)
                                    .addComponent(tfSobrenome)
                                    .addComponent(lbEndereco)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumContato)
                            .addComponent(tfNumContato, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(lbSobrenome))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdade)
                    .addComponent(lbEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDtAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNumContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarCliente();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       voltarPrincipal();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfDtAniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDtAniversarioActionPerformed
        
        try {
            javax.swing.text.MaskFormatter maskFormatter = new javax.swing.text.MaskFormatter("##/##/####");
            maskFormatter.setPlaceholderCharacter('/'); 
            tfDtAniversario = new javax.swing.JFormattedTextField(maskFormatter);
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_tfDtAniversarioActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumContato;
    private javax.swing.JLabel lbSobrenome;
    private javax.swing.JTable tbClientes;
    private javax.swing.JFormattedTextField tfDtAniversario;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumContato;
    private javax.swing.JTextField tfSobrenome;
    // End of variables declaration//GEN-END:variables
}
