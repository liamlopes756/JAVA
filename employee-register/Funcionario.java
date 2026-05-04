
/**
 * Escreva uma descrição da classe Funcionario aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Funcionario
{
    private String nome;
    private double salario;
    
    // metodo construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    // calcular bonus
    // calcular recebimento
    // exibir info
    
    public double calcularBonus(){
        double bonus = this.salario * 0.075;
        return bonus;
    } 
    
    public double calcularRecebimento(){
        double recebimento = this.salario + calcularBonus();
        return recebimento;
    }
    
    public void exibirInfo(){
        System.out.println("nome: " + nome +
                           "\nsalario " + salario +
                           "\nrecebimento " + calcularRecebimento());
    } 
    
}