/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author User
 */
public class Menu {

    public static void opcao() {
        System.out.println("--------------------------------------------------------");
        System.out.println("   DIGITE O NÚMERO DE QUAL OPERAÇÃO DESEJA EFETUAR      ");
        System.out.println("--------------------------------------------------------");
        System.out.println("             1 - Cadastrar Pessoa ou Aluno               ");
        System.out.println("             2 - Listar                                  ");
        System.out.println("             3 - Atualizar dados                         ");
        System.out.println("             4 - Excluir                                 ");
        System.out.println("             5 - Encerrar programa                       ");
        System.out.println("---------------------------------------------------------");
    }

    public static void mudarAluno() {
        System.out.println("Com base na numeração, qual propriedade deseja alterar: ");
        System.out.println("----------------------------------");
        System.out.println("  1 - Alterar nome                ");
        System.out.println("  2 - Alterar telefone            ");
        System.out.println("  3 - Alterar data de nascimento  ");
        System.out.println("  4 - Alterar nota final          ");
        System.out.println("----------------------------------");

    }

    public static void mudarPessoa() {
        System.out.println("Com base na numeração, qual propriedade deseja alterar: ");
        System.out.println("---------------------------------");
        System.out.println(" 1 - Alterar nome                ");
        System.out.println(" 2 - Alterar telefone            ");
        System.out.println(" 3 - Alterar data de nascimento  ");
        System.out.println("---------------------------------");
    }
}
