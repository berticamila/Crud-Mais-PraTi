/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Aluno extends Pessoa {

    public double notaFinal;

    public Aluno() {

    }

    public Aluno(String nome, String telefone, String dataNascimento, double notaFinal, LocalDate dataCadastro, LocalDate dataAlteracao) {
        super(nome, telefone, dataNascimento, dataCadastro, dataAlteracao);
        this.notaFinal = notaFinal;

    }

    public double getnotaFinal() {
        return notaFinal;
    }

    public void setnotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String toString() {
        return "Nome:" + this.getNome() + ", " + "Telefone:" + this.getTelefone() + ", " + "Data de nascimento:" + this.getDataNascimento() + ", " + "Nota final:" + notaFinal + ", " + "Data de cadastro:" + formatador.format(this.getDataCadastro()) + ", " + "Data da Última alteração:" + formatador.format(this.getDataAlteracao());
    }

}
