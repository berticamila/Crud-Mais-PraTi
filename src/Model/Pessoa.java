/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Pessoa {

    protected String nome;
    protected String telefone;
    protected String dataNascimento;
    protected LocalDate dataCadastro;
    protected LocalDate dataAlteracao;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pessoa(String nome, String telefone, String dataNascimento, LocalDate dataCadastro, LocalDate dataAlteracao) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.dataAlteracao = dataAlteracao;

    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String toString() {
        return "Nome:" + getNome() + ", " + "Telefone:" + getTelefone() + ", " + "Data de nascimento:" + getDataNascimento() + ", " + "Data de cadastro:" + formatador.format(getDataCadastro()) + ", " + "Data da Última alteração:" + ", " + formatador.format(getDataAlteracao());

    }

}
