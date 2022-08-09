/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;

import Model.Aluno;
import Model.Pessoa;
import Util.Menu;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Crud {

    public void iniciar() throws InterruptedException {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        String nome, telefone, dataNascimento;
        String haNotaFinal;
        double notaFinal = 0;
        LocalDate dataCadastro;
        LocalDate dataAlteracao;

        Pessoa novaPessoa = new Pessoa();
        Aluno novoAluno = new Aluno();
        Controle controle = new Controle();
        boolean continua = true;

        do {

            try {
                Menu.opcao();

                opcao = entrada.nextInt();

                entrada.nextLine();

                switch (opcao) {

                    case 1:

                        System.out.println("Nome: ");
                        nome = entrada.nextLine();
                        System.out.println("Telefone: ");
                        telefone = entrada.nextLine();
                        System.out.println("Data de nascimento: ");
                        dataNascimento = entrada.nextLine();
                        System.out.println("Se houver nota final digite s se não digite n ");
                        haNotaFinal = entrada.nextLine();
                        if (haNotaFinal.equals("s")) {
                            System.out.println("Nota final ");
                            String nf = entrada.nextLine();
                            notaFinal = Double.parseDouble(nf);

                        }

                        dataCadastro = LocalDate.now();
                        dataAlteracao = LocalDate.now();

                        novoAluno = new Aluno(nome, telefone, dataNascimento, notaFinal, dataCadastro, dataAlteracao);
                        novaPessoa = new Pessoa(nome, telefone, dataNascimento, dataCadastro, dataAlteracao);

                        if (haNotaFinal.equals("s")) {

                            controle.inserirAluno(novoAluno);
                        } else {
                            controle.inserirPessoa(novaPessoa);
                        }

                    case 2:

                        controle.listarAluno();
                        controle.listarPessoa();
                        break;

                    case 3:

                        controle.listarAluno();
                        controle.listarPessoa();

                        System.out.println("Você quer alterar aluno ou pessoa? ");
                        String alterar = entrada.next();

                        if (("aluno".equals(alterar)) || ("Aluno".equals(alterar))) {
                            controle.listarAluno();
                        } else if (("pessoa".equals(alterar)) || ("Pessoa".equals(alterar))) {
                            controle.listarPessoa();
                        } else {
                            opcao = 3;
                        }

                        System.out.println("Informe com base na numeração, qual individuo você deseja alterar: ");
                        int mudarNumero = entrada.nextInt();
                        entrada.nextLine();
                        if ("aluno".equals(alterar)) {
                            Aluno aluno = controle.listaDeAlunos.get(mudarNumero - 1);
                            Menu.mudarAluno();
                            int alterarOpcao = entrada.nextInt();
                            entrada.nextLine();

                            switch (alterarOpcao) {
                                case 1:
                                    System.out.println("Nome: ");
                                    nome = entrada.nextLine();
                                    aluno.setNome(nome);
                                    break;
                                case 2:
                                    System.out.println("Telefone: ");
                                    telefone = entrada.nextLine();
                                    aluno.setTelefone(telefone);
                                    break;
                                case 3:
                                    System.out.println("Data de nascimento: ");
                                    dataNascimento = entrada.nextLine();
                                    aluno.setDataNascimento(dataNascimento);
                                    break;
                                case 4:
                                    System.out.println("Nota final: ");
                                    String nf = entrada.nextLine();
                                    notaFinal = Double.parseDouble(nf);
                                    aluno.setnotaFinal(notaFinal);
                                    break;
                                default:
                                    System.out.println("Informação inválida");
                                    break;
                            }
                        } else if ("pessoa".equals(alterar)) {
                            Pessoa pessoa = controle.listaDePessoas.get(mudarNumero - 1);
                            Menu.mudarPessoa();
                            int alterarOpcao = entrada.nextInt();
                            entrada.nextLine();
                            switch (alterarOpcao) {
                                case 1:
                                    System.out.println("Nome: ");
                                    nome = entrada.nextLine();
                                    pessoa.setNome(nome);
                                    break;
                                case 2:
                                    System.out.println("Telefone: ");
                                    telefone = entrada.nextLine();
                                    pessoa.setTelefone(telefone);
                                    break;
                                case 3:
                                    System.out.println("Data de nascimento: ");
                                    dataNascimento = entrada.nextLine();
                                    pessoa.setDataNascimento(dataNascimento);
                                    break;
                                default:
                                    System.out.println("Informação inválida");
                                    break;
                            }
                        }

                        break;

                    case 4:

                        controle.listarAluno();
                        controle.listarPessoa();

                        System.out.println("Você quer excluir um aluno ou pessoa? ");
                        String apagar = entrada.next();

                        if (("aluno".equals(apagar)) || ("Aluno".equals(apagar))) {
                            controle.listarAluno();
                        } else if (("pessoa".equals(apagar)) || ("Pessoa".equals(apagar)) || ("PESSOA".equals(apagar))) {
                            controle.listarPessoa();
                        }
                        System.out.println("Informe com base na numeração, qual Aluno ou Pessoa você quer excluir: ");
                        int apagarNumero = entrada.nextInt();
                        entrada.nextLine();

                        if (("aluno".equals(apagar)) || ("Aluno".equals(apagar))) {
                            controle.listaDeAlunos.remove(apagarNumero - 1);
                        } else if (("pessoa".equals(apagar)) || ("Pessoa".equals(apagar))) {
                            controle.listaDePessoas.remove(apagarNumero - 1);
                        }
                        break;
                    case 5:
                        System.out.println("Seu programa está sendo encerrado!");
                        continua = false;
                        break;

                    default:
                        System.out.println("Opção inválida");
                        System.out.println("Tente novamente");
                        break;
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Opção inválida, verifique o número digitado ou se a pessoa ou aluno existe");
            } finally {
                Thread.sleep(2000);
            }
        } while (continua);
    }
}
