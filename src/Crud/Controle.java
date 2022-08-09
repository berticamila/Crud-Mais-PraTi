/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;

import Model.Aluno;
import Model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Controle {

    String nome;
    String telefone;
    String dataNascimento;
    double notaFinal;

    Pessoa novaPessoa = new Pessoa();
    Aluno novoAluno = new Aluno();

    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();;
    ArrayList<Aluno> listaDeAlunos =  new ArrayList<>();


    public void inserirPessoa(Pessoa novaPessoa) {
        listaDePessoas.add(novaPessoa);
    }

    public void inserirAluno(Aluno novoAluno) {
        listaDeAlunos.add(novoAluno);
    }

    public void listarPessoa() {
        System.out.println("Lista de Pessoas:");

        int i = 1;
        for (Pessoa pessoaNaLista : listaDePessoas) {
            System.out.print(i + "-");
            System.out.println(pessoaNaLista);
            i++;
        }
    }

    public void listarAluno() {
        System.out.println("Lista de Alunos:");

        int i = 1;
        for (Aluno alunoNaLista : listaDeAlunos) {
            System.out.print(i + "-");
            System.out.println(alunoNaLista);
            i++;

        }
    }
}
