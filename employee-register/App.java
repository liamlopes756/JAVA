
/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args){
        //String nome = "ze";
        //double salario = 1000;
        
        // cria scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva o nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe o salario:");
        double salario = sc.nextDouble();
        System.out.println("\n");
        
        Funcionario empregado = new Funcionario(nome, salario);
        
        double bonus = empregado.calcularBonus();
        double recebimento = empregado.calcularRecebimento();
        
        empregado.exibirInfo();
        
    }
}