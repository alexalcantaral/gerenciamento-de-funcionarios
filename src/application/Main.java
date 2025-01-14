package application;

import entities.Empresa;
import entities.Funcionario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome da empresa: ");
        String nomeEmpresa = sc.nextLine();
        System.out.println();

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Empresa empresa = new Empresa(funcionarios, nomeEmpresa);

        int opcao;
        do{
            System.out.println("---------------MENU---------------");
            System.out.println("1 - Adicionar funcionário\n2 - Remover funcionário\n3 - Buscar funcionário\n4 - Mostrar todos os funcionários\n5 - Sair");
            System.out.println("----------------------------------");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    Funcionario funcionario = new Funcionario(id, nome, 1518.00); //Deixei definido um salário minimo como o salário inicial de um funcionário.
                    empresa.adicionarFuncionario(funcionario);
                    break;
                case 2:
                    System.out.print("ID para remover: ");
                    int idRemover = sc.nextInt();
                    empresa.removerFuncionario(idRemover);
                    ;break;
                case 3:
                    System.out.print("ID para buscar funcionário: ");
                    int idBuscar = sc.nextInt();
                    empresa.buscarFuncionario(idBuscar);
                    ;break;
                case 4:
                    empresa.exibirFuncionarios();
                    ;break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Não existe essa opção!");
            }
        }while(opcao != 5);

        sc.close();
    }
}