/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriella
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String dtAniversario;
    private String endereco;
    private String numContato;

    public Cliente(String nome, String sobrenome, String dtAniversario, String endereco, String numContato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtAniversario = dtAniversario;
        this.endereco = endereco;
        this.numContato = numContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDtAniversario() {
        return dtAniversario;
    }

    public void setDtAniversario(String dtAniversario) {
        this.dtAniversario = dtAniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumContato() {
        return numContato;
    }

    public void setNumContato(String numContato) {
        this.numContato = numContato;
    }
    
}
